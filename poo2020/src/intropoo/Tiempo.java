package intropoo;

public class Tiempo {
    //Definición de atributos
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Metodo para obtener el valor de la variable hora
     * @return
     */
    public int obtener_hora () {
        return hora;
    }

    /**
     * Metodo para obtener el valor de la variable minuto
     * @return
     */
    public int obtener_minuto() {
        return minuto;
    }

    /**
     * Metodo para obtener el valor de la variable segundo
     * @return
     */
    public int obtener_segundo() {
        return segundo;
    }

    /**
     * Metodo para obtener el valor de tiempo
     * @return
     */
    public String obtener_tiempo() {
        String tiempo = hora +":" +minuto +":" +segundo;
        return tiempo;
    }

    /**
     * Metodo para actualizar la hora
     * @param hora
     */
        public void actualizar_hora ( int hora){
            this.hora = hora;
            //Con el this hacemos referencia a variables globales
    }

    /**
     * Metodo para actualizar minutos
     * @param minuto
     */
    public void actualizar_minuto (int minuto){
        this.minuto = minuto;
    }

    /**
     * Metodo para actualizar segundos
     * @param segundo
     */
    public void actualizar_segundo (int segundo){
        this.segundo = segundo;
    }
}
