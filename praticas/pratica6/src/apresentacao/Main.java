package apresentacao;

import dados.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Nasturais: ");
        Naturais naturais= new Naturais();
        naturais.gerar(n);
        System.out.println(naturais.getLista());

        System.out.println("Abundantes: ");
        Abundantes abundantes = new Abundantes();
        abundantes.gerar(n);
        System.out.println(abundantes.getLista());

        System.out.println("Fibonacci: ");
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.gerar(n);
        System.out.println(fibonacci.getLista());

        System.out.println("Primos: ");
        Primos primos = new Primos();
        primos.gerar(n);
        System.out.println(primos.getLista());

        System.out.println("Fatorial: ");
        Fatoriais fatoriais = new Fatoriais();
        fatoriais.gerar(n);
        System.out.println(fatoriais.getLista());

        System.out.println("Quadrados: ");
        Quadrados quadrados = new Quadrados();
        quadrados.gerar(n);
        System.out.println(quadrados.getLista());

        System.out.println("Perfeitos: ");
        Perfeitos perfeitos = new Perfeitos();
        perfeitos.gerar(n);
        System.out.println(perfeitos.getLista());


    }

}
