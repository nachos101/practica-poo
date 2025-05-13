package TP3.EJ6;

public class ordenarCompu extends ordenarGeneral {
    public boolean esMayor(Object o, Object p){
        Computadora N = (Computadora) o;
        Computadora B = (Computadora) p;
        return N.getVelocidad()>B.getVelocidad();
    }
}
