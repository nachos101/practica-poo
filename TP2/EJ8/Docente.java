package TP2.EJ8;

public class Docente extends Persona {
    private String Cargo;
    private String Dedicacion;

    public Docente(String Cargo, String Dedicacion, String Apellido, int DNI, String Email, String Nombre) {
        super(Apellido, DNI, Email, Nombre);
        this.Cargo = Cargo;
        this.Dedicacion = Dedicacion;
    }


    
}
