package polimorfismoinversionista;

import java.util.Scanner;

public class EjecutaInversionista1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre, nroCuenta, op, reporteA = "", reporteP = "", reporteM = "";
        double capital;
        int nroCliente = 0, plazo,n;
        // ciclo usado para que se repita el ingreso de datos si desea el usuario
        do {
            // variable para contar los clientes
            // ingreso de datos
            System.out.println("_________________________________________");
            System.out.println("|     $ Banco Central del Ecuador $     |");
            System.out.println("| Sistema de cálculo de interes a favor |");
            System.out.println("_________________________________________");
            System.out.print("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese el numero de cuenta: ");
            nroCuenta = entrada.nextLine();
            System.out.print("Ingrese el capital: ");
            capital = entrada.nextDouble();
            System.out.print("Ingrese el plazo anual: ");
            plazo = entrada.nextInt();
            // ciclo que solicita el tipo de cuenta
            do{
                // Menu para pedir lo que el usuario desea
                System.out.println("Elija el tipo de inversion  ");
                System.out.println(" 1) Ingreso por cuenta de ahorros");
                System.out.println(" 2) Ingreso por pagare");
                System.out.println(" 3) Ingreso por cuenta maestra");
                n = entrada.nextInt();
                // condicion del ciclo
            }while(n > 3 || n < 1);
            nroCliente++;
            switch (n) {
                case 1:
                    CuentaAhorro1 ahorro = new CuentaAhorro1();
                    ahorro.setNombre(nombre);
                    ahorro.setNroCuenta(nroCuenta);
                    ahorro.setCapital(capital);
                    ahorro.setPlazo(plazo);
                    ahorro.total();
                    reporteA = String.format("%s%d                 %s                %s                 %.2f\n"
                            ,reporteA,nroCliente,ahorro.getNombre(),ahorro.getNroCuenta(),ahorro.getTotal());
                    break;
                case 2:
                    Pagare1 pagare = new Pagare1();
                    pagare.setNombre(nombre);
                    pagare.setNroCuenta(nroCuenta);
                    pagare.setCapital(capital);
                    pagare.setPlazo(plazo);
                    pagare.total();
                    reporteP = String.format("%s%d                 %s                %s                 %.2f\n"
                            ,reporteP,nroCliente,pagare.getNombre(),pagare.getNroCuenta(),pagare.getTotal());
                    break;
                case 3:
                    CuentaMaestra1 maestra = new CuentaMaestra1();
                    maestra.setNombre(nombre);
                    maestra.setNroCuenta(nroCuenta);
                    maestra.setCapital(capital);
                    maestra.setPlazo(plazo);
                    maestra.total();
                    reporteM = String.format("%s%d                 %s                %s                 %.2f\n"
                            ,reporteM,nroCliente,maestra.getNombre(),maestra.getNroCuenta(),maestra.getTotal());
                    break;
            }
            entrada.nextLine();
            System.out.println("Presione 's' para ingresar otro cliente");
            op = entrada.nextLine();
        }while (op.toLowerCase().equals("s"));
        // impresion de datos
        System.out.println("\tREPORTE Inversionistas\n"+
                "No. Cliente        Nombre        No. Cuenta        Interés Ganado\n"+
                "____________________________________________________________________\n"
                + reporteA + reporteP + reporteM+
                "____________________________________________________________________\n");
        System.out.println("TOTAL: "+nroCliente+" CLIENTES");
    }
}