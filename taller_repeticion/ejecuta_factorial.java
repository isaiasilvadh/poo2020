package taller_repeticion;
// Isaias Silva, Jefferson Cueva, Frank Saca
import java.util.Scanner;

public class ejecuta_factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declaracion de variable
        String valor;
        // Ciclo para que se realize por lo menos una ves
        do {
            // requeriemiento y almacenamiento de datos
            System.out.println("Ingrese un numero: ");
            int num = entrada.nextInt();
            // creacion del objeto
            Factorial factorial = new Factorial(num);
            // calculo del factorial
            factorial.calculaFactorial();
            // presentacion del factorial
            System.out.println(factorial.obtenerFactorial());
            // limpieza de buffer
            entrada.nextLine();
            // COndicion si desea ingresar mas datos
            System.out.println("Presione si para ingresar otro numero");
            valor = entrada.nextLine();
        }while (valor.equals("si"));
    }
}

