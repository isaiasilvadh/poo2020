package disenio_seleccion;

public class Dia {
    private int num;
    private String nombre;

    public Dia (int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void Calcular_nombre(){
        switch (num){
            case 1: nombre = "Domingo";
            break;
            case 2: nombre = "Lunes";
                break;
            case 3: nombre = "Martes";
                break;
            case 4: nombre = "Miercoles";
                break;
            case 5: nombre = "Jueves";
                break;
            case 6: nombre = "Viernes";
                break;
            case 7: nombre = "Sábado";
                break;
            default: nombre = "No valido";

        }
    }
    public void obtener_nombre(){
        System.out.println(nombre);
    }
}
