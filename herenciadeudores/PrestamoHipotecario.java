package herenciadeudores;

public class PrestamoHipotecario extends ClienteDeudor{
    private double interes;
    private double pagoFinal;
    private String reporte;

    /**
     * Método constructor de la clase CLienteDeudor
     * @param nroCliente
     * @param nombre
     * @param nroCuenta
     * @param capital
     * @param plazo
     */
    public PrestamoHipotecario(int nroCliente, String nombre, String nroCuenta,double capital, int plazo){
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.capital = capital;
        this.plazo = plazo;
    }
    // Métodos para obtener y establecer
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    /**
     * Método para calcular el pago final del prestamo hipotecario
     */
    public void calcularPagoFinal(){
        interes = capital * 0.478;
        pagoFinal = capital + (interes * plazo);
        reporte = String.format("%d                 %s                %s                 %.2f\n",nroCliente,nombre,nroCuenta,pagoFinal);
    }

    /**
     * Método para obtener el reporte del prestamo hipotecario
     * @return
     */
    public String obtenerReporte(){
        return reporte;
    }
}
