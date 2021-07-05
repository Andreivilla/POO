package apresentacao;

import dados.*;
import negocio.Sistema;

import java.util.Scanner;

public class Principal {

    private static Scanner scanner = new Scanner(System.in);
    private static Sistema sistema = new Sistema();




    public static void main(String[] args) {
        if (login()){
            menuPrincipal();
        }
    }

    //login
    public static void printaMenuLoguin(){
        System.out.println("1 - Acessar login");
        System.out.println("2 - Cadastrar aluno");
        System.out.println("0 - Fechar programa");
    }
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
    public static void cadastrarAluno(){
        sistema.cadastrarAluno(novoAluno());
    }
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
    //menu principal
    public static void printaMenuPrincipal(){
        System.out.println("|--------------------------|");
        System.out.println("1 - Cadastrar semestre");
        System.out.println("2 - Remover Semestre");
        System.out.println("3 - Acessar menu de semestre");
        System.out.println("4 - Gerar extrato de diciplinas");
        System.out.println("0 - Fechar programa");
        System.out.println("|--------------------------|");
    }
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
                    removerSemestre();
                    break;
                case 3:
                    acessarSemestre();
                    menuSemestre();
                    break;
                case 4:
                    sistema.extratoAluno();
                    break;
                case 0:
                    sistema.atualizarAluno();
                    //voltar
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
    public static Semestre novoSemestre(){
        Semestre add = new Semestre();
        System.out.print("Nome: ");
        add.setNome(scanner.nextLine());
        return add;
    }
    public static void cadastrarSemestre(){
        sistema.cadastrarSemestre(novoSemestre());
    }
    public static void removerSemestre(){
        System.out.println("Remover semestre");
        System.out.print("ID do semestre: ");
        sistema.removeSemestre(Integer.parseInt(scanner.nextLine()));
    }
    public static void acessarSemestre(){
        System.out.print("Digite o ID do semestre: ");
        sistema.acessarSemestre(Integer.parseInt(scanner.nextLine()));
    }
    //semestre
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
                    removerDiciplina();
                    break;
                case 3:
                    acessarDiciplina();
                    menuDiciplina();
                    break;
                case 0:
                    sistema.atualizarSemestre();
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
    public static Diciplina novaDiciplina(){
        Diciplina add = new Diciplina();
        System.out.print("Nome: ");
        add.setNome(scanner.nextLine());
        return add;
    }
    public static void cadastrarDiciplina(){
        sistema.cadastrarDiciplina(novaDiciplina());
    }
    public static void removerDiciplina(){
        System.out.println("Remover Diciplina");
        System.out.print("ID da dicimplina: ");
        sistema.removeDiciplina(Integer.parseInt(scanner.nextLine()));
    }
    public static void acessarDiciplina(){
        System.out.print("Digite o ID da diciplina: ");
        sistema.acessarDiciplina(Integer.parseInt(scanner.nextLine()));
    }

    public static void printMenuDiciplina(){
        System.out.println("|--------------------------|");
        System.out.println("1 - Adicionar Avaliacao");
        System.out.println("2 - Remover Avaliacao");
        System.out.println("0 - voltar");
        System.out.println("|--------------------------|");
    }
    public static void menuDiciplina(){
        int op =-1;
        while(op !=0){
            exibeAvalicoes();
            printMenuDiciplina();
            op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    cadastrarAvalicao();
                    break;
                case 2:
                    removerAvaliacao();
                    break;
                case 0:
                    sistema.atualizaDiciplina();
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
    public static Avaliacao novaAvaliacao(){
        Avaliacao add = new Avaliacao();
        System.out.print("Nome: ");
        add.setNome(scanner.nextLine());
        System.out.print("Data: ");
        add.setData(scanner.nextLine());
        System.out.print("Nota: ");
        add.setNota(Double.parseDouble(scanner.nextLine()));
        System.out.print("Peso: ");
        add.setPeso(Double.parseDouble(scanner.nextLine()));
        return add;
    }
    public static void cadastrarAvalicao(){
        sistema.cadastraAvaliacao(novaAvaliacao());
    }
    public static void removerAvaliacao(){
        System.out.println("Remover avaliacao");
        System.out.print("ID da avaliacao: ");
        sistema.removeDiciplina(Integer.parseInt(scanner.nextLine()));
    }


    //Exibir
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
    public static void exibeAvalicoes(){
        if(!(sistema.getDiciplinaAux().getAvaliacoesSize() == 0)){
            System.out.println("Avaliacoes cadastrasdas: ");
            for (Avaliacao printa : sistema.getDiciplinaAux().getAvaliacoes().values()) {
                System.out.println(printa);
            }
        }else{
            System.out.println("Não possui Avaliacoes cadastradas");
        }
    }
}
