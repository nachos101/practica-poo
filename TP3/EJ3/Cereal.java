package TP3.EJ3;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    protected ArrayList<String> minerales;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cereal(String nombre) {
        this.nombre = nombre;
        minerales = new ArrayList<String>();
    }

    public ArrayList<String> getMinerales() {
        ArrayList<String> copia = new ArrayList<String>();
        copia.addAll(this.minerales);
        return copia;
    }

    public boolean puedeSembrarse(Lote L){
        return (minerales.contains(L.getMinerales()));
    }

    @Override
    public boolean equals(Object obj) {
        Cereal c = (Cereal) obj;
        return this.getNombre() == c.getNombre();
    }
}
