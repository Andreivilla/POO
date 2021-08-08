package persistencia;

import dados.Aluno;
import dados.Diciplina;
import dados.Relacao;
import dados.Semestre;
import exception.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RelacoesDAO {
    private static RelacoesDAO instance = null;
    private PreparedStatement selectNewId;
    private PreparedStatement selectPorCpf;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;

    private RelacoesDAO() throws  ClassNotFoundException, SQLException, SelectException {
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('seq_relacoes')");
        insert = conexao.prepareStatement("insert into alunos values (?,?, ?)");
        selectPorCpf = conexao.prepareStatement("select * from alunos where cpf = ?");
        update = conexao.prepareStatement("update alunos set cpf = ?, idsemestre = ?, coddiciplina = ?");
        delete = conexao.prepareStatement("delete from alunos where cpf = ? and idsemestre = ? and coddiciplina = ?");
    }

    public void insert(Relacao obj) throws InsertException, SelectException{
        try{
            insert.setString(1, obj.getCpf());
            insert.setInt(2, obj.getIdSemestre());
            insert.setString(3, obj.getCodDiciplina());
            insert.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Relacao> select(String id){
        try{
            List<Relacao> lista = new ArrayList<>();
            selectPorCpf.setString(1, id);
            ResultSet rs = selectPorCpf.executeQuery();
            while(rs.next()){
                Relacao obj = new Relacao();
                obj.setCodDiciplina(rs.getString(1));
                obj.setIdSemestre(rs.getInt(2));
                obj.setCodDiciplina(rs.getString(3));
                lista.add(obj);
            }
            return lista;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void delete(Relacao relacao){
        try{
            delete.setString(1, relacao.getCpf());
            delete.setInt(2, relacao.getIdSemestre());
            delete.setString(3, relacao.getCodDiciplina());
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
    private void update(Relacao obj){
        //update Pessoa set idpessoa = ?, nome = ?, idade = ?, where idpessoa = ?
        try {
            update.setString(1, obj.getCpf());
            update.setInt(2, obj.getIdSemestre());
            update.setString(3, obj.getCodDiciplina());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static RelacoesDAO getInstance() throws ClassNotFoundException, SQLException, SelectException{
        if(instance == null){
            instance = new RelacoesDAO();
        }
        return instance;
    }
}
