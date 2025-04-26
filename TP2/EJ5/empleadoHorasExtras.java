package TP2.EJ5;

public class empleadoHorasExtras extends Empleado {

    private double horasExtras;
    private double montoHoraExtra;

    public empleadoHorasExtras(int ID, double salario, double horasExtras, double montoExtra) {
        super(ID, salario);
        this.horasExtras = horasExtras;
        this.montoHoraExtra = montoExtra;
    }

    public double getMontoHorasExtras() {
        return (this.horasExtras*this.montoHoraExtra);
    }

    @Override
    public double getSalario() {
        return (super.getSalario()*getMontoHorasExtras());
    }
}
