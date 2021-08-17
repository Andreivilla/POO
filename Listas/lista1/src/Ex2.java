import java.util.Random;
import java.util.Scanner;

/*Exercio 2:
    Crie um programa em Java que leia dois inteiros n e m e do usuario e gere aleatoriamente
    duas matrizes m1 e m2 de ordens nxm (utilize a classe Random para isso) e exiba no console
    as matrizes m3 e m4, calculadas da seguinte forma:
    • m3: o maior elemento entre m1i;j e m2i;j. Por exemplo, m10;0 = 4 e m20;0 = 7, então
    m30;0 = 7.
    • m4: uma matriz onde os elementos acima da diagonal principal, incluindo ela, são 00s,
    e os elementos abaixo da diagonal principal são o menor valor encontrado em m1i;j e
    m2i;j .*/
public class Ex2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n,m;
        n = scanner.nextInt();
        scanner.nextLine();
        m = scanner.nextInt();
        scanner.nextLine();
        int[][] m1 = new int[m][n];
        int[][] m2 = new int[m][n];

        //cria matrrizes randomicas
        randomMatriz(m1);
        randomMatriz(m2);
        //printa matrizes
        printaMatriz(m1);
        printaMatriz(m2);
        //matriz dos maiores elementos
        int[][] m3 = matrizMaior(m1, m2);
        printaMatriz(m3);
        //matriz dos menores elementos
        int[][] m4 = matrizDiagonal(m1,m2);
        printaMatriz(m4);

    }
    public static void randomMatriz(int[][] mat){
        Random random = new Random();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                mat[i][j] = random.nextInt(100);
            }
        }
    }
    public static void printaMatriz(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static int[][] matrizMaior(int[][] mat1, int[][] mat2){
        int[][] mat3 = new int[mat1.length][mat1[0].length];
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[0].length; j++){
                if(mat1[i][j]>mat2[i][j])
                    mat3[i][j] = mat1[i][j];
                else
                    mat3[i][j] = mat2[i][j];
            }
        }
        return mat3;
    }
    public static int[][] matrizDiagonal(int[][]mat1, int[][] mat2){
        int[][] mat3 = new int[mat1.length][mat1[0].length];
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[0].length; j++){
                if(i>j) {
                    if (mat1[i][j] < mat2[i][j])
                        mat3[i][j] = mat1[i][j];
                    else
                        mat3[i][j] = mat2[i][j];
                }else
                    mat3[i][j] = 0;
                    /*11 12 13
                    21 22 23
                    31 32 33*/
            }
        }
        return mat3;
    }
}
