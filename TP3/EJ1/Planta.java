package TP3.EJ1;

import java.time.LocalDate;

public class Planta {
    private String Nombre, Origen;
    private LocalDate Fecha;
    private int ID;

    public Planta(String Nombre, String Origen) {
        this.Nombre = Nombre;
        this.Origen = Origen;
        this.Fecha = LocalDate.now();
        this.ID = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getOrigen() {
        return Origen;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

}
