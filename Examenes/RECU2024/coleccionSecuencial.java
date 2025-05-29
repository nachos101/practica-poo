package Examenes.RECU2024;

public class coleccionSecuencial extends Coleccion {
    public coleccionSecuencial() {
        super();
    }

    public int getPuntaje() {
        int suma = 0;
        for (elementoBiblioteca e : listaColeccion){
            suma = e.getPuntaje() + suma;
        }
        return suma;
    }

    public double getTiempoLectura() {
        double suma = 0;
        for (elementoBiblioteca e : listaColeccion){
            suma = e.getTiempoLectura() + suma;
        }
        return suma;
    }

}
