package Deber_seleccion;

public class Numero_mayor {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int mayor;

    /**
     * Metodo constructor
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     */
    public Numero_mayor(int num1,int num2,int num3,int num4){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    /**
     * Metodo para obtener numero 1
     * @return
     */
    public int getNum1() {
        return num1;
    }

    /**
     * Metodo para actualizar numero 1
     * @param num1
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * Método para obtener numero 2
     * @return
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Método  para actualizar numero 2
     * @param num2
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * Método  para obtener numero 3
     * @return
     */
    public int getNum3() {
        return num3;
    }

    /**
     * Método  para actualizar numero 3
     * @param num3
     */
    public void setNum3(int num3) {
        this.num3 = num3;
    }

    /**
     * Método para obtener numero 4
     * @return
     */
    public int getNum4() {
        return num4;
    }

    /**
     * Método  para actualizar numero 4
     * @param num4
     */
    public void setNum4(int num4) {
        this.num4 = num4;
    }

    /**
     * Método  para obtener el numero mayor
     * @return
     */
    public int getMayor() {
        return mayor;
    }

    /**
     * Método  para actualizar el numero mayor
     * @param mayor
     */
    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    /**
     * Método para calcular cual es el numero mayor
     */
    public void Calcular_numero() {
        if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
            mayor = num1;
        } else {
            if ((num2 > num3) && (num2 > num4)) {
                mayor = num2;
            } else {
                if (num3 > num4) {
                    mayor = num3;
                } else {
                    mayor = num4;
                }
            }
        }
    }

    /**
     * Método  para obtener el numero mayorz
     * @return
     */
    public int Obtener_mayor(){
        return mayor;
    }
}
