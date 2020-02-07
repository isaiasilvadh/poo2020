package taller1;

public class Ejecuta_estudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.actualizar_carrera("Ing en Sistemas; ");
        estudiante.actualizar_nombre("Isaias; ");
        estudiante.actualizar_ciclo("5to ciclo ");
        String mostrar_estudiante = estudiante.obtener_estudiante();
        System.out.println(mostrar_estudiante);

    }
}
