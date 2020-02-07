package taller1;

public class Ejecuta_universidad {
    public static void main(String[] args) {
        Universidad universidad= new Universidad();
        universidad.actualizar_direccion("San cayetano; ");
        universidad.actualizar_carreras("Derecho, Computacion; ");
        universidad.actualizar_areas("Tecnica, administrativa");
        String mostrar_universidad = universidad.obtener_universidad();
        System.out.println(mostrar_universidad);

    }
}
