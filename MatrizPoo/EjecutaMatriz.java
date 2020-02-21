package MatrizPoo;

import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizC = new int[3][3];

        for	(int i= 0; i<matrizA.length; i++){
            for(int j= 0; j<matrizB.length; j++){
                System.out.println("Ingresar datos para Matriz A fila: "+i+" " +"columna: "+j);
                matrizA[i][j] = teclado.nextInt();
                System.out.println("Ingresar datos para Matriz B fila: "+i+" "  +"columna: "+j);
                matrizB[i][j] = teclado.nextInt();
            }
        }
        Matriz matriz = new Matriz(matrizA,matrizB);
        matriz.calcularSuma();
        matriz.obtenerMatrizA();
        matriz.obtenerMatrizB();
        matriz.obtenerSuma();
    }
}
