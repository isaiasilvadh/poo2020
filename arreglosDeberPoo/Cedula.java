package arreglosDeberPoo;

public class Cedula {
    private int numCedula;
    private String validacion;

    //Métodos de obtener y establecer 
    public int getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(int numCedula) {
        this.numCedula = numCedula;
    }

    public String getValidacion() {
        return validacion;
    }

    public void setValidacion(String validacion) {
        this.validacion = validacion;
    }

    public Cedula(int numCedula){
        this.numCedula = numCedula;
    }

    /**
     * método para verificar el número de cédula
     */
    public void verificar () {
        int[] coeficientes = {1,2,1,2,1,2,1,2,1,2};
        validacion = "número de cédula incorrecto";
        int[] arregloCedula = new int[10];
        for (int i = 0; i <arregloCedula.length ; i++) {
            arregloCedula[i] = (int)((numCedula /Math.pow(10,i))%10);
            System.out.println(arregloCedula[i]);
        }
        int suma = 0;
        int validacion = 0;
        int resultadoCoeficientes;
        for (int i = 0; i < arregloCedula.length; i++){
            resultadoCoeficientes = coeficientes[i] * arregloCedula[i];
            if (resultadoCoeficientes > 10){
                resultadoCoeficientes -= 9;
            }
            suma = suma + resultadoCoeficientes;
        }
        validacion = suma / 10;
        validacion += 1;
        validacion *= 10;
        validacion -= suma;
        System.out.println(validacion);
        if (validacion == 10){
            if (arregloCedula[0] == 0){
                this.validacion = "El número de cédula ingresado es correcto";
            }
        }
        if (arregloCedula[0] == validacion){
            this.validacion = "El número de cédula ingresado es correcto";
        }
    }
    public String obtenerEstado(){
        return validacion;
    }
}
