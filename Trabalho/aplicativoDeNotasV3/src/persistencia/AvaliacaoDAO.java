package persistencia;



import dados.Avaliacao;
import dados.Relacao;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AvaliacaoDAO {
    private static AvaliacaoDAO instance = null;
    private PreparedStatement selectAvalaicaoMateria;
    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;

    private AvaliacaoDAO() throws  ClassNotFoundException, SQLException {
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('seq_avaliacoes')");
        insert = conexao.prepareStatement("insert into avaliacoes values (?,?,?,?,?,?,?)");
        selectAvalaicaoMateria = select = conexao.prepareStatement("select * from avaliacoes where cpf = ? and coddiciplina = ?");
        select = conexao.prepareStatement("select * from avaliacoes where idavaliacao = ?");
        update = conexao.prepareStatement("update avaliacoes set idAvaliacao = ?, nome = ?, nota = ?, peso = ?, data = ?, cpf = ?, coddiciplina = ?");
        delete = conexao.prepareStatement("delete from avaliacoes where idAvaliacao = ?");
    }

    public void insert(Avaliacao obj){
        try{
            DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
            Date date = (Date)formatter.parse(obj.getData());

            insert.setInt(1, obj.getIdAvaliacao());
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

    public Avaliacao select(int id){
        try{
            Avaliacao obj = new Avaliacao();
            select.setInt(1, id);
            ResultSet rs = select.executeQuery();
            if(rs.next()){
                obj.setIdAvaliacao(rs.getInt(1));
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
    public void update(Avaliacao obj){
        try {
            DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
            Date date = (Date)formatter.parse(obj.getData());
            update.setInt(1, obj.getIdAvaliacao());
            update.setString(2, obj.getNome());
            update.setFloat(3, obj.getNota());
            update.setFloat(4, obj.getPeso());
            update.setDate(5, date);
            update.setString(6, obj.getCpf());
            update.setString(7, obj.getCodDciplina());
        }catch (SQLException | ParseException e){
            e.printStackTrace();
        }
    }

    public List<Avaliacao> listaAvaliacao(String cpf, String codDiciplina){
        try{

            List<Avaliacao> lista = new ArrayList<>();
            selectAvalaicaoMateria.setString(1, cpf);
            selectAvalaicaoMateria.setString(2, codDiciplina);
            ResultSet rs = selectAvalaicaoMateria.executeQuery();
            while(rs.next()){
                Avaliacao obj = new Avaliacao();
                obj.setNome(rs.getString("nome"));
                obj.setNota(rs.getFloat("nota"));
                obj.setPeso(rs.getFloat("peso"));
                lista.add(obj);
            }
            return lista;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static AvaliacaoDAO getInstance() throws ClassNotFoundException, SQLException{
        if(instance == null){
            instance = new AvaliacaoDAO();
        }
        return instance;
    }
}
