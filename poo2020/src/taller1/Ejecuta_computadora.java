package taller1;

public class Ejecuta_computadora {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        computadora.actualizar_marca("Dell; ");
        computadora.actualizar_precio("1.500; ");
        computadora.actualizar_caracteristicas("i7 septima generacion ");
        String mostrar_computadora = computadora.obtener_computadora();
        System.out.println(mostrar_computadora);

    }
}
