package polimorfismoinversionista;

public class CuentaMaestra1 extends Inversionista1{
    private double interes;

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public void total() {
        interes = (capital * 12) / 100;
        total = interes * plazo;
    }
}