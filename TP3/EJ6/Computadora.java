package TP3.EJ6;

import java.util.ArrayList;

public class Computadora {
    private double velocidad;
    private Proceso pp;

    public Computadora(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public Proceso getPp() {
        return pp;
    }

    public void setPp(Proceso pp) {
        this.pp = pp;
    }

    public boolean estaDisponible(){
        return (this.pp!=null);
    }

    public double getVelocidad() {
        return velocidad;
    }
}
