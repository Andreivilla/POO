package persistencia;

import dados.Aluno;
import dados.Professor;
import exception.DeleteException;
import exception.InsertException;
import exception.SelectException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfessorDAO {
    private static ProfessorDAO instance = null;
    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;

    private ProfessorDAO() throws  ClassNotFoundException, SQLException, SelectException {
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('seq_professores')");
        select = conexao.prepareStatement("select * from professores where cpf = ?");
        update = conexao.prepareStatement("update professores set cpf = ?, nome = ?, senha = ?");
    }

    public Professor select(String id) throws SelectException{
        try{
            Professor obj = new Professor();
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

    private int selectNewId() throws SelectException{
        try {
            ResultSet rs = selectNewId.executeQuery();

            if(rs.next()) {
                return rs.getInt(1);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    private void update(Aluno obj){
        try {
            update.setString(2, obj.getCpf());
            update.setString(2, obj.getNome());
            update.setString(2, obj.getSenha());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static ProfessorDAO getInstance() throws ClassNotFoundException, SQLException, SelectException{
        if(instance == null){
            instance = new ProfessorDAO();
        }
        return instance;
    }
}
