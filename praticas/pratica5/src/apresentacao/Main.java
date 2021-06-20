package apresentacao;

import dados.Contato;
import negocio.ListaTelefonica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ListaTelefonica listaTelefonica = new ListaTelefonica();

    public static void main(String[] args) {
        menu();
    }

    public static void printaMenu(){
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Remover contato");
        System.out.println("0 - sair");
    }

    public static void menu(){
        int op = -1;
        while(op != 0){
            printaMenu();
            op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    exibirContatos();
                    break;
                case 3:

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }

    public static void removerContato(){
        ArrayList<Contato> contatosAux = new ArrayList<Contato>();
        String letra = scanner.nextLine();
        contatosAux = 
    }

    public static Contato novoContato(){
        Contato novo = new Contato();

        System.out.print("Nome: ");
        novo.setNome(scanner.nextLine());
        System.out.print("Numero: ");
        novo.setTelefone(Integer.parseInt(scanner.nextLine()));

        return novo;
    }

    public static void adicionarContato(){
        listaTelefonica.adicionarContato(novoContato());
    }

    public static void exibirContatos(){
        Map<Character, ArrayList<Contato>> mapcontatos = listaTelefonica.buscarContatos();
        //Map<Character, ArrayList<Contato>> mapcontatos = new HashMap<Character, ArrayList<Contato>>();
        //mapcontatos = listaTelefonica.buscarContatos();

        mapcontatos.forEach((inicial, contatos) ->{
            System.out.println(inicial + ":");
            for(Contato contato: contatos){
                System.out.println(contato.toString());
            }
        });
    }
}