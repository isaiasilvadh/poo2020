package herenciaautomotriz;

import java.util.Scanner;
public class EmpVendedor extends Empleado{
    private String nombre;
    private String departamento;
    private String puesto;
    private int autos_vendidos;
    private double sueldo_quincenal;
    private String reporte;
    Scanner teclado = new Scanner(System.in);
    public EmpVendedor (String nombre, String departamento, String puesto){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAutos_vendidos() {
        return autos_vendidos;
    }

    public void setAutos_vendidos(int autos_vendidos) {
        this.autos_vendidos = autos_vendidos;
    }

    public void calculaSueldoVendedor (){
        System.out.println("Ingrese cuantos autos vendió: ");
        autos_vendidos = teclado.nextInt();
        double cont =0;
        double aux = 0;
        for (int i=0; i < autos_vendidos; i++){
            System.out.println("Ingrese el costo del auto "+(i+1));
            sueldo_quincenal= teclado.nextDouble();
            aux += sueldo_quincenal;
        }
        cont = 400 + (aux * 0.02);
        reporte = String.format("%s          %s          %s          %.2f\n",nombre,departamento,puesto,cont);
    }
    public String Obtener_Sueldo_Ven(){
        return reporte;
    }
}
