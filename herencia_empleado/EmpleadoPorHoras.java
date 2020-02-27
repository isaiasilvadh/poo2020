package herencia_empleado;

public class EmpleadoPorHoras extends Empleado{
    /**
     * Constructor de la clase
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param hora
     * @param valorHora
     */
    public EmpleadoPorHoras (String nombre, String cargo, String dependencia, int hora, double valorHora){
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.hora = hora;
        this.valorHora = valorHora;
    }
    private int hora;
    private double valorHora;
    private double sueldo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método para calcular el sueldo
     * @return
     */
    public double calcularSueldo(){
        sueldo = hora * valorHora;
        return sueldo;
    }
}
