/*Exercicio 3:
Codifique uma função recursiva em Java que dado um array encontre recursivamente o
maior valor dentro desse array. A função deve seguir o seguinte prototipo:*/
public class Ex3 {
    public static void main(String[] args) {
        int[] vet = {1,5,9,8,89,9,2,5};
        System.out.println("Maior: " + buscaMaior(vet, vet[0], 0));
    }
    public static int buscaMaior(int vetor[], int maiorAtual, int indice){
        if(indice == vetor.length-1){
            return Math.max(vetor[indice], maiorAtual);
        }
        if(vetor[indice] > maiorAtual) {
            return buscaMaior(vetor, vetor[indice], indice+1);
        }else{
            return buscaMaior(vetor, maiorAtual, indice+1);
        }
    }
}
