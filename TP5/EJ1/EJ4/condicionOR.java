package TP5.EJ1.EJ4;

public class condicionOR extends Condicion {
    Condicion C1;
    Condicion C2;

    public boolean cumple(Pelicula P){
        return C1.cumple(p) || C2.cumple(p);
    }
    
}
