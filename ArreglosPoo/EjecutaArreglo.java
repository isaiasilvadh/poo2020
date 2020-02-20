package ArreglosPoo;

import java.util.Scanner;

public class EjecutaArreglo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arregloA = new int[10];
        int[] arregloB = new int[10];

        for (int i=0; i<arregloA.length; i++){
            System.out.println("ingresar valor para arreglo a");
            arregloA[i] = teclado.nextInt();
            System.out.println("ingresar valor para arreglo b");
            arregloB[i] = teclado.nextInt();
        }
        Arreglo arreglo = new Arreglo (arregloA, arregloB);
        arreglo.calcularSumatoriaProducto();
        System.out.println("Arreglo a: ");
        arreglo.presentarA();
        System.out.println("Arreglo b: ");
        arreglo.presentarB();
        System.out.println("la sumatoria del producto de los arreglos es: " +arreglo.obtenerSumatoriaProductos() );

    }
}
