package persistencia;


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

    private SemestreDAO() throws  ClassNotFoundException, SQLException, SelectException {
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('seq_semestre')");
        select = conexao.prepareStatement("select * from semestres where idSemestre = ?");
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

    public static SemestreDAO getInstance() throws ClassNotFoundException, SQLException, SelectException{
        if(instance == null){
            instance = new SemestreDAO();
        }
        return instance;
    }
}