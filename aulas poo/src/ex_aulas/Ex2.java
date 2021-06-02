package ex_aulas;

import java.util.Scanner;

/*Escreva um programa em Java, que leia o nome e a idade de 5 pessoas e
exiba-os em ordem decrescente no console. É obrigatório o uso de array.*/
public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[5];

        //ler nomes e idades
        for(int i=0; i< pessoas.length; i++){
            pessoas[i] = new Pessoa();
            System.out.print("Nome: ");
            pessoas[i].setNome(scanner.nextLine());
            System.out.print("Idade: ");
            pessoas[i].setIdade(scanner.nextInt());
            scanner.nextLine();//limpar buffer
        }
        //ordenar por idades
        for(int i=0; i<pessoas.length; i++){
            for(int j=i; j<pessoas.length; j++){
                if(pessoas[i].getIdade() < pessoas[j].getIdade()){
                    Pessoa aux;
                    aux = pessoas[i];
                    pessoas[i] = pessoas[j];
                    pessoas[j] = aux;
                }
            }
        }
        //printar pessoas
        System.out.println("Pessoas em ordem decrescente de idade: ");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
        }

    }
}
