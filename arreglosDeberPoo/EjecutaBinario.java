package arreglosDeberPoo;

import java.util.Scanner;

public class EjecutaBinario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el número binario de 6 cifras");
        String numBinario = entrada.nextLine();
        Binario binario = new Binario(numBinario);
        binario.calcularDecimal();
        binario.obtenerDecimal();
    }
}

