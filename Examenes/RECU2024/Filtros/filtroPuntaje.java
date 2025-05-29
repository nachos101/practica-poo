package Examenes.RECU2024;

public class filtroPuntaje extends Filtro {
    int P;
    public boolean cumple(Libro L){
        return L.getPuntaje() > P;
    }
}
