package TP3.EJ1;

import java.util.ArrayList;

public class Jardin {
    private ArrayList<Planta> jardin;
    static int contador;

    public Jardin() {
        jardin = new ArrayList<Planta>();
    }

    public void addPlanta(Planta pp){
        pp.setID(contador);
        this.jardin.add(pp);
        contador++;
    }

}
