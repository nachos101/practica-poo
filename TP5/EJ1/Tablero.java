package TP5.EJ1;

import java.util.ArrayList;

public class Tablero {
    private ArrayList<Ficha> listaFichas;
    private int puntajeMinimo;

    public Tablero(int puntajeMinimo) {
        listaFichas = new ArrayList<Ficha>();
        this.puntajeMinimo = puntajeMinimo;
    }

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }

    public int getDificultad(){
        int suma1=0,suma2=0;
        for (Ficha f: listaFichas){
            suma1=f.getPoder()+suma1;
            suma2=f.getFortaleza()+suma2;
        }
        if (suma1 > 0){
            return suma2 / suma1;
        }
        else{
            return 0;
        }
    }

    public ArrayList<Ficha> getFichasWithCondition(comparaGeneral ORDEN){
        ArrayList<Ficha> listaAUX = new ArrayList<Ficha>();
        for (Ficha f:listaFichas){
            if (ORDEN.getFichas(f)){
                listaAUX.add(f);
            }
        }
        return listaAUX;
    }


}
