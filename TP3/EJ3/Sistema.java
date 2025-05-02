package TP3.EJ3;

import java.util.ArrayList;

public class Sistema {
    private String name;
    private ArrayList<String> mineralesEspeciales;
    private ArrayList<String> mineralesSecundarios;
    private ArrayList<Lote> listaLotes;
    private ArrayList<Cereal> listaCereales;

    public Sistema(String name) {
        this.name = name;
        mineralesEspeciales = new ArrayList<String>();
        mineralesSecundarios = new ArrayList<String>();
        listaLotes = new ArrayList<Lote>();
        listaCereales = new ArrayList<Cereal>();
    }

    public void defineLote(){
        int i = 0;
        boolean sigue = false;
            while ((i < mineralesEspeciales.size()) && (!sigue)) {
                if (listaLotes.get(i).contieneMineralEspecial(mineralesEspeciales.get(i))) {
                    i++;
                }
                else {
                    sigue = true;
                }
            }
            if (sigue){
                System.out.println("Lote Comun");
            }
            else {
                System.out.println("Lote Especial");
            }
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
