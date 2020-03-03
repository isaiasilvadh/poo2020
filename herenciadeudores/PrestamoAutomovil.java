package herenciadeudores;

public class PrestamoAutomovil extends ClienteDeudor{
    private double interes;
    private double pagoFinal;
    private String reporte;

    /**
     * Método constructor de la clase PrestamoAutomovil
     * @param nroCliente
     * @param nombre
     * @param nroCuenta
     * @param capital
     * @param plazo
     */
    public PrestamoAutomovil(int nroCliente, String nombre, String nroCuenta,double capital, int plazo){
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.capital = capital;
        this.plazo = plazo;
    }
    //  Métodos para obtener y establecer
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getPagoFinal() {
        return pagoFinal;
    }

    public void setPagoFinal(double pagoFinal) {
        this.pagoFinal = pagoFinal;
    }

    /**
     * Método para calcular el pago final
     */
    public void calcularPagoFinal(){
        interes = capital * 0.1268;
        pagoFinal = capital + (interes * plazo);
        reporte = String.format("%d                 %s                %s                 %.2f\n",nroCliente,nombre,nroCuenta,pagoFinal);
    }

    /**
     * Método para obtener el reporte
     * @return
     */
    public String obtenerReporte(){
        return reporte;
    }
}

