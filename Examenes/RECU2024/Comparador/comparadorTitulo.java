package Examenes.RECU2024;

import java.util.Comparator;

public class comparadorTitulo implements Comparator<Libro> {
    public int compare(Libro o1, Libro o2){
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
