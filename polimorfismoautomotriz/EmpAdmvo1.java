package polimorfismoautomotriz;

public class EmpAdmvo1 extends Empleado1 {

    private double  sueldo_mensual;
    private double sueldo_quincenal;

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    public double getSueldo_quincenal() {
        return sueldo_quincenal;
    }

    public void setSueldo_quincenal(double sueldo_quincenal) {
        this.sueldo_quincenal = sueldo_quincenal;
    }


    @Override
    public void calcularQuincena() {
        sueldo_quincenal = sueldo_mensual / 2;
    }


}
