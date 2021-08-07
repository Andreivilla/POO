package persistencia;

import dados.Aluno;
import exception.*;

import java.sql.*;

public class AlunoDAO {
    private static AlunoDAO instance = null;
    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;

    private AlunoDAO() throws  ClassNotFoundException, SQLException, SelectException{
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('seq_aluno')");
        insert = conexao.prepareStatement("insert into alunos values (?,?,?)");
        select = conexao.prepareStatement("select * from alunos where cpf = ?");
        update = conexao.prepareStatement("update alunos set cpf = ?, nome = ?, senha = ?");
        delete = conexao.prepareStatement("delete from alunos where cpf = ?");
    }

    public void insert(Aluno obj) throws InsertException, SelectException{
        try{
            insert.setString(1, obj.getCpf());
            insert.setString(2, obj.getNome());
            insert.setString(3, obj.getSenha());
            insert.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Aluno select(String id) throws SelectException{
        try{
            Aluno obj = new Aluno();
            select.setString(1, id);
            ResultSet rs = select.executeQuery();
            if(rs.next()){
                obj.setCpf(rs.getString(1));
                obj.setNome(rs.getString(2));
                obj.setSenha(rs.getString(3));
                return obj;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void delete(String id) throws DeleteException{
        try{
            delete.setString(1, id);
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
    private void update(Aluno obj){
        //update Pessoa set idpessoa = ?, nome = ?, idade = ?, where idpessoa = ?
        try {
            update.setString(2, obj.getCpf());
            update.setString(2, obj.getNome());
            update.setString(2, obj.getSenha());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static AlunoDAO getInstance() throws ClassNotFoundException, SQLException, SelectException{
        if(instance == null){
            instance = new AlunoDAO();
        }
        return instance;
    }
}
