import java.util.Arrays;
import java.util.Scanner;

/*Exercıcio 6:
Crie um programa em Java que leia duas Strings do console e exiba no console as letras
presentem em ambas as Strings ordenadas em ordem alfabetica.*/
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println("StrLetras: " + letrasIguais("alexandre", "andrei"));
    }

    public static String letrasIguais(String str1, String str2){
        //tratando strings
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str1 = str1.trim();
        str2 = str2.trim();

        int i = 0;
        String strverif = "";
        StringBuilder strLetras = new StringBuilder();
        for(i=0;i<str1.length();i++){
            if(str2.contains(""+str1.charAt(i)) && !strLetras.toString().contains(""+str1.charAt(i))){
                strLetras.append(str1.charAt(i));

            }
        }

        for(i=0; i<str2.length();i++){
            if(str1.contains(""+str2.charAt(i)) && !strLetras.toString().contains(""+str2.charAt(i))){
                strLetras.append(str2.charAt(i));
            }
        }
        return ordenaletras(strLetras.toString());

    }
    public static String ordenaletras(String str){
        char[] vet = new char[str.length()];
        int i;
        for(i=0;i<str.length();i++){
            vet[i] = str.charAt(i);
        }
        Arrays.sort(vet);

        StringBuilder strreturn = new StringBuilder();
        for(i=0; i<vet.length;i++)
            strreturn.append(vet[i]);
        return strreturn.toString();
    }
}