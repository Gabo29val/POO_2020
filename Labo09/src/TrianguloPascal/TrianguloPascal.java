package TrianguloPascal;

//import java.util.Scanner;

public class TrianguloPascal {

//    public static void main(String[] args) {
//        int[][] numeros;
//        int filas;
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.print("Nro filas: ");
//        filas = entrada.nextInt();
//        numeros = new int[filas][filas * 2 - 1];
//
//        llenarDatos(numeros, filas);
//
//        mostrarMatriz(numeros, filas, filas * 2 - 1);
//    }

    public static void llenarDatos(int[][] numeros, int filas){
        numeros[0][filas - 1] = 1;

        for (int i = 1; i < filas; i++) {
            for (int j = 1; j < filas * 2 - 2; j++) {
                numeros[i][j] = numeros[i-1][j-1] + numeros[i-1][j+1];
            }
        }
        
        numeros[filas-1][0]=1;
        numeros[filas-1][filas*2-2]=1;
    }

    public static void mostrarMatriz(int numeros[][], int f, int c) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(numeros[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    
    public static int [][] getMatriz(int filas){
        int [][] matriz = new int[filas][filas * 2 - 1];
        llenarDatos(matriz, filas);
        return matriz;
    }
}
