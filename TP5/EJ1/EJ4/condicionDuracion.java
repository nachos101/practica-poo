package TP5.EJ1.EJ4;

public class condicionDuracion extends Condicion {
    int duracion;

    public boolean cumple(Pelicula P){
        return P.getDuracion() < duracion;
    }
    
}
