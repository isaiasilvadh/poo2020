package herenciafigura;

public class Triangulo extends Figura{
    private double baseTrian;
    private double alturaTrian;
    private double areaTrian;
    public Triangulo (String nombre, double baseTrian, double alturaTrian){
        this.nombre = nombre;
        this.baseTrian = baseTrian;
        this.alturaTrian = alturaTrian;
    }

    public double getBaseTrian() {
        return baseTrian;
    }

    public void setBaseTrian(double baseTrian) {
        this.baseTrian = baseTrian;
    }

    public double getAlturaTrian() {
        return alturaTrian;
    }

    public void setAlturaTrian(double alturaTrian) {
        this.alturaTrian = alturaTrian;
    }

    public double getAreaTrian() {
        return areaTrian;
    }

    public void setAreaTrian(double areaTrian) {
        this.areaTrian = areaTrian;
    }
    public double calcularAreaTri(){
        areaTrian = (baseTrian * alturaTrian) /2;
        return areaTrian;
    }

}
