package Deber_seleccion;

import java.util.Scanner;
public class Ejecuta_sueldo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese las horas de trabajo");
        int horas = entrada.nextInt();
        System.out.println("Ingrese pago por hora");
        double cuota = entrada.nextDouble();
        Sueldo sueldo = new Sueldo(nombre,horas,cuota);
        sueldo.Calcular_sueldo();
        System.out.println("Nombre del empleado: "+sueldo.Obtener_nombre());
        System.out.println("Sueldo a cobrar: "+sueldo.Obtener_sueldo());
    }
}

