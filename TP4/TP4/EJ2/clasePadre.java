package TP4.TP4.EJ2;

public abstract class clasePadre {
    private String Nombre;

    public clasePadre(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
