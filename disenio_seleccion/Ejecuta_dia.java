package disenio_seleccion;

import java.util.Scanner;

public class Ejecuta_dia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar numero");
        int num = teclado.nextInt();
        Dia dia = new Dia(num);
        dia.Calcular_nombre();
        dia.obtener_nombre();
    }
}
