package persistencia;


import dados.Relacao;
import dados.Semestre;
import exception.DeleteException;
import exception.InsertException;
import exception.SelectException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SemestreDAO {
    private static SemestreDAO instance = null;
    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;

    private PreparedStatement selectSemestres;

    private SemestreDAO() throws  ClassNotFoundException, SQLException, SelectException {
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('seq_semestre')");
        insert = conexao.prepareStatement("insert into alunos values (?,?)");
        update = conexao.prepareStatement("update alunos set idSemestre = ?, nome = ?");
        delete = conexao.prepareStatement("delete from alunos where idSemestre = ?");

        select = conexao.prepareStatement("select * from semestres where idSemestre = ?");
        selectSemestres = conexao.prepareStatement("select * from semestres");
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

    public List<Semestre> selectSemestres(){
        try{
            List<Semestre> lista = new ArrayList<>();
            ResultSet rs = selectSemestres.executeQuery();
            while(rs.next()){
                Semestre obj = new Semestre();
                obj.setIdSemestre(rs.getInt(1));
                obj.setNome(rs.getString(2));
                lista.add(obj);
            }
            return lista;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public Semestre select(int id){
        try{
            Semestre obj = new Semestre();
            select.setInt(1, id);
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

    public void delete(int id){
        try{
            delete.setInt(1, id);
            delete.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private int selectNewId(){
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
    private void update(Semestre obj){
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