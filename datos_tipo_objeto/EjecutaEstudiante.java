package datos_tipo_objeto;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont;
        int op;
        int edad =0;
        Estudiante [] estudiantes= new Estudiante[3];
        Estudiante estudiante;
        boolean bandera = true;
        for(cont = 0; cont<estudiantes.length; cont++){
            System.out.println("INGRESO DE NUEVO ESTUDIANTE");
                Estudiante est = new Estudiante();
                System.out.print("Ingrese nombre: ");
                est.setNombre(teclado.nextLine());
                System.out.print("Ingrese cedula: ");
                est.setCedula(teclado.nextLine());
                System.out.print("Ingrese edad: ");
                est.setEdad(teclado.nextInt());
                teclado.nextLine();
                System.out.print("Ingrese carrera: ");
                est.setCarrera(teclado.nextLine());
                System.out.print("Ingrese correo: ");
                est.setCorreo(teclado.nextLine());
                //Asignamos el objeto est a la variable estudiante
                estudiantes[cont] = est;

            }
        System.out.println("LISTA DE ESTUDIANTES");

        for (cont =0; cont <estudiantes.length; cont++){
            edad +=estudiantes[cont].getEdad();
            System.out.println("Nombre: "+estudiantes[cont].getNombre());
            System.out.println("Cedula: "+estudiantes[cont].getCedula());
        }
        System.out.println("Edad promedio de los estudiantes: "+edad/estudiantes.length);
        System.out.println("Fin del programa");
    }
}
