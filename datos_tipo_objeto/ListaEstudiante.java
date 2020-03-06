package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int op;
        List<Estudiante> estudiante = new ArrayList<Estudiante>();
        boolean b = true;

        System.out.println("LISTA DE ESTUDIANTES");
        do {
            System.out.println("Digite 1 Para ingresar estudiante: ");
            System.out.println("Digite 2 Para presentar: ");
            System.out.println("Digite 3 Para salir: ");
            op = teclado.nextInt();
            teclado.nextLine();
            switch (op) {
                case 1:
                    Estudiante est = new Estudiante();
                    System.out.print("Ingrese nombre: ");
                    est.setNombre(teclado.nextLine());
                    System.out.print("Ingrese cedula: ");
                    est.setCedula(teclado.nextLine());
                    System.out.print("Ingrese carrera: ");
                    est.setCarrera(teclado.nextLine());
                    System.out.print("Ingrese correo: ");
                    est.setCorreo(teclado.nextLine());
                    System.out.print("Ingrese edad: ");
                    est.setEdad(teclado.nextInt());
                    //teclado.nextLine();
                    estudiante.add(est);
                    break;
                case 2:
                    System.out.println("FICHA DE ESTUDIANTES");
                    for (Estudiante e : estudiante) {
                        System.out.println("----------------------------");
                        System.out.println("Nombre: " + e.getNombre());
                        System.out.println("Cedula: " + e.getCedula());
                        System.out.println("Carrera: " + e.getCarrera());
                        System.out.println("Corre: " + e.getCorreo());
                        System.out.println("Edad: " + e.getEdad());
                        System.out.println("----------------------------");

                    }
                    break;
                case 3:
                    b = false;
            }
        } while (b);
    }
}
