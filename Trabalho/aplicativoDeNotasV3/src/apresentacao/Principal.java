package apresentacao;

import negocio.Sistema;

public class Principal {
    private static String cpfLogado = null;
    private static int tipoLogin;

    public static void main(String[] args) {
        /*Login login = new Login();
        while (cpfLogado == null) {
            cpfLogado = login.getCpfLogado();

        }
        if(login.getTipoLogin() == 1){
           //professor interface grafica
        }else{
            //aluno interface grafica
        }
        //System.out.println("Cpf: " + cpfLogado);*/
        cpfLogado = "36484913005";
        Sistema sistema = Sistema.getInstance();
        sistema.setCpfLogado(cpfLogado);

        //PrincipalProfessor principalProfessor = new PrincipalProfessor();
        PrincipalAluno principalAluno = new PrincipalAluno(cpfLogado);
    }
}