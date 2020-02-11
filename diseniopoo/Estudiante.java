package diseniopoo;

public class Estudiante {
    private String nombre;
    private String materia;
    private double nota_Primer_Bimestre;
    private double nota_Segundo_Bimestre;
    private String estado;
    private double promedio;

    /**
     * Metodo constructor de la clase persona
     *
     * @param nombre
     * @param materia
     * @param nota_Primer_Bimestre
     * @param nota_Segundo_Bimestre
     */
    public Estudiante(String nombre, String materia, double nota_Primer_Bimestre, double nota_Segundo_Bimestre) {
        this.nombre = nombre;
        this.materia = materia;
        this.nota_Primer_Bimestre = nota_Primer_Bimestre;
        this.nota_Segundo_Bimestre = nota_Segundo_Bimestre;
    }

    /**
     * Metodo para obtener el nombre del alumno
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método par actualizar el nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el estado
     *
     * @return
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método para actualizar el estado
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método para obtener la materia
     * @return
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Método para actualizar la materia
     * @param materia
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * Método para obtener la nota del primer bimestre
     * @return
     */
    public double getNota_Primer_Bimestre() {
        return nota_Primer_Bimestre;
    }

    /**
     * Método para actualizar la nota del primer bimestre
     * @param nota_Primer_Bimestre
     */
    public void setNota_Primer_Bimestre(double nota_Primer_Bimestre) {
        this.nota_Primer_Bimestre = nota_Primer_Bimestre;
    }

    /**
     * Método para obtener la nota del segundo bimestre
     * @return
     */
    public double getNota_Segundo_Bimestre() {
        return nota_Segundo_Bimestre;
    }

    /**
     * Método para actualizar la nota del segundo bimestre
     * @param nota_Segundo_Bimestre
     */
    public void setNota_Segundo_Bimestre(double nota_Segundo_Bimestre) {
        this.nota_Segundo_Bimestre = nota_Segundo_Bimestre;
    }

    /**
     * Método para obtener el promedio de las dos notas
     * @return
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Método para actualizar el promedio del alumno
     * @param promedio
     */
    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    /**
     * Método para calcular el promedio
     * @return
     */
    public int Calcular_promedio() {
        promedio = Math.round(nota_Primer_Bimestre + nota_Segundo_Bimestre);
        return (int) promedio;
    }

    /**
     * Método para verificar el estado del estudiante
     * @return
     */
    public String estado(){
        if(promedio >= 28){
            estado = "Aprobado";
        }else{
            estado = "Supletorios";
        }
        return estado;
    }

    /**
     * Método para Presentar la Informacion del estudiante
     */
    public void Presentar_datos(){
        System.out.println("Universidad Técnica Particular de Loja\nCalificaciones \nEstudiante: "+nombre+
                "\nMateria: "+materia +"\nNota del Primer Bimestre: "+ nota_Primer_Bimestre +"\nNota del Segundo Bimestre: "+ nota_Segundo_Bimestre +
                "\nPromedio Total: "+ Calcular_promedio()+"\nEstado del Estudiante en la Materia: "+estado());
    }
}


