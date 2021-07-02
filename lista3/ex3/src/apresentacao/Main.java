package apresentacao;
import dados.Matriz;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int op=0;
        while(op != -1){
            Matriz<Integer> mat = new Matriz<>(5,5);
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    System.out.print("mat["+i+"]["+j+"] = ");
                    mat.set(Integer.parseInt(scanner.nextLine()), i, j);
                }
            }
            System.out.println("Matriz:\n" + mat);
            System.out.println("Quadrant1" + mat.getElementosQuadrante(Matriz.Quadrante.PRIMEIRO));
            System.out.println("Quadrant2" + mat.getElementosQuadrante(Matriz.Quadrante.SEGUNDO));
            System.out.println("Quadrant3" + mat.getElementosQuadrante(Matriz.Quadrante.TERCEIRO));
            System.out.println("Quadrant4" + mat.getElementosQuadrante(Matriz.Quadrante.QUARTO));
            System.out.print("Digite qualquer valor para continuar(-1 para para): ");
            op = Integer.parseInt(scanner.nextLine());
        }
    }

}