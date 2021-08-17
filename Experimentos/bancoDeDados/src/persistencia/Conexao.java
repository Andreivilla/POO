package persistencia;

import java.sql.*;

public class Conexao {
    private static Connection conexao = null;
    private static String senha;

    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        if(conexao==null){
            String url = "jdbc:postgresql://localhost:5432/pessoas";
            String usuario="postgres";
            Class.forName("org.postgresql.Driver");
            conexao = (Connection) DriverManager.getConnection(url, usuario, senha);
        }
        return conexao;
    }

    public void setSenha(String senha) {
        senha = senha;
    }
    public String getSenha() {
        return senha;
    }
}
