package Examenes.RECU2024;

import java.util.Comparator;

public class comparadorTiempo implements Comparator<Libro> {
    public int compare(Libro o1, Libro o2){
        double t1 = o1.getTiempoLectura();
        double t2 = o2.getTiempoLectura();
        if (t1>t2){
            return 1;
        }
        else if (t2>t1){
            return -1;
        }
        else {
            return 0;
        }
    }
}
