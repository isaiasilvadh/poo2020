package polimorfismo;

import herencia_empleado.EmpleadoPorHoras;

import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        double horas;
        double cuota;
        double sueldo;

        EmpleadoPorHoras2 empHoras = new EmpleadoPorHoras2();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculo sueldo quincenal");
        System.out.println("Ingrese horas trabajadas");
        empHoras.setHoras_trabajadas(teclado.nextDouble());
        System.out.println("ingrese cuota por hora");
        empHoras.setCuota_por_hora(teclado.nextDouble());
        empHoras.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: "+empHoras.getSueldo());

        EmpleadoAsalariado2 empAs = new EmpleadoAsalariado2();
        System.out.println("suedo quincenal empleado asalariado");
        System.out.println("Ingrese sueldo mensual");
        empAs.setSueldo_mensual(teclado.nextDouble());
        empAs.calcularSueldoQna();
        System.out.println("Sueldo quincenal: "+empAs.getSueldo());
    }
}
