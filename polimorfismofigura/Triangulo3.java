package polimorfismofigura;

public class Triangulo3 extends  Figura3{
    private double baseTria;
    private double alturaTria;

    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }
    public void calcularArea(){
        setArea((baseTria * alturaTria) /2);
    }
}
