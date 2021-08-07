package persistencia;


import dados.Semestre;
import exception.DeleteException;
import exception.InsertException;
import exception.SelectException;

import java.sql.*;

public class SemestreDAO {
    private static SemestreDAO instance = null;
    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;

    private SemestreDAO() throws  ClassNotFoundException, SQLException, SelectException {
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('seq_semestre')");
        insert = conexao.prepareStatement("insert into alunos values (?,?)");
        select = conexao.prepareStatement("select * from alunos where cpf = ?");
        update = conexao.prepareStatement("update alunos set cpf = ?, nome = ?, senha = ?");
        delete = conexao.prepareStatement("delete from alunos where cpf = ?");
    }

    public void insert(Semestre obj) throws InsertException, SelectException{
        try{
            insert.setInt(1, obj.getIdSemestre());
            insert.setString(2, obj.getNome());
            insert.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Semestre select(String id) throws SelectException{
        try{
            Semestre obj = new Semestre();
            select.setString(1, id);
            ResultSet rs = select.executeQuery();
            if(rs.next()){
                obj.setIdSemestre(rs.getInt(1));
                obj.setNome(rs.getString(2));
                return obj;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void delete(int id) throws DeleteException {
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
    private void update(Semestre obj){
        //update Pessoa set idpessoa = ?, nome = ?, idade = ?, where idpessoa = ?
        try {
            update.setInt(2, obj.getIdSemestre());
            update.setString(2, obj.getNome());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static SemestreDAO getInstance() throws ClassNotFoundException, SQLException, SelectException{
        if(instance == null){
            instance = new SemestreDAO();
        }
        return instance;
    }
}