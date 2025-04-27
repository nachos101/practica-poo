package TP2.EJ8;

import java.time.LocalDate;

public class Alumno extends Persona {
    private int NroLegajo;
    private LocalDate fechaDeIngreso;

    public Alumno(int NroLegajo, LocalDate fechaDeIngreso, String Apellido, int DNI, String Email, String Nombre) {
        super(Apellido, DNI, Email, Nombre);
        this.NroLegajo = NroLegajo;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public int getNroLegajo() {
        return NroLegajo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        Alumno a1 = (Alumno) o;
        return this.getNroLegajo()==a1.getNroLegajo();
    }

    
}
