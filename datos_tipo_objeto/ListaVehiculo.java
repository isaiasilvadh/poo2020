package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op;
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        boolean b = true;

        System.out.println("SISTEMA DE INGRESO DE VEHICULOS");
        do{
            System.out.println("Digite 1 Para almacenar nuevo: ");
            System.out.println("Digite 2 Para presentar: ");
            System.out.println("Digite 3 Para salir: ");
            op= teclado.nextInt();
            teclado.nextLine();
            switch (op){
                case 1:
                    Vehiculo vehiculo = new Vehiculo();
                    System.out.print("Ingrese placa del vehiculo: ");
                    vehiculo.setPlaca(teclado.nextLine());
                    System.out.print("Ingrese marca del vehiculo: ");
                    vehiculo.setMarca(teclado.nextLine());
                    System.out.print("Ingrese modelo del vehiculo: ");
                    vehiculo.setModelo(teclado.nextLine());
                    System.out.print("Ingrese color del vehiculo: ");
                    vehiculo.setColor(teclado.nextLine());
                    System.out.print("Ingrese año del vehiculo: ");
                    vehiculo.setAnio(teclado.nextInt());
                    teclado.nextLine();
                    System.out.print("Ingrese cilindraje del vehiculo: ");
                    vehiculo.setCilindraje(teclado.nextInt());
                    teclado.nextLine();
                    vehiculos.add(vehiculo);
                    break;
                case 2:
                   // System.out.println("Placa\tMarca\tCilindraje");
                    System.out.println("FICHA DE VEHICULOS REGISTRADOS");
                    for (Vehiculo v: vehiculos){
                        System.out.println("----------------------------");
                        System.out.println("Placa: "+v.getPlaca());
                        System.out.println("Marca: "+v.getMarca());
                        System.out.println("Modelo: "+v.getModelo());
                        System.out.println("Año: "+v.getAnio());
                        System.out.println("Cilindraje: "+v.getCilindraje());
                        System.out.println("Color: "+v.getColor());
                        System.out.println("----------------------------");
                       // System.out.println(v.getPlaca()+"\t"+v.getMarca()+"\t"+v.getCilindraje());
                    }
                    break;
                case 3: b=false;
            }
        }while(b);
    }
}
