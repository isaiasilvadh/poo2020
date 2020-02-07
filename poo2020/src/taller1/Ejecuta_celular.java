package taller1;

public class Ejecuta_celular {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.actualizar_marca("Aple; ");
        celular.actualizar_precio("1000; ");
        celular.actualizar_caracteristicas("4 gb ram, 128 gb ");
        String mostrar_celular = celular.obtener_celular();
        System.out.println(mostrar_celular);

    }
}
