package polimorfismofigura;

import herenciafigura.Cuadrado;
import herenciafigura.Rectangulo;

import java.util.Scanner;

public class EjecutaFigura3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int op;
        String aux;
        do {
            do {
                System.out.println("| Ingrese la opcion que desea realizar     |");
                System.out.println("--------------------------------------------");
                System.out.println("| 1. para calcular el area de un triángulo | ");
                System.out.println("| 2. para calcular el area de un Rectángulo| ");
                System.out.println("| 3. para calcular el area de un Cuadrado  | ");
                System.out.println("| 4. para calcular el area de un Circulo   | ");
                System.out.println("--------------------------------------------");
                op = teclado.nextInt();
            } while ((op > 4) || (op < 1));
            switch (op) {
                case 1:
                    Triangulo3 triangulo3 = new Triangulo3();
                    System.out.println("Ingrese base");
                    triangulo3.setBaseTria(teclado.nextDouble());
                    System.out.println("Ingrese altura");
                    triangulo3.setAlturaTria(teclado.nextDouble());
                    triangulo3.calcularArea();
                    System.out.println("el area del triangulo es; " + triangulo3.getArea());
                    break;
                case 2:
                    Rectangulo3 rectangulo3 = new Rectangulo3();
                    System.out.println("Ingrese base");
                    rectangulo3.setBaseRecta(teclado.nextDouble());
                    System.out.println("Ingrese altura");
                    rectangulo3.setAlturaRecta(teclado.nextDouble());
                    rectangulo3.calcularArea();
                    System.out.println("el area del rectangulo es; " + rectangulo3.getArea());
                    break;
                case 3:
                    Cuadrado3 cuadrado3 = new Cuadrado3();
                    System.out.println("Ingrese lado");
                    cuadrado3.setLadoCuad(teclado.nextDouble());
                    cuadrado3.calcularArea();
                    System.out.println("el area del cuadrado es; " + cuadrado3.getArea());
                    break;
                case 4:
                    Circulo3 circulo3 = new Circulo3();
                    System.out.println("Ingrese radio");
                    circulo3.setRadioCirc(teclado.nextDouble());
                    circulo3.calcularArea();
                    System.out.println("el area del circulo es; " + circulo3.getArea());
                    break;
            }
            teclado.nextLine();
            System.out.println("ingrese 0 para calcular otra area");
            aux = teclado.nextLine();
        }while (aux.equals("0"));


    }
}
