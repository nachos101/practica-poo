package Examenes.RECU2024;

import java.util.Comparator;

public class comparadorCompuesto implements Comparator<Libro> {
    Comparator<Libro> c1,c2;
    public int compare(Libro o1, Libro o2){
        int resultado = c1.compare(o1,o2);
            if (resultado == 0){
                return c2.compare(o1,o2);
            }
            else {
                return resultado;
            }
    }
}
