package TP2.EJ2;

public class Cuenta {
    private double saldo;
    private int nroCuenta;

    public Cuenta(double saldo) {
        this.saldo = saldo;
        this.nroCuenta = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo += saldo;
        }
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
}
