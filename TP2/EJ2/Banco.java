package TP2.EJ2;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> Clientes;

    public Banco() {
        Clientes = new ArrayList<Cliente>();
    }

    public void agregarCliente(Cliente cliente) {
        cliente.setNroCliente(Clientes.size() + 1);
        this.Clientes.add(cliente);
    }

    public void nuevaCajaAhorro(){

    }

    /* public void eliminarCliente(int id) {

    } */

    public void buscaYdeposita(int NroCliente, double monto, int NroCuenta) {
        for (Cliente cliente : Clientes) {
            if (cliente.getNroCliente() == NroCliente) {
                cliente.deposita(monto,NroCuenta);
            }
        }
    }

    public void buscaYextrae(int NroCliente, double monto, int NroCuenta) {
        for (Cliente cliente : Clientes) {
            if (cliente.getNroCliente() == NroCliente) {
                cliente.extrae(monto,NroCuenta);
            }
        }
    }


}
