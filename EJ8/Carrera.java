package EJ8;

import java.util.ArrayList;

public class Carrera {
    private String Nombre;
    private int duracion;
    private ArrayList<Materia> materias;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Docente> docentes;

    public Carrera(String nombre, int duracion) {
        this.Nombre = nombre;
        this.duracion = duracion;
        this.materias = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.docentes = new ArrayList<>();
    }

    public String estaInscripto(Alumno alumnoBuscado) {
        if (this.alumnos.contains(alumnoBuscado)){
            return this.Nombre;
        }
        else {
            return null;
        }
    }

}
