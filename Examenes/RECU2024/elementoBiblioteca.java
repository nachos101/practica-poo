package Examenes.RECU2024;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class elementoBiblioteca {
    public abstract int getPuntaje();
    public abstract ArrayList<String> getGeneros();
    public abstract double getTiempoLectura();
    public abstract ArrayList<Libro> busquedaPorFiltro(Filtro F);
}
