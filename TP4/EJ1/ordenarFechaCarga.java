package TP4.EJ1;

public class ordenarFechaCarga extends ordenarGeneral {
    public boolean esMayor(Object b1, Object b2){
        Camion A = (Camion) b1;
        Camion B = (Camion) b2;
        return A.getFechaCarga().isBefore(B.getFechaCarga());
    }
}
