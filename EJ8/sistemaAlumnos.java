package EJ8;

import java.util.ArrayList;

public class sistemaAlumnos {
    private ArrayList<Carrera> carreras;

    public sistemaAlumnos() {
        this.carreras = new ArrayList<>();
    }

    public ArrayList<String> getListadoInscripciones(Alumno alumnoBuscado) {
        ArrayList<String> inscripciones = new ArrayList<>();
        for (Carrera carrera : this.carreras) {
            if (carrera.estaInscripto(alumnoBuscado) != null) {
                inscripciones.add(carrera.estaInscripto(alumnoBuscado));
            }
        }
        return inscripciones;
    }

}
