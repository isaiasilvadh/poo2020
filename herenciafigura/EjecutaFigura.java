package herenciafigura;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int op;
        double base, altura, radio, lado;
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
        switch (op){
            //Area triangulo
            case 1:
                teclado.nextLine();
                System.out.println("Ingrese el nombre de la figura: ");
                nombre = teclado.nextLine();
                System.out.println("Ingresar altura del triangulo:");
                altura = teclado.nextDouble();
                System.out.println("Ingresar base del triangulo: ");
                base = teclado.nextDouble();
                Triangulo triangulo = new Triangulo(nombre, base, altura);
                System.out.println("Nombre: " + triangulo.getNombre() + "\nEl área del triángulo es: "+ triangulo.calcularAreaTri());
                System.out.println("-------------------------------------");
                break;
            case 2:
                teclado.nextLine();
                System.out.println("Ingrese el nombre de la figura: ");
                nombre = teclado.nextLine();
                    System.out.println("Ingresar base del rectángulo");
                    base = teclado.nextDouble();
                    System.out.println("Ingresar base del rectángulo");
                    altura = teclado.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(nombre, base, altura);
                    System.out.println("Nombre: " + rectangulo.getNombre() + "\nEl área del rectángulo es: "+rectangulo.calculaAreaRec());
                System.out.println("-------------------------------------");
                break;
            case 3:
                teclado.nextLine();
                System.out.println("Ingrese el nombre de la figura: ");
                nombre = teclado.nextLine();
                System.out.println("Ingrese el lado del cuadrado");
                lado = teclado.nextDouble();
                Cuadrado cuadrado = new Cuadrado(nombre, lado);
                System.out.println("Nombre: " + cuadrado.getNombre() + "\nEl área del cuadrado es: " + cuadrado.calcularAreaCuad());
                System.out.println("-------------------------------------");
                break;
            case 4:
                teclado.nextLine();
                System.out.println("Ingrese el nombre de la figura: ");
                nombre = teclado.nextLine();
                System.out.println("Ingrese el radio del circulo");
                radio = teclado.nextDouble();
                Circulo circulo= new Circulo(nombre, radio);
                System.out.println("Nombre: " + circulo.getNombre() + "\nEl área del cuadrado es: " + circulo.calcularAreaCir());
                System.out.println("-------------------------------------");
                break;
        }

    }
}
