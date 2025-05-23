package TP5.EJ1.EJ4;

public class condicionNOT extends Condicion {
    Condicion C1;

    public boolean cumple(Pelicula P){
        return !C1.cumple(P);
    }
}
