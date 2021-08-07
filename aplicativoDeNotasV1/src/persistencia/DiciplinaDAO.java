package persistencia;

import dados.Diciplina;
import exception.DeleteException;
import exception.InsertException;
import exception.SelectException;

import java.sql.*;

public class DiciplinaDAO {
    private static DiciplinaDAO instance = null;
    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;

    private DiciplinaDAO() throws  ClassNotFoundException, SQLException, SelectException {
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('seq_semestre')");
        insert = conexao.prepareStatement("insert into alunos values (?,?)");
        select = conexao.prepareStatement("select * from alunos where cpf = ?");
        update = conexao.prepareStatement("update alunos set cpf = ?, nome = ?, senha = ?");
        delete = conexao.prepareStatement("delete from alunos where cpf = ?");
    }

    public void insert(Diciplina obj) throws InsertException, SelectException{
        try{
            insert.setString(1, obj.getCodDiciplina());
            insert.setString(2, obj.getNome());
            insert.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Diciplina select(String id) throws SelectException{
        try{
            Diciplina obj = new Diciplina();
            select.setString(1, id);
            ResultSet rs = select.executeQuery();
            if(rs.next()){
                obj.setCodDiciplina(rs.getString(1));
                obj.setNome(rs.getString(2));
                return obj;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void delete(String id) throws DeleteException {
        try{
            delete.setString(1, id);
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
    private void update(Diciplina obj){
        //update Pessoa set idpessoa = ?, nome = ?, idade = ?, where idpessoa = ?
        try {
            update.setString(2, obj.getCodDiciplina());
            update.setString(2, obj.getNome());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static DiciplinaDAO getInstance() throws ClassNotFoundException, SQLException, SelectException{
        if(instance == null){
            instance = new DiciplinaDAO();
        }
        return instance;
    }
}
