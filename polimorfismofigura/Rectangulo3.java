package polimorfismofigura;

public class Rectangulo3 extends Figura3 {
    private double baseRecta;
    private double alturaRecta;

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }
    public void calcularArea(){
        setArea(baseRecta *alturaRecta);
    }
}
