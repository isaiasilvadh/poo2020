package taller1;

public class Estudiante {
    private String nombre, carrera, ciclo;

    /**
     * Metodo para obtener nombre del estudiante
     * @return
     */
    public String obtener_nombre() {
        return nombre;
    }

    /**
     * metodo para obtener carrera del estudiante
     * @return
     */
    public String obtener_carrera(){
        return carrera;
    }

    /**
     * metodo para obtener ciclo del estudiante
     * @return
     */
    public String obtener_ciclo() { return ciclo; }

    /**
     * Metodo para actualizar el nombre del estudiante
     * @param nombre
     */
    public void actualizar_nombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar la carrera del estudiante
     * @param carrera
     */
    public void actualizar_carrera (String carrera){
    this.carrera = carrera;
    }

    /**
     * Metodo para actualizar el ciclo del estudiante
     * @param ciclo
     */
    public void actualizar_ciclo (String ciclo){
    this.ciclo = ciclo;
    }

    /**
     * obtener la informacion del estudiante
     * @return
     */
    public String obtener_estudiante () {
        String estudiante  = "Nombre del estudiante: " +nombre +"Carrera del estudiante: " +carrera +"ciclo del estudiante: " +ciclo;
        return estudiante;
    }
    public void obtener (){

    }



}
