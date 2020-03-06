package polimorfismovolumen;

public class Esfera1 extends Figura1{
    private double radio;


    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularVolumen(){
        volumen = -1.333 * 3.1416 * Math.pow(radio,3);
    }
}
