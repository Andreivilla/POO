package Apresentacao;

import dados.*;
import negocio.Zoologico;

import java.util.Scanner;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private static Zoologico zoo = new Zoologico();

    public static void main(String[] args) {
        menu();
    }
    public static void pritaMenu(){
        System.out.println("0 - Sair");
        System.out.println("1 - ADD animal");
        System.out.println("2 - ADD viveiro");
    }
    public static void menu(){
        int op = -1;
        while(op != 0){
            pritaMenu();
            op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:

                    break;
            }

        }
    }

    public static Viveiro novoViveiro(){
        Viveiro add = new Viveiro();
        System.out.print("Comprimento: ");
        add.setComprimento(Float.parseFloat(scanner.nextLine()));
        System.out.print("Largura: ");
        add.setLargura(Float.parseFloat(scanner.nextLine()));
        System.out.print("Largura: ");
        add.setNome(scanner.nextLine());
        return add;
    }

    static void addVieiro(){
       zoo.cadastrarViveiro(novoViveiro());
    }

    public static Peixe novoPeixe(){
        Peixe add = new Peixe();
        System.out.print("Nome: ");
        add.setNome(scanner.nextLine());
        System.out.print("Altura: ");
        add.setAltura(Float.parseFloat(scanner.nextLine()));
        System.out.print("Comprimento: ");
        add.setComprimento(Float.parseFloat(scanner.nextLine()));
        System.out.print("Temperatura: ");
        add.setTemperaturaIdeal(Float.parseFloat(scanner.nextLine()));
        return add;
    }

    public static Animal novoAniamal(){
        Animal add = new Animal();
        System.out.print("Nome: ");
        add.setNome(scanner.nextLine());
        System.out.print("Altura: ");
        add.setAltura(Float.parseFloat(scanner.nextLine()));
        System.out.print("Comprimento: ");
        add.setComprimento(Float.parseFloat(scanner.nextLine()));
        return add;
    }

    public static void addAnimal(){
        int op = -1;
        while(op != 1 && op != 2){
            System.out.println("1 - peixe");
            System.out.println("2 - Outro");
            op = Integer.parseInt(scanner.nextLine());
            switch (op){
                case 1:
                    zoo.cadastrarAnimais(novoPeixe());
                    break;
                case 2:
                    zoo.cadastrarAnimais(novoAniamal());
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }

    }
}
