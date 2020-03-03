package herenciadeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaración de variables
        String nombre, nroCuenta, op, reporteP = "", reporteH = "", reporteA = "";
        double capital;
        int total = 0;
        int nroCliente1 = 0, nroCliente2 = 0, nroCliente3 = 0, plazo,n;
        //Ciclo repetitivo para mostrar el menú las veces que el usuario desee
        do {
            total ++;
            System.out.println("----Sistema de ingreso----");
            System.out.println("___________________________");
            System.out.print("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese el número de cuenta: ");
            nroCuenta = entrada.nextLine();
            System.out.print("Ingrese el capital: ");
            capital = entrada.nextDouble();
            System.out.print("Ingrese el plazo anual: ");
            plazo = entrada.nextInt();
            do{
                // Menú para elegir la opción que desea realizar el cliente

                System.out.println("---- Elija el tipo de prestamo ---- ");
                System.out.println(" 1. Ingreso por prestamo personal");
                System.out.println(" 2. Ingreso por prestamo hipotecario");
                System.out.println(" 3. Ingreso por prestamo automovil");
                n = entrada.nextInt();
            }while(n > 3 || n < 1);
            switch (n) {
                case 1:
                    //  Caso 1 para el prestamo personal
                    nroCliente1++;
                    PrestamoPersonal personal = new PrestamoPersonal(nroCliente1, nombre, nroCuenta, capital, plazo);
                    personal.calcularPagoFinal();
                    reporteP = String.format("%s%s", reporteP,personal.obtenerReporte());
                    break;
                case 2:
                    // Caso 2 para el prestamo hipotecario
                    nroCliente2++;
                    PrestamoHipotecario hipotecario = new PrestamoHipotecario(nroCliente2, nombre, nroCuenta, capital, plazo);
                    hipotecario.calcularPagoFinal();
                    reporteH = String.format("%s%s", reporteH,hipotecario.obtenerReporte());
                    break;
                case 3:
                    // Caso 3 para el prestamo Automovil
                    nroCliente3++;
                    PrestamoAutomovil automovil = new PrestamoAutomovil(nroCliente3, nombre, nroCuenta, capital, plazo);
                    automovil.calcularPagoFinal();
                    reporteA = String.format("%s%s", reporteA,automovil.obtenerReporte());
                    break;
            }
            entrada.nextLine();
            System.out.println("Presione '0' para ingresar otro cliente u otra tecla para mostrar el reporte");
            op = entrada.nextLine();
        }while (op.toLowerCase().equals("0"));

        //Reporte de los clientes deudores
        System.out.println("\t   ---------------Reporte de Deudores---------------\n"+
                "No. Cliente        Nombre        No. Cuenta        Interés por pagar\n"+
                "____________________________________________________________________\n"
                + reporteP + reporteH + reporteA +
                "____________________________________________________________________\n");
        System.out.println("Total de Clientes: " +total);
    }
}
