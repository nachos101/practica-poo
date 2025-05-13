package TP3.EJ6;

public class Proceso {
    private String Nombre;
    private int Memoria;

    public Proceso(String nombre, int memoria) {
        Nombre = nombre;
        Memoria = memoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int memoria) {
        Memoria = memoria;
    }
}
