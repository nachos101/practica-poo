package TP4.EJ1;

public class ordenarCapacidad extends ordenarGeneral {
    public boolean esMayor(Object b1, Object b2){
        Barco A = (Barco) b1;
        Barco B = (Barco) b2;
        return A.getCapacidad() > B.getCapacidad();
    }
}
