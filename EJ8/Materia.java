package EJ8;

public class Materia {
    private String Nombre;
    private Docente docente;
    private int cuatrimestre;

    public Materia(String nombre, Docente docente, int cuatrimestre) {
        Nombre = nombre;
        this.docente = docente;
        this.cuatrimestre = cuatrimestre;
    }


}
