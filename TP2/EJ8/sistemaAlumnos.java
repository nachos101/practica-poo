package TP2.EJ8;

import java.util.ArrayList;

public class sistemaAlumnos {
    private ArrayList<Carrera> carreras;

    public sistemaAlumnos() {
        this.carreras = new ArrayList<Carrera>();
    }

    public ArrayList<Carrera> getListadoInscripciones(Alumno aa){
        ArrayList<Carrera> listAux = new ArrayList<Carrera>();
        for (Carrera elem : carreras) {
            if (elem.estaAlumno(aa)){
                listAux.add(elem);
            }
        }
        return listAux;
    }

}
