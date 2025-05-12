package TP3.EJ3;

import java.util.ArrayList;

public class Sistema {
    private String name;
    private ArrayList<String> mineralesEspeciales;
    private ArrayList<Lote> listaLotes;
    private ArrayList<Cereal> listaCereales;

    public Sistema(String name) {
        this.name = name;
        mineralesEspeciales = new ArrayList<String>();
        listaLotes = new ArrayList<Lote>();
        listaCereales = new ArrayList<Cereal>();
    }

    public boolean defineLote(Lote L){
        for(String m : mineralesEspeciales){
            if (!L.isEspecial(m)){
                return false;
             }
        }
        return true;
    }

    public void satisfaceLote(Lote L){
        ArrayList<String> cerealesPosibles = new ArrayList<String>();
        if (listaLotes.contains(L)) {
           for (Cereal c : listaCereales) {
               if (c.puedeSembrarse(L)) {
                   cerealesPosibles.add(c.getNombre());
               }
           }
        }
    }

    public void satisfaceCereal(Cereal C){
        ArrayList<String> lotesPosibles = new ArrayList<String>();
        if (listaCereales.contains(C)){
            for (Lote l : listaLotes) {
                if (l.puedeSembrarse(C)){
                    lotesPosibles.add(C.getNombre());
                }
            }
        }
    }

}
