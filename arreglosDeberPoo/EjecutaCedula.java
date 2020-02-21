package arreglosDeberPoo;

import java.util.Scanner;
public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar número de cédula: ");
        int numCedula = entrada.nextInt();
        Cedula cedula = new Cedula(numCedula);
        cedula.verificar();
        System.out.println(cedula.obtenerEstado());
    }
}
