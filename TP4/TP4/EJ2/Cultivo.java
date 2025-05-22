package TP4.TP4.EJ2;

import java.util.ArrayList;

public class Cultivo extends clasePadre {
    private ArrayList<elementoAgro> listaEnfermedades;

    public Cultivo(String nombre) {
        super(nombre);
        this.listaEnfermedades = new ArrayList<elementoAgro>();
    }



}
