package TP2.EJ2;

import java.util.ArrayList;

public class Cliente {
    private String nombre, apellido;
    private int DNI,NroCliente;
    ArrayList<Cuenta> Cuentas;

    public Cliente(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.NroCliente = 0;
        this.Cuentas = new ArrayList<Cuenta>();
    }

    public void setNroCliente(int NroCliente){
        this.NroCliente = NroCliente;
    }

    public int getNroCliente(){
        return NroCliente;
    }

    public void nuevaCuenta(Cuenta cuenta) {
        cuenta.setNroCuenta(Cuentas.size() + 1);
        this.Cuentas.add(cuenta);
    }

    public void deposita(double monto, int nroCuenta) {
        for (int i = 0; i < Cuentas.size(); i++) {
            if (Cuentas.get(i).getNroCuenta() == nroCuenta) {
                Cuentas.get(i).setSaldo(monto);
            }
        }
    }

    public void extrae(double monto, int nroCuenta) {
        for (int i = 0; i < Cuentas.size(); i++) {
            if (Cuentas.get(i).getNroCuenta() == nroCuenta) {
                Cuentas.get(i).extraerSaldo(monto);
            }
        }
    }


}
