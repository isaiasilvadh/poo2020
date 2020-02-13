package Deber_seleccion;

import java.util.Scanner;

public class Ejecuta_numero_mayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingresar segundo numero");
        int num2 = teclado.nextInt();
        System.out.println("Ingresar tercer numero");
        int num3 = teclado.nextInt();
        System.out.println("Ingresar cuarto numero");
        int num4 = teclado.nextInt();
        Numero_mayor numero_mayor = new Numero_mayor(num1,num2,num3,num4);
        numero_mayor.Calcular_numero();
        System.out.println("El numero mayor es: " +numero_mayor.Obtener_mayor());

        }
    }

