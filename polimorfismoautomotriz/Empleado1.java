package polimorfismoautomotriz;

public abstract class Empleado1 {
    private String nombre;
    private String departamento;
    private String puesto;

    public String getNombre() {
        return nombre;
    }
public abstract void calcularQuincena();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
