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
        select = conexao.prepareStatement("select * from alunos where cpf = ?");
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

    public static AlunoDAO getInstance() throws ClassNotFoundException, SQLException, SelectException{
        if(instance == null){
            instance = new AlunoDAO();
        }
        return instance;
    }
}
