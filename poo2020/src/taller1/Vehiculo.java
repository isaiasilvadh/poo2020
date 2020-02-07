package taller1;

public class Vehiculo {
    private String marca, modelo, cilindraje;

    /**
     * Metodo para obtener la marca del vehiculo
     * @return
     */
    public String obtener_marca(){
        return marca;
    }

    /**
     * Metodo para obtener el modelo del vehiculo
     * @return
     */
    public String obtener_modelo(){
        return modelo;
    }

    /**
     * Metodo para obtener el cilindraje del vehiculo
     * @return
     */
    public String obtener_cilindraje(){
        return cilindraje;
    }

    /**
     * Metodo para actualizar la marca del vehiculo
     * @param marca
     */
    public void actualizar_marca (String marca){
        this.marca = marca;
    }

    /**
     * Metodo para actualizar el modelo del vehiculo
     * @param modelo
     */
    public void actualizar_modelo (String modelo){
        this.modelo = modelo;
    }

    /**
     * Metodo para actualizar  el cilindraje
     * @param cilindraje
     */
    public void actualizar_cilindraje (String cilindraje){
        this.cilindraje = cilindraje;
    }

    /**
     * obtener la informacion del vehiculo
     * @return
     */
    public String obtener_vehiculo () {
        String vehiculo  = "marca del vehiculo: " +modelo +"modelo del vehiculo: " +modelo +"cilindraje del vehiculo: " +cilindraje;
        return vehiculo;
    }
}
