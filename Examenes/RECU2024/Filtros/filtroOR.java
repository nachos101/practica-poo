package Examenes.RECU2024;

public class filtroOR extends Filtro {
    Filtro f1,f2;

    @Override
    public boolean cumple(Libro L) {
        return f1.cumple(L) || f2.cumple(L);
    }
}
