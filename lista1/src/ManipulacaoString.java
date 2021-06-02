import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ManipulacaoString {

    public static void main(String[] args) {
        /*String str = "Qualquer coisa só pra testar";

        System.out.println("Tamanho da string: " + str.length());
        System.out.println(str + " concatena");
        System.out.println("Verifica se contem: " + str.contains("xt"));
        System.out.println("Indice de uma palavra: " + str.indexOf("coisa"));
        System.out.println("index da ultima palavra: " + str.lastIndexOf("coisa"));
        System.out.println("todas as letras maisculas: " + str.toUpperCase());
        System.out.println("Todas as letras minusculas: " + str.toLowerCase());
        System.out.println("Remove espaços desnecessarios: " + str.trim());
        System.out.println("Substring do indice: " + str.substring(9));
        System.out.println("verifica igualdade de duas stings: " + str.equals("coisa"));*/

        StringBuilder s1 = new StringBuilder();
        String str = "bacd";
        char[] vet = new char[8];
        /*s1.append('a');
        s1.append('b');
        s1.append('c');
        s1.append('d');*/
        //char a = str.charAt(0);
        //s1.append(a);
        /*s1.append(str.charAt(0));
        s1.append(str.charAt(1));
        s1.append(str.charAt(2));
        s1.append(str.charAt(3));*/
        vet[0] = str.charAt(0);
        vet[1] = str.charAt(1);
        vet[2] = str.charAt(2);
        vet[3] = str.charAt(3);
        Arrays.sort(vet);
        for(char v : vet){
            System.out.println(v);
        }
        s1.append(vet[0]);
        s1.append(vet[1]);
        s1.append(vet[2]);
        s1.append(vet[3]);
        System.out.println(s1);


    }
}
