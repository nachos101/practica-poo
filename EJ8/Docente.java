package EJ8;

public class Docente extends Persona {
    private String Cargo,Dedicacion;

    public Docente(String nombre, String apellido, String EMAIL, int DNI, String cargo, String dedicacion) {
        super(nombre, apellido, EMAIL, DNI);
        Cargo = cargo;
        Dedicacion = dedicacion;
    }

}
