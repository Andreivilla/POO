package persistencia;

import dados.Avaliacao;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AvaliacaoDAO {
    private static AvaliacaoDAO instance = null;
    private PreparedStatement selectNewId;
    private PreparedStatement insert;
    private PreparedStatement delete;

    private PreparedStatement selectAvalicoes;

    private AvaliacaoDAO() throws  ClassNotFoundException, SQLException {
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('seq_avaliacoes')");
        selectAvalicoes = conexao.prepareStatement("select * from avaliacoes where cpf = ? and idsemestre = ? and coddiciplina = ?");
        insert = conexao.prepareStatement("insert into avaliacoes values (?,?,?,?,?,?,?)");
        delete = conexao.prepareStatement("delete from avaliacoes where idAvaliacao = ?");
    }

    public List<Avaliacao> selectAvaliacoes(String cpf, int id, String cod){
        try {
            List<Avaliacao> auxLista = new ArrayList<>();
            selectAvalicoes.setString(1, cpf);
            selectAvalicoes.setInt(2, id);
            selectAvalicoes.setString(3, cod);
            ResultSet rs = selectAvalicoes.executeQuery();
            while (rs.next()){
                //idSemestre integer, nome varchar(50), nota float, peso float, data date,cpf varchar(12), codDiciplina varchar(10),
                Avaliacao aux = new Avaliacao();
                aux.setIdSemestre(rs.getInt(1));
                aux.setNome(rs.getString(2));
                aux.setNota(rs.getFloat(3));
                aux.setPeso(rs.getFloat(4));
                aux.setData(rs.getDate(5).toString());
                aux.setCpf(rs.getString(6));
                aux.setCodDciplina(rs.getString(7));
                auxLista.add(aux);
            }
            return auxLista;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


    public void insert(Avaliacao obj){
        try{
            DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
            Date date = (Date)formatter.parse(obj.getData());

            insert.setString(2, obj.getNome());
            insert.setFloat(3, obj.getNota());
            insert.setFloat(4, obj.getPeso());
            insert.setDate(5, date);
            insert.setString(6, obj.getCpf());
            insert.setString(7, obj.getCodDciplina());
        }catch (SQLException | ParseException e){
            e.printStackTrace();
        }
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

    public static AvaliacaoDAO getInstance() throws ClassNotFoundException, SQLException{
        if(instance == null){
            instance = new AvaliacaoDAO();
        }
        return instance;
    }
}
