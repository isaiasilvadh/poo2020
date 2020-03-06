package polimorfismoinversionista;

public class Pagare1 extends Inversionista1{

    private double interes;

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }


    @Override
    public void total() {
        interes = (capital * 16) / 100;
        total = interes * plazo;
    }
}