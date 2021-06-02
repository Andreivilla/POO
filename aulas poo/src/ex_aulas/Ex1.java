package ex_aulas;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double[] valores = new double[5];
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for(int i = 0; i<valores.length; i++){
            System.out.print("VAlor " + (i+1) + ": ");
            valores[i] = scanner.nextInt();
            soma = soma+valores[i];
        }
        double media = soma/5;
        System.out.println("media: " + media);

    }
}
