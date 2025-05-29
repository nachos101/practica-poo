package Examenes.RECU2024;

import java.util.Comparator;

public class comparadorPuntaje implements Comparator<Libro> {
    public int compare(Libro o1, Libro o2){
        return o1.getPuntaje() - o2.getPuntaje();
    }
}
