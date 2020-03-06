package polimorfismovolumen;

public class Cubo1 extends Figura1{
    private double arista;

    public void setArista(double arista) {
        this.arista = arista;
    }

    @Override
    public void calcularVolumen() {
        volumen = Math.pow(arista,3);
    }


}
