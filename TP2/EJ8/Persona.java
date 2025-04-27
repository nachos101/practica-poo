package TP2.EJ8;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int DNI;
    private String Email;

    public Persona(String Apellido, int DNI, String Email, String Nombre) {
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Email = Email;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return getNombre()+" "+getApellido();
    }

    
}
