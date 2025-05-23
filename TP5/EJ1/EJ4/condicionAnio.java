package TP5.EJ1.EJ4;

public class condicionAnio extends Condicion {
    int anio;
    public boolean cumple(Pelicula P){
        return P.getAnioEstreno() < anio;
    }
    
}
