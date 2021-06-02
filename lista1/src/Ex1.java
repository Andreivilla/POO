import java.util.ArrayList;
import java.util.Scanner;
/*Exercio 1:
Escreva um programa em Java que receba um vetor de inteiros e exiba no console as seguintes
informaçõoes a respeito desse vetor:
• A soma dos elementos desse vetor;
• O menor valor do vetor;
• O maior valor do vetor;
• A media dos elementos do vetor;
• A soma dos numeros primos existentes no vetor;*/
public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];

        for(int i=0; i<valores.length; i++){
            valores[i] = scanner.nextInt();
        }

        //A soma dos elementos desse vetor;
        System.out.println("Soma: " + soma(valores));
        //O menor valor do vetor;
        System.out.println("Menor valor do vetor: " + menorValor(valores));
        //O maior valor do vetor;
        System.out.println("Maior valor: " + maiorValor(valores));
        //A media dos elementos do vetor;
        System.out.println("Media: " + ((double)soma(valores)/(double)valores.length));
        //A soma dos numeros primos existentes no vetor;
        System.out.println("Soma primos: " + somaPrimo(valores));

    }

    public static boolean primo(int test){
        int i;
        ArrayList<Integer> primos = new ArrayList<>();
        primos.add(1);

        for(i=1; i<=test; i++){
            if(!divPrimo(primos, i)){
                primos.add(i);
            }
        }
        if(primos.get(primos.size()-1) == test)
            return true;
        else
            return false;
    }
    public static boolean divPrimo(ArrayList<Integer> lista, int n){
        for(int i=2; i<lista.size(); i++){
            if(n%lista.get(i)==0)
                return true;
        }
        return false;
    }

    public static int soma(int[] valores){
        int soma = 0;
        for(int valor : valores){
            soma  += valor;
        }
        return soma;
    }

    public static int menorValor(int[] valores){
        int menor = valores[0];
        for (int valor: valores){
            if(valor<menor){
                menor = valor;
            }
        }
        return menor;
    }

    public static int maiorValor(int[] valores){
        int maior = valores[0];
        for (int valor: valores){
            if(valor>maior){
                maior = valor;
            }
        }
        return maior;
    }

    public static int somaPrimo(int[] valores){
        int soma = 0;
        for(int valor : valores){
            if(primo(valor))
                soma += valor;
        }
        return soma;
    }
}
