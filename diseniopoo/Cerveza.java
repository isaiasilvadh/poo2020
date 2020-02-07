package diseniopoo;

import javax.crypto.spec.PSource;

public class Cerveza {
    private double precio;
    private int unidades;
    private String nombre;
    private String tipo;


    public Cerveza (double precio, int unidades, String nombre,String tipo){
        this.precio = precio;
        this.unidades = unidades;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcular_ventas(){
       return precio * unidades;
    }
    public String presentar(){
        String cerveza = "Cerveza: " +nombre  +"\n Tipo: " +tipo +"\n Precio: " +precio +"\n Unidades Vendidas: " +unidades +"\n Total "+calcular_ventas();
        return cerveza;
    }

}
