package taller1;

public class Docente {
    private String materia, departamento, institucion;

    /**
     * Metodo para obtener la materia
     * @return
     */
    public String Obtener_materia(){
        return materia;
    }

    /**
     * Metodo para obtener el departamento
     * @return
     */
    public String Obtener_departamento(){
        return departamento;
    }

    /**
     * Metodo para obtener institucion
     * @return
     */
    public String obtener_institucion(){
        return institucion;
    }

    /**
     * Metodo para actualizar la materia
     * @param materia
     */
    public void actualizar_materia (String materia){
        this.materia = materia;
    }

    /**
     * Metodo para actualizar el departamento
     * @param departamento
     */
    public void actualizar_departamento (String departamento){
        this.departamento = departamento;
    }

    /**
     * Metodo para actualizar la institucion
     * @param institucion
     */
    public void actualizar_institucion (String institucion){
        this.institucion = institucion;
    }

    /**
     * obtener la informacion del docente
     * @return
     */
    public String obtener_docente () {
        String docente  = "materia del docente: " +materia +"departamento del docente: " +departamento +"institucion del docente: " +institucion;
        return docente;
    }
}
