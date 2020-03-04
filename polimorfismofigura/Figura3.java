package polimorfismofigura;

public abstract class Figura3 {
    protected  String nomFigura;
    protected double area;

    public String getNomFigura() {
        return nomFigura;
    }

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }
    public abstract void calcularArea();


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
