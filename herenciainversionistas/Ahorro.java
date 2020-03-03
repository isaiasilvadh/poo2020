package herenciainversionistas;

public class Ahorro extends Inversionista {

    public Ahorro(String nomCliente, int numCliente, int numCuenta, double capInvert, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capInvert = capInvert;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    private double interesAhorro;

    public double calcularInteresAhorro() {
        inteAnual = 0.15;
        interesAhorro = capInvert * (inteAnual * plazInver);
        return interesAhorro;
    }

    public double getInteresAhorro() {
        return interesAhorro;
    }

    public void setInteresAhorro(double interesAhorro) {
        this.interesAhorro = interesAhorro;
    }
}