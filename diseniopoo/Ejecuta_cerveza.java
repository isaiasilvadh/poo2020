package diseniopoo;

import java.util.Scanner;

public class Ejecuta_cerveza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingresar nombre de cerveza");
        String nombre = teclado.nextLine();
        System.out.println("Ingresar tipo de Cerveza");
        String tipo = teclado.nextLine();
        System.out.println("Ingresar unidades de cervezas");
        int unidades = teclado.nextInt();
        System.out.println("Ingresar precio de Cerveza");
        double precio = teclado.nextDouble();


        Cerveza cerveza = new Cerveza (precio,unidades,nombre,tipo);
        System.out.println(cerveza.presentar());
    }
}
