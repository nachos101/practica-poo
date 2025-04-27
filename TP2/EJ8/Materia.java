package TP2.EJ8;

public class Materia {
    private String nombreMateria;
    private Docente docente;
    private int cuatrimestre;

    public Materia(int cuatrimestre, Docente docente, String nombreMateria) {
        this.cuatrimestre = cuatrimestre;
        this.docente = docente;
        this.nombreMateria = nombreMateria;
    }


    
}
