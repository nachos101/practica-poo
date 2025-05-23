package TP5.EJ1.EJ4;

public class condicionDirector extends Condicion {
    String S;
    public boolean cumple(Pelicula P){
        return P.participoDirector(S);
    }
    
}
