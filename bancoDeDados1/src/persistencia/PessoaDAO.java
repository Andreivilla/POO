package persistencia;
import dados.Pessoa;
import exception.*;

import java.sql.*;

public class PessoaDAO {
    private static PessoaDAO instance = null;
    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;
    //coonstrutor
    private PessoaDAO() throws ClassNotFoundException, SQLException, SelectException{
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('idpessoa')");
        insert = conexao.prepareStatement("insert into Pessoa values (?,?,?)");
        select = conexao.prepareStatement("select * from Pessoa where idpessoa = ?");
        update = conexao.prepareStatement("update Pessoa set idpessoa = ?, nome = ?, idade = ?, where idpessoa = ?");
        delete = conexao.prepareStatement("delete from Pessoa where idpessoa = ?");
    }

    public static PessoaDAO getInstance() throws ClassNotFoundException, SQLException, SelectException {
        if(instance == null){
            instance = new PessoaDAO();
        }
        return instance;
    }

    public void insert(Pessoa pessoa) throws InsertException, SelectException{
        try{
            insert.setInt(1, pessoa.getIdPessoa());
            insert.setString(2, pessoa.getNome());
            insert.setInt(3, pessoa.getIdade());
            insert.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Pessoa select(int id) throws SelectException{
        try{
            Pessoa pessoa = new Pessoa();
            select.setInt(1, id);
            ResultSet rs = select.executeQuery();
            if(rs.next()){
                pessoa.setIdPessoa(rs.getInt(1));
                pessoa.setNome(rs.getString(2));
                pessoa.setIdade(rs.getInt(3));
                return pessoa;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void delete(int id) throws DeleteException{
        try{
            delete.setInt(1, id);
            delete.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private int selectNewId() throws SelectException{
        try {
            ResultSet rs = selectNewId.executeQuery();

            if(rs.next()) {
                return rs.getInt(1); //ordem da coluna do que quer retornar, começa em 1
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    private void update(Pessoa pessoa){
        //update Pessoa set idpessoa = ?, nome = ?, idade = ?, where idpessoa = ?
        try {
            update.setInt(1, pessoa.getIdPessoa());
            update.setString(2, pessoa.getNome());
            update.setInt(3, pessoa.getIdade());
            update.setInt(4, pessoa.getIdPessoa());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
