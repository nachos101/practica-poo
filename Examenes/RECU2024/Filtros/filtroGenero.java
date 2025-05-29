package Examenes.RECU2024;

public class filtroGenero extends Filtro {
    String s;
    public boolean cumple(Libro L) {
        return L.tieneGenero(s);
    }
}
