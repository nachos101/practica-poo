package TP5.EJ1;

public class Ficha {
    private int poder, fortaleza, espacio;

    public Ficha(int poder, int fortaleza, int espacio) {
        this.poder = poder;
        this.fortaleza = fortaleza;
        this.espacio = espacio;
    }

    public Ficha(int espacio, int fortaleza) {
        this.espacio = espacio;
        this.fortaleza = fortaleza;
        this.poder = fortaleza / espacio;
    }

    public int getPoder() {
        return poder;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
}
