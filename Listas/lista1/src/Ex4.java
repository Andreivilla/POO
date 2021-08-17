import java.util.Scanner;

/*Exerccio 4:
Implemente em Java um programa que calcule as operações de exponenciação e resto de
divisão utilizando metodos iterativos. Soluções prontas da linguagem nãoo serão consideradas!*/
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,n;
        while(true) {
            switch (menu()) {
                case 1:
                    System.out.println("");
                    System.out.print("x: ");
                    x = Integer.parseInt(scanner.nextLine());
                    System.out.print("n: ");
                    n = Integer.parseInt(scanner.nextLine());
                    System.out.println("Exp = " + exp(x,n));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("x: ");
                    x = Integer.parseInt(scanner.nextLine());
                    System.out.print("n: ");
                    n = Integer.parseInt(scanner.nextLine());
                    System.out.println("Resto = " + resto(x,n));
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Fechando programa");
                    return;
            }
        }
    }
    public static int menu(){
        int[] ops = {0,1,2};
        int op = -1;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1 - Exponenciação(x^n)");
            System.out.println("2 - Resto(x%n)");
            System.out.println("0 - Sair");
            op = scanner.nextInt();
            scanner.nextLine();//pegar enter do buffer
            for (int opp : ops) {
                if (op == opp)
                    return op;
            }
            System.out.println("opção invalida");
        }
    }
    //exponenciação
    public static long exp(int x, int n){
        int i;
        long exp = 1;
        for(i=0; i<n; i++) {
            exp = x * exp;
        }
        return exp;
    }
    public static double resto(int x, int n){
        double div_com_virgula = (double)x/(double)n;
        int div_sem_virgula = x/n;
        return div_com_virgula - div_sem_virgula;
    }
}
