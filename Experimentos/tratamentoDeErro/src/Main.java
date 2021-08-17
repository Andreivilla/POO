import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Teste teste = new Teste();
        int n=0;
        while(n<0){
            System.out.print("a: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("b: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.print("n: ");
            n = Integer.parseInt(scanner.nextLine());
            try{
                System.out.println(teste.soma(a, b));
            }catch(DeuRuimNaMain e){
                e.printStackTrace();
            }
        }
    }
}
