package persistencia;



import dados.Avaliacao;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AvaliacaoDAO {
    private static AvaliacaoDAO instance = null;
    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;

    private AvaliacaoDAO() throws  ClassNotFoundException, SQLException {
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('seq_avaliacoes')");
        insert = conexao.prepareStatement("insert into avaliacoes values (?,?,?,?,?,?,?)");
        select = conexao.prepareStatement("select * from avaliacoes where idavaliacao = ?");
        update = conexao.prepareStatement("update avaliacoes set idAvaliacao = ?, nome = ?, nota = ?, peso = ?, data = ?, cpf = ?, coddiciplina = ?");
        delete = conexao.prepareStatement("delete from avaliacoes where cpf = ?");
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
                return rs.getInt(1); //ordem da coluna do que quer retornar, começa em 1
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    private void update(Avaliacao obj){
        //update Pessoa set idpessoa = ?, nome = ?, idade = ?, where idpessoa = ?
        try {
            update.setInt(1, obj.getIdAvaliacao());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static AvaliacaoDAO getInstance() throws ClassNotFoundException, SQLException{
        if(instance == null){
            instance = new AvaliacaoDAO();
        }
        return instance;
    }
}
