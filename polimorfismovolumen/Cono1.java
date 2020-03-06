package polimorfismovolumen;

public class Cono1 extends Figura1{
    private double radio;
    private double altura;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularVolumen() {
        volumen = (-0.333) * 3.1416 * Math.pow(radio,2) * altura;
    }


}