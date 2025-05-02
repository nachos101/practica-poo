package TP3.EJ3;

import java.util.ArrayList;

public class Lote {
    private String name;
    private int hectareas;
    private ArrayList<String> minerales;

    public Lote(String name, int hectareas) {
        this.name = name;
        this.hectareas = hectareas;
        minerales = new ArrayList<String>();
    }

    public void satisfaceLote(){
        int i = 0;
        boolean sigue = false;
    }

    public ArrayList<String> getMinerales() {
        ArrayList<String> copia = new ArrayList<String>();
        copia.addAll(this.minerales);
        return copia;
    }

    public boolean contieneMineralEspecial(String S){
        return minerales.contains(S);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHectareas() {
        return hectareas;
    }

    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }

    public boolean puedeSembrarse(Cereal C){
        return minerales.contains(C.getNombre());
    }

    @Override
    public boolean equals(Object obj) {
        Lote l = (Lote) obj;
        return this.getName() == l.getName();
    }
}
