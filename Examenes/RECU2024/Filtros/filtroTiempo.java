package Examenes.RECU2024;

public class filtroTiempo extends Filtro {
    int T;
    public boolean cumple(Libro L) {
        return L.getTiempoLectura() < T;
    }
}
