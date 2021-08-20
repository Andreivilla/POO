package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static Connection conexao = null;
    private static String senha = "36461023vo";

    private Conexao() {
    }

    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        if(conexao==null){
            String url = "jdbc:postgresql://localhost:5432/aplicativoDeNotasV3";
            String usuario = "postgres";
            try {
                Class.forName("org.postgresql.Driver");
                conexao = DriverManager.getConnection(url, usuario, senha);
            }catch (ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
        }
        return conexao;
    }

    public void setSenha(String senha) {
        senha = senha;
    }
}
