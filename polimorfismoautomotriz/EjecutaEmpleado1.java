package polimorfismoautomotriz;


import polimorfismo.EmpMecanico1;

import java.util.Scanner;
public class EjecutaEmpleado1 {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String administrativo = "", mecanico = "", vendedor = "";
        int op;
        String opc;
        do {
        do {
        System.out.println("| Ingrese que tipo de empleado es |");
        System.out.println("-------------------------------------");
        System.out.println("| 1. Administrativo  | ");
        System.out.println("| 2. Mecanico        | ");
        System.out.println("| 3. Vendedor        | ");
        System.out.println("-------------------------------------");
        op = teclado.nextInt();
        }while(op > 3 || op < 1);
        switch (op) {
        case 1:
        // Para el empleado administrativo
        EmpAdmvo1 empAdmvo1 = new EmpAdmvo1();
        System.out.print("Ingrese nombre del empleado: ");
        teclado.nextLine();
        empAdmvo1.setNombre(teclado.nextLine());
        System.out.print("Ingrese departamento al que pertenece: ");
        empAdmvo1.setDepartamento(teclado.nextLine());
        System.out.print("Ingrese puesto que ocupa: ");
        empAdmvo1.setPuesto(teclado.nextLine());
        System.out.print("Ingrese su sueldo mensual: ");
        empAdmvo1.setSueldo_mensual(teclado.nextDouble());
        empAdmvo1.calcularQuincena();
        administrativo = String.format("%s%s          %s          %s          %.2f\n",
        administrativo,empAdmvo1.getNombre(),empAdmvo1.getDepartamento(), empAdmvo1.getPuesto(),empAdmvo1.getSueldo_quincenal());
        teclado.nextLine();
        break;
        case 2:
        // Para el empleado tipo mecanico
        EmpMecanico1 empMecanico1 = new EmpMecanico1();
        System.out.print("Ingrese nombre del empleado: ");
        teclado.nextLine();
            empMecanico1.setNombre(teclado.nextLine());
        System.out.print("Ingrese departamento al que pertenece: ");
            empMecanico1.setDepartamento(teclado.nextLine());
        System.out.print("Ingrese puesto que ocupa: ");
            empMecanico1.setPuesto(teclado.nextLine());
            empMecanico1.calcularQuincena();
        mecanico = String.format("%s%s          %s          %s          %.2f\n"
        ,mecanico,empMecanico1.getNombre(),empMecanico1.getDepartamento(),empMecanico1.getPuesto(),empMecanico1.getCont()
        );
        break;
        case 3:
        EmpVendedor1 empVendedor1 = new EmpVendedor1();
        System.out.print("Ingrese nombre del empleado: ");
        teclado.nextLine();
            empVendedor1.setNombre(teclado.nextLine());
        System.out.print("Ingrese departamento al que pertenece: ");
            empVendedor1.setDepartamento(teclado.nextLine());
        System.out.print("Ingrese puesto que ocupa: ");
            empVendedor1.setPuesto(teclado.nextLine());
            empVendedor1.calcularQuincena();
        vendedor = String.format("%s%s          %s          %s          %.2f\n"
        ,vendedor,empVendedor1.getNombre(),empVendedor1.getDepartamento(),empVendedor1.getPuesto(),
                empVendedor1.getCont());
        break;
        }
        System.out.println("Presione 's' para ingresar otro empleado u otra tecla para mostrar el reporte");
        opc = teclado.nextLine();
        } while (opc.toLowerCase().equals("s"));
        System.out.println("  ------------REPORTE DE NOMINA QUINCENAL------------\n" +
        "Nombre      Departamento        Puesto       Saldo Quincenal\n" +
        "____________________________________________________________________\n"
        + administrativo + mecanico + vendedor +
        "____________________________________________________________________\n")
        ;
        }
        }