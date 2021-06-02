import java.util.Scanner;

/*Exercio 5:
Escreva um algoritmo em Java que leia uma String do usuario e determine se ela é ou não
um palindromo, conte o numero de vogais e consoantes presentes na String e inverta-a.*/
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        palindormo(str);

    }
    public static void palindormo(String str){
        String invertida = new StringBuilder(str).reverse().toString();
        if(str.equals(invertida)){
            System.out.println("palindromo");
        }else{
            System.out.println("NÃo é palindromo");
        }
    }
}
