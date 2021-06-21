package apresentacao;

import dados.Pessoa;
import negocio.Sorteador;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static Sorteador sorteador = new Sorteador();

    public static void main(String[] args) {
        //a main foi criada apenas para teste porem ela permite a criação de n pessoas e sortear elas uma a uma
        System.out.print("Numero de pessoas: ");
        int n = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<n; i++){
            System.out.println("dados.Pessoa " + i + ": ");
            addPessoa();
        }
        while (sorteador.getPessoas().size() != 0) {
            System.out.println("Sorteado: \n" + sorteador.sortearProximo().toString() + "\n");
            System.out.println("Pessoas restantes: \n");
            printaPessoas();
        }
    }
    public static void addPessoa(){
        sorteador.addPessoa(novaPessoa());
    }

    public static Pessoa novaPessoa(){
        Pessoa pessoa = new Pessoa();
        System.out.print("Nome: ");
        pessoa.setNome(scanner.nextLine());
        System.out.print("Cpf: ");
        pessoa.setCpf(Long.parseLong(scanner.nextLine()));
        return pessoa;
    }
    public static void printaPessoas(){
        ArrayList<Pessoa> pessoas = sorteador.getPessoas();
        if(pessoas.size() == 0){
            System.out.println("lista de pessoas vazia");
            return;
        }
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.toString());
        }
    }
}
