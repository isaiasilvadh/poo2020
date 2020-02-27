package herencia;

public class Docente extends Persona{
    public Docente (String area, String nombre, String identificacion, String estado_civil, String fecha_nacimiento){
        this.area = area;
        this.nombre = nombre;
        this. identificacion = identificacion;
        this.estado_civil =estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    private String area;


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void enseniar(){
        System.out.println("Método para enseñar");
    }
    public void calificar () {
        System.out.println("Método para calificar");
    }
}
