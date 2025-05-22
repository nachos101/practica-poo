package TP5.EJ1;

public class comparaPoder extends comparaGeneral{
    int v = 2;
    public boolean getFichas(Object o){
        Ficha F = (Ficha) o;
        return F.getPoder() > v;
    }
}
