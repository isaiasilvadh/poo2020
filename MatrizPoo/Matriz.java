package MatrizPoo;

public class Matriz {
    private int[][] matrizA = new int[3][3];
    private int[][] matrizB = new int[3][3];
    private int[][] matrizC = new int[3][3];

    /**
     * Método constructor para la clase
     * @param matrizA
     * @param matrizB
     */
    public Matriz(int matrizA[][], int matrizB[][]){
    this.matrizA = matrizA;
    this.matrizB = matrizB;
    }
    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizC() {
        return matrizC;
    }

    public void setMatrizC(int[][] matrizC) {
        this.matrizC = matrizC;
    }
    public void calcularSuma(){
        for	(int i = 0; i< matrizA.length; i++){
            for(int j = 0; j< matrizB.length; j++){
                matrizC[i][j]= matrizA[i][j] + matrizB[i][j];
            }
        }
    }
    public void obtenerMatrizA () {
        System.out.println("Matriz A");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matrizA[i][j] + (" "));
            }
            System.out.println(" ");
        }
    }
    public void obtenerMatrizB() {
        System.out.println("Matriz B");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matrizB[i][j] + (" "));
            }
            System.out.println(" ");
        }
    }
    public void obtenerSuma(){
        System.out.println("Matriz C");
        for	(int i = 0; i< matrizA.length; i++){
            for(int j = 0; j< matrizA.length; j++){
                System.out.print(matrizC[i][j] +(" "));
            }
            System.out.println(" ");
        }
    }
}

