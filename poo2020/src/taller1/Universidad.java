package taller1;

import java.util.SplittableRandom;

public class Universidad {

    private String direccion, carreras, areas;

    /**
     * Metodo para obtener la direccion
     * @return
     */
    public String obtener_direccion(){
        return direccion;
    }

    /**
     * Metodo para obtener las carreras
     * @return
     */
    public String obtener_carreras(){
        return carreras;
    }

    /**
     * Metodo para obtener las areas
     * @return
     */
    public String obtener_areas (){
        return areas;
    }

    /**
     * Metodo para actualizar la direccion
     * @param direccion
     */
    public void actualizar_direccion (String direccion){
        this.direccion = direccion;
    }

    /**
     * Metodo para actualizar las carreras
     * @param carreras
     */
    public void actualizar_carreras (String carreras){
        this.carreras =carreras;
    }

    /**
     * Metodo para actualizar las areas
     * @param areas
     */
    public void actualizar_areas (String areas){
        this.areas = areas;
    }

    /**
     * obtener la informacion de la universidad
     * @return
     */
    public String obtener_universidad () {
        String universidad  = "Direccion de universidad: " +direccion +"carreras de universidad: " +carreras +"areas de universidad: " +areas;
        return universidad;
    }
}
