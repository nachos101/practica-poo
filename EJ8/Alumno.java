package EJ8;

import java.time.LocalDate;

public class Alumno extends Persona{
    private LocalDate fechaIngreso;
    private Integer NroLegajo;

    public Alumno(String nombre, String apellido, String EMAIL, Integer DNI, LocalDate fechaIngreso) {
        super(nombre, apellido, EMAIL, DNI);
        this.fechaIngreso = fechaIngreso;
        this.NroLegajo = 0;
    }

    @Override
    public boolean equals(Object obj) {
        Alumno a = (Alumno) obj;
        return NroLegajo.equals(a.NroLegajo);
    }
}
