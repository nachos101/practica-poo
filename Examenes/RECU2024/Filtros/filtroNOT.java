package Examenes.RECU2024;

public class filtroNOT extends Filtro {
    Filtro f1;

    @Override
    public boolean cumple(Libro L) {
        return !f1.cumple(L);
    }
}
