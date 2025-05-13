package TP3.EJ6;

public class ordenarProceso extends ordenarGeneral {
    public boolean esMayor(Object o, Object p){
        Proceso N = (Proceso) o;
        Proceso B = (Proceso) p;
        return N.getMemoria()<B.getMemoria();
    }
}
