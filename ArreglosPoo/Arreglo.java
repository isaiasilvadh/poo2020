package ArreglosPoo;

import org.w3c.dom.ls.LSOutput;

public class Arreglo {
    private int[] arregloA = new int[10];
    private int[] arregloB = new int[10];
    private int sumatoriaProducto = 0;

    public Arreglo(int arregloA[], int arregloB[]) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;

    }

    public int[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(int[] arregloA) {
        this.arregloA = arregloA;
    }

    public int[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(int[] arregloB) {
        this.arregloB = arregloB;
    }

    public void calcularSumatoriaProducto() {
        for (int i = 0; i < arregloA.length; i++) {
            sumatoriaProducto = sumatoriaProducto + (arregloA[i] * arregloB[i]);
        }
    }

    public int obtenerSumatoriaProductos() {
        return sumatoriaProducto;
    }

    public void presentarA() {
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print(arregloA[i]);

        }
        System.out.println("");
    }

    public void presentarB() {
        for (int i = 0; i < arregloB.length; i++) {
            System.out.print(arregloB[i]);
        }
        System.out.println("");
    }

}