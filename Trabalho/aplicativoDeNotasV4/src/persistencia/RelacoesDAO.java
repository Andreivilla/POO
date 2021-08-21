package persistencia;

import dados.Diciplina;
import dados.Semestre;
import exception.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RelacoesDAO {
    private static RelacoesDAO instance = null;

    private PreparedStatement selectNewId;

    private PreparedStatement selectSemestres;
    private PreparedStatement cadastrarSemestre;
    private PreparedStatement deletarSemestre;
    private PreparedStatement update;
    private PreparedStatement selectDiciplinas;

    private RelacoesDAO() throws  ClassNotFoundException, SQLException, SelectException {
        Connection conexao = Conexao.getConexao();
        update = conexao.prepareStatement("update relacoesalunosemestrediciplina set cpf = ?, idsemestre = ?");
        cadastrarSemestre = conexao.prepareStatement("insert into relacoesalunosemestrediciplina values (?,?)");
        deletarSemestre = conexao.prepareStatement("delete from relacoesalunosemestrediciplina where cpf = ? and idsemestre = ?");
        selectSemestres = conexao.prepareStatement("select idsemestre from relacoesalunosemestrediciplina where cpf = ?");
        selectDiciplinas = conexao.prepareStatement("select coddiciplina from relacoesalunosemestrediciplina where cpf = ? and idsemestre = ?");
        selectNewId = conexao.prepareStatement("select nextval('seq_relacoes')");
    }

    public List<Diciplina> selectDiciplinas(String cpf, int id){
        try{
            List<Diciplina> listaAux = new ArrayList<>();
            selectDiciplinas.setString(1,cpf);
            selectDiciplinas.setInt(2, id);
            ResultSet rs = selectDiciplinas.executeQuery();
            while (rs.next()) {
                DiciplinaDAO diciplinaDAO = DiciplinaDAO.getInstance();
                Diciplina aux = diciplinaDAO.select(rs.getString(1));
                listaAux.add(aux);
            }
            return listaAux;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void deletarSemestre(String cpf, int id){
        try{
            deletarSemestre.setString(1,cpf);
            deletarSemestre.setInt(2,id);
            //ResultSet rs = deletarSemestre.executeQuery();
            deletarSemestre.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void cadastrarSemestre(String cpf, int id){
        try {
            cadastrarSemestre.setString(1, cpf);
            cadastrarSemestre.setInt(2, id);
            ResultSet rs = cadastrarSemestre.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Semestre> selectSemestres(String cpf){
        try {
            List<Integer> listaSemestreInt = new ArrayList<>();
            selectSemestres.setString(1,cpf);
            ResultSet rs = selectSemestres.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                boolean add = true;
                for(int i : listaSemestreInt){
                    if(id == i)
                        add = false;
                }
                if(add){
                    listaSemestreInt.add(id);
                }
            }
            List<Semestre> listaSemestreObject = new ArrayList<>();
            for(int id : listaSemestreInt){
                SemestreDAO semestreDAO = SemestreDAO.getInstance();
                listaSemestreObject.add(semestreDAO.select(id));
            }

            return listaSemestreObject;
        } catch (SQLException | SelectException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
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

    public static RelacoesDAO getInstance() throws ClassNotFoundException, SQLException, SelectException{
        if(instance == null){
            instance = new RelacoesDAO();
        }
        return instance;
    }
}
