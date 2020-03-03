package herenciafigura;

public class Cuadrado extends Figura {
    private double ladoCuad;
    private double areaCuad;

    public Cuadrado (String nombre, double ladoCuad){
        this.nombre = nombre;
        this.ladoCuad = ladoCuad;
        this.areaCuad =areaCuad;
    }

    public double getLadoCuad() {
        return ladoCuad;
    }

    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }
    public double calcularAreaCuad(){
        areaCuad = ladoCuad * ladoCuad;
        return areaCuad;
    }

}
