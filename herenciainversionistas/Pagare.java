package herenciainversionistas;

public class Pagare extends Inversionista{
    public Pagare(String nomCliente, int numCliente, int numCuenta, double capInvert, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capInvert = capInvert;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    private double interesPagare;

    public double calcularInteresPagare() {
        inteAnual = 0.20;
        interesPagare = capInvert * (inteAnual * plazInver);
        return interesPagare;
    }

    public double getInteresPagare() {
        return interesPagare;
    }

    public void setInteresPagare(double interesPagare) {
        this.interesPagare = interesPagare;
    }
}
