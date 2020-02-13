package Deber_seleccion;

import java.util.Scanner;
public class Ejecuta_alumno {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre del alumno: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese calififacion 1: ");
        double calif1 = teclado.nextDouble();
        System.out.println("Ingrese calififacion 2: ");
        double calif2 = teclado.nextDouble();
        System.out.println("Ingrese calififacion 3: ");
        double calif3 = teclado.nextDouble();
        System.out.println("Ingrese calififacion 4: ");
        double calif4 = teclado.nextDouble();

        Alumno alumno = new Alumno(nombre, calif1, calif2, calif3, calif4);
        alumno.calcularPromedio();
        alumno.calcularObservacion();
        System.out.println("Nombre del alumno: "+alumno.obtenerNombre());
        System.out.println("Promedio de notas: "+alumno.obtenerPromedio());
        System.out.println("Observacion: "+alumno.obtenerObservacio());
    }
}
