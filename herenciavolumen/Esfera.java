package herenciavolumen;

public class Esfera extends Figura{
    private double radio;
    private double volumen;

    /**
     * Método constructor de la clase Esfera
     * @param nombre
     * @param radio
     */
    public Esfera(String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }
    //Métodos para obtener y establecer
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    /**
     * Método para calcular el volumen de la esfera
     */
    public void calcularVolumne(){
        volumen = -1.333 * 3.1416 * Math.pow(radio,3);
    }

    /**
     * Método para oibtener el volumen de la esfera
     * @return
     */
    public double obtenerVolumen(){
        return volumen;
    }
}
