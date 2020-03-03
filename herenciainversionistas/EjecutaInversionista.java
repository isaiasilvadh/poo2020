package herenciainversionistas;

import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomCliente;
        int numCliente, numCuenta, op = 0;
        double capInvert, plazInver, inteAnual = 0;

        String cadena2 = "" ;
        System.out.println("CALCULO DE SUELDO DE EMPLEADOS");
        String cadena = "REPORTE DE INVERSIONES\nNo.Cliente\t\t\tNOMBRE\t\t\t\tNo.Cuenta\t\t\t\tInterés GANADO\n";
        cadena += "-----------------------------------------------------------------------------------------";
        boolean salir = true;
        while(salir == true){
            // Menú para ingreso de datos
            System.out.println("1. Para calcular el interes de la Cuenta de Ahorro");
            System.out.println("2. Para calcular el interes de la Cuenta de Pagaré");
            System.out.println("3. Para calcular el interes de la Cuenta  Maestra");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    System.out.print("Numero  del Cliente: ");
                    teclado.nextLine();
                    numCliente = teclado.nextInt();
                    System.out.print("Nombre del Cliente: ");
                    teclado.nextLine();
                    nomCliente = teclado.nextLine();
                    System.out.print("Numero de Cuenta: ");
                    numCuenta = teclado.nextInt();
                    System.out.print("Capital invertido: ");
                    capInvert = teclado.nextDouble();
                    System.out.print("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();
                    Ahorro ahorro = new Ahorro(nomCliente, numCliente, numCuenta, capInvert, plazInver, inteAnual);
                    cadena2 += "\t\t"+ahorro.getNumCliente()+"\t\t\t"+ahorro.getNomCliente()+"\t\t\t"
                            +ahorro.getNumCuenta()+"\t\t\t"+ahorro.calcularInteresAhorro()+"\n";
                    break;
                case 2:
                    System.out.print("Numero  del Cliente: ");
                    teclado.nextLine();
                    numCliente = teclado.nextInt();
                    System.out.print("Nombre del Cliente: ");
                    teclado.nextLine();
                    nomCliente = teclado.nextLine();
                    System.out.print("Numero de Cuenta: ");
                    numCuenta = teclado.nextInt();
                    System.out.print("Capital invertido: ");
                    capInvert = teclado.nextDouble();
                    System.out.print("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();
                    Pagare pagare = new Pagare(nomCliente, numCliente, numCuenta, capInvert, plazInver, inteAnual);

                    cadena2 += "\t\t"+pagare.getNumCliente()+"\t\t\t  "+pagare.getNomCliente()
                            +"\t\t\t"+pagare.getNumCuenta()+"\t\t\t"+pagare.calcularInteresPagare()+"\n";

                    break;

                case 3:
                    System.out.print("Numero  del Cliente: ");
                    teclado.nextLine();
                    numCliente = teclado.nextInt();
                    System.out.print("Nombre del Cliente: ");
                    teclado.nextLine();
                    nomCliente = teclado.nextLine();
                    System.out.print("Numero de Cuenta: ");
                    numCuenta = teclado.nextInt();
                    System.out.print("Capital invertido: ");
                    capInvert = teclado.nextDouble();
                    System.out.print("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();
                    Maestra maestra = new Maestra(nomCliente, numCliente, numCuenta, capInvert, plazInver, inteAnual);
                    cadena2 += "\t\t"+maestra.getNumCliente()+"\t\t\t  "+maestra.getNomCliente()
                            +"\t\t\t"+maestra.getNumCuenta()+"\t\t\t "+maestra.calcularInteresMaestra()+"\n";
                    break;


            }
            teclado.nextLine();
            System.out.println("Desea seguir calculando a los inversionistas Ingrese Si/No");
            String cancelar = teclado.nextLine().toUpperCase();
            if (cancelar.equals("NO")){
                System.out.println(cadena+"\n" + cadena2 );
                op = 5;
            }else{
                System.out.println();
                op = 4;

            }

        }
    }
}
