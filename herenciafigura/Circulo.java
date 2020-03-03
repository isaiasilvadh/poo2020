package herenciafigura;

public class Circulo extends Figura{
    public Circulo (String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }
    private double radio;
    private double areaCir;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularAreaCir(){
        areaCir = 3.14 * Math.pow(radio,2);
        return areaCir;
    }
}
