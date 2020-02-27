package herencia_empleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre, cargo, dependencia;
        int horas;
        double valorHora, valor_mensual;
        System.out.println("| 1 Para sueldo de empleado por hora |");
        System.out.println("| 2 Para sueldo salarial de empleado |");
        System.out.println("______________________________________");
        int op = entrada.nextInt();
        switch (op) {
            case 1 :

                System.out.println("Empleado Por Horas");
                System.out.print("Ingrese el nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.print("Ingrese el Cargo: ");
                cargo = entrada.nextLine();
                System.out.print("Ingrese la dependencia: ");
                dependencia = entrada.nextLine();
                System.out.print("Ingrese las horas trabajadas: ");
                horas = entrada.nextInt();
                System.out.print("Ingrese el valor por hora: ");
                valorHora = entrada.nextDouble();
                // creacion del objeto y uso del constructor
                EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(nombre, cargo, dependencia, horas, valorHora);
                // Presentacion de datos
                // datos del empleado por horas
                System.out.println("__________________________________");
                System.out.println("|  Datos del empleado por horas");
                System.out.println("|  Nombre: "+empleadoPorHoras.getNombre());
                System.out.println("|  Cargo: "+empleadoPorHoras.getCargo());
                System.out.println("|  Dependencia: "+empleadoPorHoras.getDependencia());
                System.out.println("|  Horas trabajadas: "+empleadoPorHoras.getHora());
                System.out.println("|  Valor por horas: "+empleadoPorHoras.getValorHora());
                System.out.println("|  Sueldo final: "+empleadoPorHoras.calcularSueldo());
                System.out.println("__________________________________");
                break;
            case 2:
                // para el empleado asalariado
                System.out.println("Empleado Asalariado");
                System.out.print("Ingrese el nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.print("Ingrese el Cargo: ");
                cargo = entrada.nextLine();
                System.out.print("Ingrese la dependencia: ");
                dependencia = entrada.nextLine();
                System.out.print("Ingrese el valor mensual: ");
                valor_mensual = entrada.nextInt();
                // creacion del objeto y uso del constructor
               EmpleadoSalariado empleadosalariado= new EmpleadoSalariado (nombre, cargo, dependencia, valor_mensual);
                // Presentacion de datos
                // datos del empleado por asalariado
                System.out.println("__________________________________");
                System.out.println("|  Datos del empleado salariado");
                System.out.println("|  Nombre: "+empleadosalariado.getNombre());
                System.out.println("|  Cargo: "+empleadosalariado.getCargo());
                System.out.println("|  Dependencia: "+empleadosalariado.getDependencia());
                System.out.println("|  Sueldo final: "+empleadosalariado.getValor_mensual());
                System.out.println("__________________________________");
                break;
            default:
                System.out.println("ingresar correctamente la opcion");
        }

    }
}