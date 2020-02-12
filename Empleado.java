package disenio_seleccion;

public class Empleado {
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;

    /**
     * Metodo constructor
     * @param nombre
     * @param horas
     * @param cuota
     */
    public Empleado(String nombre, int horas,  double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.cuota = cuota;
        this. sueldo = sueldo;
    }

    /**
     * metodo para obtener nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo para  actualizar nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo para obetener hora
     * @return
     */
    public int getHoras() {
        return horas;
    }

    /**
     * metodo para actualizar hota
     * @param horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * metodo para obtener cuota
     * @return
     */
    public double getCuota() {
        return cuota;
    }

    /**
     * metodo para actualizar cuota
     * @param cuota
     */
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    /**
     * metodo para  obtener sueldp
     * @return
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * metodo para  actualizar sueldo
     * @param sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * metodo para  calcular el sueldo
     */
    public void calcular_sueldo (){
        if (horas <= 40) {
            sueldo = horas * cuota;
        }else
            sueldo = (40 * cuota) + (horas - 40) * (cuota * 2);

    }

    /**
     * metodo para  presentar nombre
     */
    public void obtener_nombre (){
        System.out.println(nombre);

    }

    /**
     * metodo para presentar sueldo
     */
    public void obtener_sueldo(){
        System.out.println(sueldo);
    }

}
