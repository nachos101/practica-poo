package TP2.EJ5;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> listEmpleados;

    public Empresa() {
        this.listEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado emp) {
        this.listEmpleados.add(emp);
    }

    public double getSalario(Empleado emp) {
        for (Empleado empleado : this.listEmpleados) {
            if (empleado.equals(emp)) {
                return emp.getSalario();
            }
        }
    }

}
