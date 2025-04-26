package TP2;

public class Coleccion {
    private Object Arreglo[];
    private int tamano;

    public Coleccion(int capacidad) {
        Arreglo = new Object[capacidad];
        tamano = 0;
    }

    public int getTamano() {
        return tamano;
    }

    public void add(Object elemento) {
        if (tamano == Arreglo.length) {
            aumentarTamano();
            Arreglo[tamano] = elemento;
            tamano++;
        }
    }

    public void aumentarTamano() {
        int nuevaCapacidad = Arreglo.length*2;
        Object Arreglo2[] = new Object[nuevaCapacidad];
        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo2[i]=this.Arreglo[i];
        }
        this.Arreglo = Arreglo2;
    }

    public Object getElement(int pos) {
        if ((pos < 0) || (pos > tamano)){
            return null;
        }
        return Arreglo[pos];
    }

}
