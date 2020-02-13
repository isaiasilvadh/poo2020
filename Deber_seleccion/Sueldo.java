package Deber_seleccion;


public class Sueldo {

    private String nombre;
    private int horas;
    private double sueldo;
    private double cuota;

    /**
     * Método construtor de la clase sueldo
     */
    public Sueldo(String nombre, int horas, double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.cuota = cuota;
    }

    /**
     * Método para obtener el nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para actualizar el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener las horas
     * @return
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Método para actualizar las horas
     * @param horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * Método para obtener el sueldo
     * @return
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Método para actualizar el sueldo
     * @param sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método para obtener el costo por hora
     * @return
     */
    public double getCuota() {
        return cuota;
    }

    /**
     * Método para actualizar la cuota
     * @param cuota
     */
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    /**
     * Método para calcular el sueldo
     */
    public void Calcular_sueldo(){
        if(horas <= 40){
            sueldo = horas * cuota;
        }else {
            if (horas <= 50) {
                sueldo = (40 * cuota) + ((horas - 40) * (cuota * 2));
            } else {
                sueldo = ((40 * cuota) + (10 * cuota * 2)) + ((horas - 50) + (cuota * 3));
            }
        }
    }

    /**
     * Método que retorna el nombre
     * @return
     */
    public String Obtener_nombre(){
        return nombre;
    }

    /**
     * Método que retorna el sueldo
     * @return
     */
    public double Obtener_sueldo(){
        return sueldo;
    }
}
