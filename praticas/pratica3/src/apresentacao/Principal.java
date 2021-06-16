package apresentacao;

import dados.*;
import negocio.ReservaPassagem;

import java.util.Scanner;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private static ReservaPassagem reservaPassagem = new ReservaPassagem();

    public static void main(String[] args) {
        menu();
    }
    //menu
    public static void printaMenu(){
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Cadastrar Cidade");
        System.out.println("3 - Cadastrar reserva");
        System.out.println("4 - Mostrar reservas");
        System.out.println("5 - Mostrar cidades");
        System.out.println("6 - Mostrar clientes");
    }
    public static void menu(){
        int op =  -1;

        while(op != 0){
            printaMenu();
            op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    //Cadastrar cliente
                    cadastrarCliente();
                    break;
                case 2:
                    //cadastrar cidade
                    cadastrarCidade();
                    break;
                case 3:
                    //cadastrar reserva
                    cadastraReserva();
                    break;
                case 4:
                    //mostrar reservas
                    mostrarReservas();
                    break;
                case 5:
                    //mostar cidades

                    break;
                case 6:
                    //mostrar clientes
                    mostrarClientes();
                case 0:
                    System.out.println("Fechando programa");
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        }
    }

    //Cidade
    public static Cidade novaCidade(){
        Cidade add = new Cidade();
        System.out.print("Nome: ");
        add.setNome(scanner.nextLine());
        System.out.print("Estado: ");
        add.setEstado(scanner.nextLine());

        return add;
    }
    public static void cadastrarCidade(){
        reservaPassagem.cadastrarCidade(novaCidade());
    }
    public static void mostraCidades(){
        for(Cidade cidade: reservaPassagem.mostraCidade()){
            cidade.toString();
        }
    }


    //cliente
    public static Cliente novoCliente(){
        Cliente add = new Cliente();
        System.out.print("Cpf: ");
        add.setCpf(Integer.parseInt(scanner.nextLine()));
        System.out.print("Endereço: ");
        add.setEndereco(scanner.nextLine());
        System.out.print("Nome: ");
        add.setNome(scanner.nextLine());
        System.out.print("Telefone: ");
        add.setTelefone(Integer.parseInt(scanner.nextLine()));

        return add;
    }
    public static void cadastrarCliente(){
        reservaPassagem.cadastrarCliente(novoCliente());
    }
    public static void mostrarClientes(){
        for(Cliente cliente : reservaPassagem.mostrarClientes()){
            System.out.println("--------------------------");
            cliente.toString();
        }
        System.out.println("--------------------------");
    }

    //Reserva
    public static Reserva novaReserva(){
        Reserva add = new Reserva();
        boolean op;
        System.out.print("Ida e volta?(1-sim/2-não): ");
        add.setIdaEvolta(Integer.parseInt(scanner.nextLine()) == 1);
        System.out.print("Classe: ");
        add.setClasseVoo(scanner.nextLine());
        System.out.print("Data: ");
        add.setDataVoo(scanner.nextLine());
        System.out.print("Numero Reserva: ");
        add.setNumReserva(Integer.parseInt(scanner.nextLine()));
        System.out.print("Numero Polstrona: ");
        add.setPoltrona(Integer.parseInt(scanner.nextLine()));
        System.out.print("Preço: ");
        add.setPreco(Float.parseFloat(scanner.nextLine()));
        return add;
    }
    public static void cadastraReserva(){
        reservaPassagem.cadastrarReserva(novaReserva());
    }


    public static void mostrarReservas(){
        for(Reserva reserva : reservaPassagem.mostraReservas()){
            System.out.println("--------------------------");
            reserva.toString();
        }
        System.out.println("--------------------------");
    }
}
