package TP6.EJ3;

public class Persona {
    private String Nombre, Direccion, Telefono;
    private int DNI;

    public Persona(String nombre, String direccion, String telefono, int dNI) {
        Nombre = nombre;
        Direccion = direccion;
        Telefono = telefono;
        DNI = dNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    
    
    
}
