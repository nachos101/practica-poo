package Examenes.RECU2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Coleccion extends elementoBiblioteca implements Comparator<Libro>{
    protected ArrayList<elementoBiblioteca> listaColeccion;
    private Comparator<Libro> C;

    public Coleccion(Comparator<Libro> C) {
        listaColeccion = new ArrayList<elementoBiblioteca>();
        this.C = C;
    }

    public void addElemento(elementoBiblioteca E){
        this.listaColeccion.add(E);
    }

    public abstract int getPuntaje();
    public abstract double getTiempoLectura();
    public ArrayList<String> getGeneros(){
        ArrayList<String> listaAux = new ArrayList<String>();
        for (elementoBiblioteca e : listaColeccion){
            listaAux.addAll(e.getGeneros());
        }
        return listaAux;
    }

    public ArrayList<Libro> busquedaPorFiltro(Filtro F){
        ArrayList<Libro> listaLibros = new ArrayList<Libro>();
        for (elementoBiblioteca e : listaColeccion){
            listaLibros.addAll(e.busquedaPorFiltro(F));
        }
        Collections.sort(listaLibros,C);
        return listaLibros;
    }

}
