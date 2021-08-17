package persistencia;

import dados.Pessoa;

import exceptions.*;
import java.sql.*;

public class PessoaDAO {

    private static PessoaDAO instance=null;
    private static EnderecoDAO enderecoDAO=null;
    private PreparedStatement selectNewId;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement selectAll;
    private PreparedStatement update;

    public static PessoaDAO getInstance() throws ClassNotFoundException, SQLException, SelectException{
        if(instance == null){
            instance = new PessoaDAO();
        }
        return instance;
    }
    private int selectNewid(){}
    public void insert(Pessoa pessoa){}
    public void delete(Pessoa pessoa){}
    public List<Pessoa> selectAll(){}
    public void updade(Pessoa pessoa){}
}
