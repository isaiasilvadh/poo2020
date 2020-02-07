package taller1;

public class Celular {
    private String marca, precio, caracteristicas;

    /**
     * Metodo para obtener la marca del celular
     * @return
     */
    public String obtener_marca (){
        return marca;
    }

    /**
     * Metodo para obtener el precio del celular
     * @return
     */
    public String obtener_precio (){
        return precio;
    }

    /**
     * Metodo para obtener las caracteristicas del celular
     * @return
     */
    public String obtener_caracteristicas (){
        return caracteristicas;
    }

    /**
     * Metodo para actualizar la marca del celular
     * @param marca
     */
    public void actualizar_marca(String marca){
        this.marca = marca;
    }

    /**
     * Metodo para actualizar el precio del celular
     * @param precio
     */
    public void actualizar_precio (String precio){
        this.precio = precio;
    }

    /**
     * Metodo para actualizar  las caracteristicas del celular
     * @param caracteristicas
     */
    public void actualizar_caracteristicas (String caracteristicas){
        this.caracteristicas = caracteristicas;
    }

    /**
     * obtener la informacion de la computadora
     * @return
     */
    public String obtener_celular () {
        String celular   = "Marca del celular: " +marca +"precio del celular: " +precio +"caracteristicas del celular: " +caracteristicas;
        return celular;
    }


}
