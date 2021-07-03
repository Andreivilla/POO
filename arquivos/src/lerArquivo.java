import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lerArquivo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc;
        try {
            sc = new Scanner(new File(System.getProperty("user.dir") + "\\src\\test.txt"));
        } catch (FileNotFoundException e) {
            sc = new Scanner(System.in);
        }
        sc.nextInt();
        sc.close();
    }
}
