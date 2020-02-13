package Deber_seleccion;

public class Alumno {

        private String nombreAlum;
        private String observacion;
        private double calif1;
        private double calif2;
        private double calif3;
        private double calif4;
        private double promedio;

    /**
     * Metodo constructor
     * @param nombreAlum
     * @param calif1
     * @param calif2
     * @param calif3
     * @param calif4
     */
        public Alumno(String nombreAlum, double calif1, double calif2, double calif3, double calif4){
            this.nombreAlum = nombreAlum;
            this.calif1 = calif1;
            this.calif2 = calif2;
            this.calif3 = calif3;
            this.calif4 = calif4;
        }

    /**
     * Método para obtener el nombre
     * @return
     */
    public String getNombreAlum() {
            return nombreAlum;
        }

    /**
     * Método para actualizar el nombre
     * @param nombreAlum
     */
        public void setNombreAlum(String nombreAlum) {
            this.nombreAlum = nombreAlum;
        }

    /**
     * Método para obtener la observacion
     * @return
     */
    public String getObservacion() {
            return observacion;
        }

    /**
     * Método para actualizar la observacion
     * @param observacion
     */
        public void setObservacion(String observacion) {
            this.observacion = observacion;
        }

    /**
     * Método para obtener la calificacion 1
     * @return
     */
    public double getCalif1() {
            return calif1;
        }

    /**
     * Método para actualizar la calificacion 1
     * @param calif1
     */
        public void setCalif1(double calif1) {
            this.calif1 = calif1;
        }

    /**
     * Método para obtener la calificacion 2
     * @return
     */
    public double getCalif2() {
            return calif2;
        }

    /**
     * Método para actualizar la calificacion 2
     * @param calif2
     */
        public void setCalif2(double calif2) {
            this.calif2 = calif2;
        }

    /**
     * Método para obtener la calificacion 3
     * @return
     */
    public double getCalif3() {
            return calif3;
        }

    /**
     * Método para actualizar la calificacion 3
     * @param calif3
     */
        public void setCalif3(double calif3) {
            this.calif3 = calif3;
        }

    /**
     * Método para obtener la calificacion 4
     * @return
     */
    public double getCalif4() {
            return calif4;
        }

    /**
     * Método para actualizar la calificacion 4
     * @param calif4
     */
        public void setCalif4(double calif4) {
            this.calif4 = calif4;
        }

    /**
     * Método para obtener el promedio
     * @return
     */
    public double getPromedio() {
            return promedio;
        }

    /**
     * Método para actualizar el promedio
     * @param promedio
     */
        public void setPromedio(double promedio) {
            this.promedio = promedio;
        }

    /**
     * Método para calcular el promedio
     */
    public void calcularPromedio(){
            promedio = (calif1 + calif2 + calif3 + calif4) /4;
        }

    /**
     * Método para calcular observacion
     */
    public void calcularObservacion(){
            if (promedio >= 60){
                observacion = "Aprobado";
            }else{
                // si no se cumple reprobara
                observacion = "Reprobado";
            }
        }

    /**
     * Método para retornar el nombre
     * @return
     */
    public String obtenerNombre(){
            return nombreAlum;
        }

    /** Método para retornar el promedio
     *
     * @return
     */
    public Double obtenerPromedio(){
            return promedio;
        }

    /**
     * Método para retornar la observacion
     * @return
     */
    public String obtenerObservacio(){
            return observacion;
        }
    }


