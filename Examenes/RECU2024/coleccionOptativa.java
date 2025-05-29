package Examenes.RECU2024;

public class coleccionOptativa extends Coleccion{
    public coleccionOptativa() {
        super();
    }

    public int getPuntaje() {
        int mayor = -1;
        for (elementoBiblioteca e : listaColeccion){
            if (e.getPuntaje() > mayor){
                mayor = e.getPuntaje();
            }
            }
        return mayor;
        }


    public double getTiempoLectura(){
        double mayor = -1;
        for (elementoBiblioteca e : listaColeccion){
            if (e.getTiempoLectura() > mayor){
                mayor = e.getTiempoLectura();
            }
        }
        return mayor;
    }
}
