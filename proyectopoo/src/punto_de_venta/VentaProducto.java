/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_de_venta;

/**
 *
 * @author isaia
 */
public class VentaProducto {
    
    private String nombre;
    private int cantidad;
    private double precio;
    private double iva;
    private double subtotal;
    private double total;

  
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getCantidad() {
        return cantidad;
    }

    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public double getPrecio() {
        return precio;
    }

   
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public double getIva() {
        return iva;
    }

    
    public void setIva(double iva) {
        this.iva = iva;
    }

    
    public double getSubtotal() {
        return subtotal;
    }

   
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    
    public double getTotal() {
        return total;
    }

  
    public void setTotal(double total) {
        this.total = total;
    }

  
    
    /**
     * metodo para calcular el subtotal
     */
    public void calcularSubtotal() {

        subtotal = cantidad * precio;

    }

    /**
     * metodo para calcular el iva
     */
    public void calcularIva() {

        iva = 0.12 * subtotal;

    }

    /**
     * metodo para calcular el total
     */
    public void calcularTotal() {

        total = subtotal + iva;

    }

}
