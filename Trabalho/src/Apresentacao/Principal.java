package Apresentacao;

import Dados.*;
import Negocio.Sistema;

import java.util.Map;
import java.util.Scanner;

public class Principal {

    private static Scanner scanner = new Scanner(System.in);
    private static Sistema sistema = new Sistema();

    public static void main(String[] args) {
        if (login()){
            menuPrincipal();
        }
    }

    public static void printaMenuLoguin(){
        System.out.println("1 - Acessar login");
        System.out.println("2 - Cadastrar aluno");
        System.out.println("0 - Fechar programa");
    }

    //login
    public static boolean login(){
        while(true) {
            printaMenuLoguin();
            int op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    System.out.print("Cpf: ");
                    long cpf = Long.parseLong(scanner.nextLine());
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    if(sistema.login(cpf, senha)){
                        System.out.println("Login efetuado");
                        return true;
                    }else{
                        System.out.println("Senha ou cpf invalido");
                    }
                    break;
                case 2:
                    cadastrarAluno();
                    break;
                case 0:
                    System.out.println("Fechar programa");
                    return false;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }

    public static void printaMenuPrincipal(){
        System.out.println("|--------------------------|");
        System.out.println("1 - Cadastrar semestre");
        System.out.println("2 - Remover Semestre");
        System.out.println("3 - Acessar menu de semestre");
        System.out.println("0 - Voltar");
        System.out.println("|--------------------------|");
    }
    //menu principal
    public static void menuPrincipal(){
        int op =-1;
        while(op != 0){
            exibeSemestres();
            printaMenuPrincipal();
            op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    cadastrarSemestre();
                    break;
                case 2:
                    //programar remocao de semestres
                    break;
                case 3:
                    acessarSemestre();
                    menuSemestre();
                    break;
                case 0:
                    System.out.println("Fechar programa");
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }

    public static void acessarSemestre(){
        System.out.print("Digite o ID do semestre: ");
        sistema.acessarSemestre(Integer.parseInt(scanner.nextLine()));
    }

    public static void printMenuSemestres(){
        System.out.println("|--------------------------|");
        System.out.println("1 - Adicionar diciplina");
        System.out.println("2 - Remover diciplina");
        System.out.println("3 - Acessar menu de diciplina");
        System.out.println("0 - voltar");
        System.out.println("|--------------------------|");
    }

    public static void menuSemestre(){
        int op =-1;
        while(op !=0){

            exibeDiciplinas();
            printMenuSemestres();
            op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    cadastrarDiciplina();
                    break;
                case 2:
                    //remover diciplinas
                    break;
                case 3:

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }

    //ALUNO
    public static Aluno novoAluno(){
        Aluno novo = new Aluno();

        System.out.print("Nome: ");
        novo.setNome(scanner.nextLine());
        System.out.print("CPF: ");
        novo.setCpf(Long.parseLong(scanner.nextLine()));
        System.out.print("Senha: ");
        novo.setSenha(scanner.nextLine());

        return novo;
    }
    public static void cadastrarAluno(){
        sistema.cadastrarAluno(novoAluno());
    }

    //SEMESTRE
    public static Semestre novoSemestre(){
        Semestre add = new Semestre();
        System.out.print("Nome: ");
        add.setNome(scanner.nextLine());
        return add;
    }
    public static void cadastrarSemestre(){
        sistema.cadastrarSemestre(novoSemestre());
    }

    //DICIPLINA
    public static Diciplina novaDiciplina(){
        Diciplina add = new Diciplina();
        System.out.print("Nome: ");
        add.setNome(scanner.nextLine());
        return add;
    }

    public static void cadastrarDiciplina(){
        sistema.cadastrarDiciplina(novaDiciplina());
    }
    public static void cadastrarNotas(){

    }

    public static void cadastrarAvalicao(){

    }

    //remover
    public static void removeSemestre(){

    }
    public static void removeDiciplina(){

    }

    //printar

    public static void exibeDiciplinas(){
        if(!(sistema.getSemestreaux().getDiciplinasSize() == 0)){
            System.out.println("Diciplinas cadastradas");
            for (Diciplina printa : sistema.getSemestreaux().getDiciplinas().values()) {
                System.out.println(printa);
            }
        }else{
            System.out.println("Não possui dissiplinas cadastradas");
        }
    }
    public static void exibeNotas(){

    }
    public static void exibeSemestres(){
        if(!(sistema.getAlunoLogado().getSemestresSize() == 0)){
            System.out.println("Semestres cadastrados: ");
            for (Semestre printa : sistema.getAlunoLogado().getSemestres().values()) {
                System.out.println(printa);
            }
        }else{
            System.out.println("Não possui semestres cadastrados");
        }
    }
    public static void exibeAvalicao(){

    }

}
