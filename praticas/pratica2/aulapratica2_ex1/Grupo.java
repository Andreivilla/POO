package aulapratica2_ex1;

import java.util.Scanner;

public class Grupo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[3];

        for(int i=0; i<pessoas.length; i++){
            pessoas[i] = new Pessoa();
            System.out.print("Altura: ");
            pessoas[i].setAltura(Double.parseDouble(scanner.nextLine()));
            System.out.print("Idade: ");
            pessoas[i].setIdade(Integer.parseInt(scanner.nextLine()));
            System.out.print("Peso: ");
            pessoas[i].setPeso(Double.parseDouble(scanner.nextLine()));
        }

        System.out.println("Desordenado:" + pessoas[0].getPeso());
        for(Pessoa pessoa : pessoas){
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Peso: " + pessoa.getPeso());
            System.out.println("IMC: " + pessoa.getImc());
        }

        for(int i=0; i<pessoas.length; i++){
            for(int j=i; j<pessoas.length; j++){
                if(pessoas[i].getImc() > pessoas[j].getImc()){
                    Pessoa aux = pessoas[j];
                    pessoas[j] = pessoas[i];
                    pessoas[i] = aux;
                }
            }
        }
        System.out.println("");
        System.out.println("Ordenado:");
        for(Pessoa pessoa : pessoas){
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Peso: " + pessoa.getPeso());
            System.out.println("IMC: " + pessoa.getImc());
        }
    }
}
