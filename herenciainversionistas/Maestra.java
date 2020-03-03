package herenciainversionistas;

public class Maestra extends Inversionista {
    public Maestra(String nomCliente, int numCliente, int numCuenta, double capInvert, double plazInver, double inteAnual) {

        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capInvert = capInvert;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    private double interesMaestra;

    public double calcularInteresMaestra() {
        inteAnual = 0.15;
        interesMaestra = capInvert * (inteAnual * plazInver);
        return interesMaestra;
    }

    public double getInteresMaestra() {
        return interesMaestra;
    }

    public void setInteresMaestra(double interesMaestra) {
        this.interesMaestra = interesMaestra;
    }
}

