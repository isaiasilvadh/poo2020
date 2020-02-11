package diseniopoo;

import java.util.Scanner;

public class Ejecuta_estudiante {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresar nombre: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingresar Materia: ");
            String materia = teclado.nextLine();
            System.out.println("Ingresar la nota del Primer Bimestre: ");
            double nota1 = teclado.nextDouble();
            System.out.println("Ingresar la nota del Segundo Bimestre: ");
            double nota2 = teclado.nextDouble();
            Estudiante estudiante = new Estudiante(nombre, materia,nota1, nota2);
            estudiante.Presentar_datos();
        }
    }
