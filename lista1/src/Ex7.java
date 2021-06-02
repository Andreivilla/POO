import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Date data = new Date(System.currentTimeMillis());
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = Integer.parseInt(scanner.nextLine());
        System.out.print("Mes: ");
        int mes = Integer.parseInt(scanner.nextLine());
        System.out.print("Ano: ");
        int ano = Integer.parseInt(scanner.nextLine());

        Date data1 = new Date();

        Calendar c1 = Calendar.getInstance();

        //Pega data e nascimento
        c1.set(ano, mes, dia);
        data1.setTime(c1.getTimeInMillis());

        System.out.println((data.getTime() - data1.getTime())/1000/60/60/24);
    }
}
