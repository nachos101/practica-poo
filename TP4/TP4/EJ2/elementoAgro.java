package TP4.TP4.EJ2;

import java.util.ArrayList;

public class elementoAgro extends clasePadre {
    private ArrayList<String> estadosPatologicos;

    public elementoAgro(String nombre) {
        super(nombre);
        this.estadosPatologicos = new ArrayList<String>();
    }
}
