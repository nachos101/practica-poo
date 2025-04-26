package TP2.EJ5;

public class empleadoCantVentas extends Empleado {
    private int cantVentas;
    private double porcentaje;

    public empleadoCantVentas(int ID, double salario, int cantVentas, double porcentaje) {
        super(ID, salario);
        this.cantVentas = cantVentas;
        this.porcentaje = porcentaje;
    }

    public double getMontoPorComision(){
        return ((this.cantVentas * this.porcentaje) / 100);
    }

    @Override
    public double getSalario() {
        return (super.getSalario() * getMontoPorComision());
    }
}
