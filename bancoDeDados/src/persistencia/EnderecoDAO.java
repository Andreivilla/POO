package persistencia;

import dados.Endereco;
import exceptions.*;

import java.sql.*;

public class EnderecoDAO {

    private static EnderecoDAO instance=null;
    private static PreparedStatement selectNewId;
    private static PreparedStatement select;
    private static PreparedStatement insert;
    private static PreparedStatement delete;
    private static PreparedStatement update;

    public static EnderecoDAO getInstance() throws ClassNotFoundException, SQLException, SelectException {

        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('id_endereco')");
        if(instance == null){
            instance = new EnderecoDAO();
        }
            return instance;
    }

    private EnderecoDAO() throws ClassNotFoundException,SQLException, SelectException{
        Connection conexao=Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('id_endereco')");
        insert = conexao.prepareStatement("insert into endereco values(?,?,?,?,?)");
        select = conexao.prepareStatement("select ∗ from endereco where id_pessoa = ?");
        update = conexao.prepareStatement("update endereco set rua = ?,numero = ?, cidade = ? where id_pessoa = ?");
        delete = conexao.prepareStatement("delete from endereco where id_pessoa = ?");
        update = conexao.prepareStatement("update pessoa set nome = ?,cpf = ?,telefone= ? where id=?");
    }

    private int selectNewId() throws SelectException{
        try{
            ResultSet rs = selectNewId.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

    public void insert(Endereco endereco)throws InsertException, SelectException{
        try{
            insert.setInt(1, selectNewId());
            insert.setString(2, endereco.getRua());
            insert.setInt(3, endereco.getNumero());
            insert.setString(4, endereco.getCidade());
            insert.setInt(5, endereco.getIdPessoa());
            insert.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public Endereco select(int pessoa)throws SelectException{
        try{
            select.setInt(1,pessoa);
            ResultSet rs = select.executeQuery();
            if(rs.next()){
                int id=rs.getInt(1);
                String rua=rs.getString(2);
                int numero=rs.getInt(3);
                String cidade=rs.getString(4);
                return new Endereco(id, rua, numero, cidade);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void update(Endereco endereco) throws UpdateException{
        try{
            update.setString(1,endereco.getRua());
            update.setInt(2,endereco.getNumero());
            update.setString(3,endereco.getCidade());
            update.setInt(4,endereco.getIdPessoa());
            update.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(Endereco endereco) throws DeleteException{
        try{
            delete.setInt(1,endereco.getIdPessoa());
            delete.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
