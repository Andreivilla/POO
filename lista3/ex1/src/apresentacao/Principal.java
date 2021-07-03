package apresentacao;

import dados.LerArquivo;
import dados.Pessoa;

import java.util.*;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        //o neunciado da questão pedia a implementação de um loop terminado em -1
        // //porem a dica indicava a opção de fzr com arquivos então implemtei ambos
        //o primeiro bloco pega nPessoas do arquivo pessoas.txt
        LerArquivo lerArquivo = new LerArquivo();
        pessoas = lerArquivo.getPesssoasArquivo(4);
        exibePessoas();
        Collections.sort(pessoas, new comparatorByNome());
        System.out.println("\n\nDps de comparar por nome: \n");
        exibePessoas();
        pessoas.clear();
        //depois de limpar a List pessoas damos inicio ao loop mencionado no enunciado
        //os codigos funcionam independentemente podem ser comentados para facilitar a execução
        int op = 0;
        while(op != -1){
            System.out.println("Adicionar pessoas");
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