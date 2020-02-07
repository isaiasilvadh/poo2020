package taller1;

public class Computadora {
    private String marca, precio, caracteristicas;

    /**
     * Metodo para obtener el precio de la computadora
     * @return
     */
    public String obtener_precio(){
        return precio;
    }

    /**
     * Metodo para obtener la marca de la computadora
     * @return
     */
    public String obtener_marca(){
        return marca;
    }

    /**
     * Metodo para obtener las caracteristicas de la computadora
     * @return
     */
    public String obtener_caracteristicas(){
        return caracteristicas;
    }

    /**
     * Metodo para actualizar  la marca de la computadora
     * @param marca
     */
    public void actualizar_marca (String marca){
        this.marca = marca;
    }

    /**
     * Metodo para actualizar  el precio  de la computadora
     * @param precio
     */
    public void actualizar_precio (String precio){
        this.precio = precio;
    }

    /**
     * Metodo para actualizar  las caracteristicas de la computadora
     * @param caracteristicas
     */
    public void actualizar_caracteristicas (String caracteristicas){
        this.caracteristicas = caracteristicas;
    }
    public String obtener_computadora () {
        String computadora  = "Marca de la computadora: " +marca +"precio de la computadora: " +precio +"caracteristicas de la computadora: " +caracteristicas;
        return computadora;
    }


}
