package apresentacao;

import dados.Pessoa;

import java.util.*;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        /*Pessoa teste = new Pessoa(4, "475.458.343-21", 17, "Joao Pedro Oliveira", "Florianopolis");
        pessoas.add(teste);
        teste = new Pessoa(1, "272.938.273-93", 5, "Lucas da Silva", "Joinville");
        pessoas.add(teste);
        teste = new Pessoa(2, "472.938.253-43", 5, "Igor Pereira", "Jaragua do Sul");
        pessoas.add(teste);
        teste = new Pessoa(3, "343.945.234-04", 14, "Luiz Otavio Ramos", "Joinville");
        pessoas.add(teste);*/

        /*exibePessoas();
        Collections.sort(pessoas, new comparatorByNome());
        System.out.println("\n\nDps de comparar por nome: \n");
        exibePessoas();*/

        int op = 0;
        while(op != -1){
            adicionarPessoa();
            System.out.println("Digite -1 para parar");
            exibePessoas();
            op = Integer.parseInt(scanner.nextLine());
        }
    }
    public static Pessoa novaPessoa(){
        Pessoa nova = new Pessoa();
        System.out.print("Nome: ");
        nova.setNome(scanner.nextLine());
        System.out.print("Cidade: ");
        nova.setCidade(scanner.nextLine());
        System.out.print("CPF: ");
        nova.setCpf(scanner.nextLine());
        System.out.print("Idade: ");
        nova.setIdade(Integer.parseInt(scanner.nextLine()));
        nova.setIdPessoa(pessoas.size()+1);
        return nova;
    }
    public static void adicionarPessoa(){
        pessoas.add(novaPessoa());
    }

    public static void exibePessoas(){
        System.out.println("1 até 12: crianças;");
        for(Pessoa exibe : pessoas){
            if(exibe.getIdade() >= 1 && exibe.getIdade() <= 12){
                System.out.println(exibe);
            }
        }
        System.out.println("13 até 18: adolescentes;");
        for(Pessoa exibe : pessoas){
            if(exibe.getIdade() > 12 && exibe.getIdade() <= 18){
                System.out.println(exibe);
            }
        }
        System.out.println("19 até 25: jovens;");
        for(Pessoa exibe : pessoas){
            if(exibe.getIdade() > 18 && exibe.getIdade() <= 25){
                System.out.println(exibe);
            }
        }
        System.out.println("26 até 59: adultos;");
        for(Pessoa exibe : pessoas){
            if(exibe.getIdade() > 25 && exibe.getIdade() <= 59){
                System.out.println(exibe);
            }
        }
        System.out.println("60 ou mais: idosos;");
        for(Pessoa exibe : pessoas){
            if(exibe.getIdade() > 59){
                System.out.println(exibe);
            }
        }
    }


}
class comparatorByNome implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa p1, Pessoa p2){
        return p1.getNome().compareTo(p2.getNome());
    }
}