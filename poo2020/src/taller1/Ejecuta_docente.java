package taller1;

public class Ejecuta_docente {
    public static void main(String[] args) {
        Docente docente = new Docente();
        docente.actualizar_materia("Fundamentos de la programacion; ");
        docente.actualizar_departamento("tecnico ; ");
        docente.actualizar_institucion("UTPL ");
        String mostrar_docente = docente.obtener_docente();
        System.out.println(mostrar_docente);

    }
}
