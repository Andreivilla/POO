package apresentacao;

import apresentacao.aluno.PrincipalAluno;
import dados.Semestre;
import exception.SelectException;
import negocio.Sistema;
import persistencia.RelacoesDAO;

import java.sql.SQLException;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.setTipoLogin(2);
        sistema.setCpfLogado("36484913005");

        /*Login login = new Login(sistema);
        do {
        }while(login.getCpfLogado() != null);
        System.out.println("cpf: " + sistema.getCpfLogado());*/




        PrincipalAluno principalAluno = new PrincipalAluno(sistema);
    }
}

