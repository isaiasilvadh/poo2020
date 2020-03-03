package herenciavolumen;

public class Cubo extends Figura{
    private double volumen;
    private double arista;

    /**
     * Método constructor de la clase Cubo
     * @param nombre
     * @param arista
     */
    public Cubo(String nombre, double arista){
        this.nombre = nombre;
        this.arista = arista;
    }
    //  Métodos para obtener y establecer
    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    /**
     * Método para calcular el volumen del Cubo
     */
    public void calcularVolumen(){
        volumen = Math.pow(arista,3);
    }

    /**
     * Método para obtener el volumen del Cubo
     * @return
     */
    public double obtenerVolumen(){
        return volumen;
    }
}
