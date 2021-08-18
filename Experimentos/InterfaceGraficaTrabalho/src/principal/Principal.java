package principal;

public class Principal{
    private static String cpfLogado = null;

    public static void main(String[] args) {

        Login login = new Login();
        while (cpfLogado == null) {
            cpfLogado = login.getCpfLogado();
        }
        System.out.println("Cpf: " + cpfLogado);

        PrincipalAluno principalAluno = new PrincipalAluno();
    }

}
