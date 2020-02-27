package herencia;

/**
 * Clase que hereda la clase Persona
 * Contendra todas
 */
public class Estudiante extends Persona{
    public Estudiante(String carrera, String nombre, String identificacion, String estado_civil, String fecha_nacimiento){
        this.carrera = carrera;
        this.nombre = nombre;
        this. identificacion = identificacion;
        this.estado_civil =estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;

    }
    private String carrera;
//atributos propios de esta clase
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void matricular (){
        System.out.println("Método para matricular");
    }
    public void aprender (){
        System.out.println("Método para aprender");
    }
}
