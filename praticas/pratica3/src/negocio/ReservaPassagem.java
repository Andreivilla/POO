package negocio;

import dados.*;

import java.util.Scanner;

public class ReservaPassagem {
    private Cidade cidades[] = new Cidade[20];
    private Cliente clientes[] = new Cliente[20];
    private Reserva reservas[] = new Reserva[20];
    private int qtdreservas = 0;
    private int qtdCidades = 0;
    private int qtdClientes = 0;
    Scanner scanner = new Scanner(System.in);

    public void cadastrarCidade(Cidade cidade){
        cidades[qtdCidades] = cidade;
        qtdCidades++;
    }

    public void cadastrarCliente(Cliente cliente){
        clientes[qtdClientes] = cliente;
        qtdClientes++;
    }

    public void cadastrarReserva(Reserva reserva){
        reservas[qtdreservas] = reserva;
        qtdreservas++;
    }

    public Cliente[] mostrarClientes(){
        return this.clientes;
    }
    public Cidade[] mostraCidade(){
        return cidades;
    }

    public Reserva[] mostraReservas(){
        return this.reservas;
    }

}
