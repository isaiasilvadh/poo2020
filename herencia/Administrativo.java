package herencia;

public class Administrativo  extends  Persona{
    public Administrativo (String dependencia, String nombre, String identificacion, String estado_civil, String fecha_nacimiento){
        this.dependencia = dependencia;
        this.nombre = nombre;
        this. identificacion = identificacion;
        this.estado_civil =estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    private String dependencia;

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    public void gestionar_procesos(){
        System.out.println("Método para gestionar procesos");
    }
}
