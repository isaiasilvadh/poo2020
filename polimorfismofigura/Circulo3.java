package polimorfismofigura;

public class Circulo3 extends Figura3{
    private double radioCirc;

    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }
    public void calcularArea(){
        setArea(3.14 * Math.pow(radioCirc,2));
    }
}
