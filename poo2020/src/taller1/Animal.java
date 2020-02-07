package taller1;

public class Animal {
    private String nombre, edad, raza;

    /**
     * metodo para obtener el nombre del animal
     * @return
     */
    public String Obtener_nombre (){
            return nombre;
    }

    /**
     * Metodo par obtener la edad del animal
     * @return
     */
    public String Obtener_edad(){
        return edad;
    }

    /**
     * metodo para obtener la raza del animal
     * @return
     */

    public String Obtener_raza (){
        return raza;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre
     */
    public void actualizar_nombre (String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar la edad
     * @param edad
     */
    public void actualizar_edad (String edad){
        this.edad = edad;

    }

    /**
     * Metodo para actualizar la raza
     * @param raza
     */
    public void actualizar_raza(String raza){
        this.raza = raza;
    }

    /**
     * obtener la informacion del animal
     * @return
     */
    public String obtener_animal () {
        String animal  = "Nombre del animal: " +nombre +"Edad del animal: " +edad +"Raza del animal: " +raza;
        return animal;
    }


}
