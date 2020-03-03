package herenciavolumen;

public class Cono extends Figura{
    private double radio;
    private double altura;
    private double volumen;

    /**
     * Método constructor de la clase Figura
     * @param nombre
     * @param altura
     * @param radio
     */
    public Cono(String nombre, double altura, double radio){
        this.nombre = nombre;
        this.altura = altura;
        this.radio = radio;
    }
    //  Métodos para obtener y establecer
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    /**
     * Método para calcular el volumen del cono
     */
    public void calcularVolumen(){
        volumen = (-0.333) * 3.1416 * Math.pow(radio,2) * altura;
    }

    /**
     * Método para obtener el volumen del cono
     * @return
     */
    public double obtenerVolumen(){
        return volumen;
    }
}
