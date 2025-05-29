package Examenes.RECU2024;

import java.util.ArrayList;
import java.util.Comparator;

public class Libro extends elementoBiblioteca {
    private String Titulo;
    private int Puntaje;
    private double tiempoLectura;
    protected ArrayList<String> listaGeneros;

    public Libro(String titulo, int puntaje, double tiempoLectura) {
        Titulo = titulo;
        Puntaje = puntaje;
        this.tiempoLectura = tiempoLectura;
        listaGeneros = new ArrayList<String>();
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getPuntaje(){
        return this.Puntaje;
    }

    public double getTiempoLectura(){
        return this.tiempoLectura;
    }

    public ArrayList<String> getGeneros() {
        return new ArrayList<String>(this.listaGeneros);
    }

    public boolean tieneGenero(String s){
        return listaGeneros.contains(s);
    }
    public ArrayList<Libro> busquedaPorFiltro(Filtro F){
        ArrayList<Libro> aux = new ArrayList<Libro>();
        if (F.cumple(this)){
            aux.add(this);
        }
        return aux;
    }

    public boolean esImportante(Filtro F){
        return (F.cumple(this));
    }

}
