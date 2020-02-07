package taller1;

public class Ejecuta_vehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo= new Vehiculo();
        vehiculo.actualizar_marca("BMW; ");
        vehiculo.actualizar_modelo("2019; ");
        vehiculo.actualizar_cilindraje("3500 ");
        String mostrar_vehiculo = vehiculo.obtener_vehiculo();
        System.out.println(mostrar_vehiculo);

    }
}
