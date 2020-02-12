package disenio_seleccion;

import java.util.Scanner;

public class Ejecuta_empleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingresar horas trabajadas");
        int horas = teclado.nextInt();
        System.out.println("Ingresar precio por hora");
        double cuota = teclado.nextDouble();
        Empleado empleado = new Empleado(nombre,horas,cuota);
        empleado.calcular_sueldo();
        empleado.obtener_nombre();
        empleado.obtener_sueldo();

    }
}
