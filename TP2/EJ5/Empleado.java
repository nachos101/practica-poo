package TP2.EJ5;

public class Empleado {
    private Integer ID;
    protected double Salario;

    public Empleado(int ID, double salario) {
        this.ID = ID;
        this.Salario = salario;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    @Override
    public boolean equals(Object obj) {
        Empleado e = (Empleado) obj;
        return this.getID().equals(e.getID());
    }
}
