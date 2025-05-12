package TP3.EJ6;

import java.util.ArrayList;

public class Computadora {
    private double velocidad;
    private ArrayList<Proceso> listaProcesos;
    private int memoriaMaxima;

    public Computadora(double velocidad, int memoriaMaxima) {
        this.velocidad = velocidad;
        this.listaProcesos = new ArrayList<Proceso>();
        this.memoriaMaxima = memoriaMaxima;
    }


}
