package taller1;

public class Ejecuta_animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.actualizar_edad("5");
        animal.actualizar_nombre("Frank");
        animal.actualizar_raza("Husky");
        String mostrar_animal = animal.obtener_animal();
        System.out.println(mostrar_animal);

    }
}
