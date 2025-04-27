package TP2.EJ8;

import java.util.ArrayList;

public class Carrera {
    private String nombreCarrera;
    private int duracion;
    private ArrayList<Materia> listMaterias;
    private ArrayList<Alumno> listAlumnos;
    private ArrayList<Docente> listDocentes;

    public Carrera(int duracion, String nombreCarrera) {
        this.duracion = duracion;
        this.nombreCarrera = nombreCarrera;
        this.listMaterias = new ArrayList<Materia>();
        this.listAlumnos = new ArrayList<Alumno>();
        this.listDocentes = new ArrayList<Docente>();
    }

    public boolean estaAlumno(Alumno a){
        boolean busca = false;
        int i = 0;
        while ((!busca) && (i < listAlumnos.size())) {
            if (listAlumnos.get(i).equals(a)){
                busca = true;
            }
            i++;
        }
        return busca;
    }
    
}
