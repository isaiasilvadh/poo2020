package arreglosDeberPoo;

public class Binario {

    private String numBinario;
    private int suma;

    /**
     * Método constructor de la clase
     * @param numBinario
     */
    public Binario(String numBinario){
        this.numBinario = numBinario;
    }
    public String getNumBinario() {
        return numBinario;
    }

    public void setNumBinario(String numBinario) {
        this.numBinario = numBinario;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    /**
     * Método para transformar el binario a decimal
     */
    public void calcularDecimal(){
        int binario1 = Integer.parseInt(numBinario);
        int[] binarioDecimal = new int[6];
        int c = 5;
        for (int i = 0; i < binarioDecimal.length ; i++) {
            binarioDecimal[c] = (int)((binario1/Math.pow(10,i))%10);
            c--;
        }
        c = 5;
        for (int i = 0; i < binarioDecimal.length; i++) {
            suma += (binarioDecimal[i] * Math.pow(2, c));
            c--;
        }
    }

    /**
     * Método para obtener la suma
     */
    public void obtenerDecimal(){
        // impresion del resultado
        System.out.println("El binario en decimal es: "+ getSuma());
    }
}
