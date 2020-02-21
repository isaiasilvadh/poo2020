package arreglosDeberPoo;

public class Estudiantes {
    private String[] nom = new String[5];
    private int[] edad = new int[5];
    private String[] universidad = new String[5];
    private String[] cel = new String[5];

    /**
     * Método constructor de la clase
     * @param nom
     * @param edad
     * @param universidad
     * @param cel
     */
    public Estudiantes(String nom[], int edad[], String universidad[], String cel[]) {
        this.nom = nom;
        this.edad = edad;
        this.universidad = universidad;
        this.cel = cel;
    }
    // Métodos para obtener y establecer los valores de las variables
    public String[] getNom() {
        return nom;
    }

    public void setNom(String[] nom) {
        this.nom = nom;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String[] universidad) {
        this.universidad = universidad;
    }

    public String[] getCel() {
        return cel;
    }

    public void setCel(String[] cel) {
        this.cel = cel;
    }

    /**
     * Método para obtener la fincha de los estudiantes
     */
    public void obtenerAlumno() {
        for (int i = 0; i < nom.length; i++) {
            System.out.println("Nombre: " + nom[i]);
            System.out.println("Edad: " + edad[i]);
            System.out.println("Universidad: " + universidad[i]);
            System.out.println("Celular: " + cel[i]);
            System.out.println("-----------------------");

        }
    }
}
