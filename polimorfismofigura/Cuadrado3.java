package polimorfismofigura;

public class Cuadrado3 extends  Figura3{
    private double ladoCuad;

    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }
    public void calcularArea(){
        setArea(ladoCuad * ladoCuad);
    }
}
