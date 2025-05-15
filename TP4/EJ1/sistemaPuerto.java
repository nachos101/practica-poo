package TP4.EJ1;

import java.util.ArrayList;

public class sistemaPuerto {
    private ArrayList<Barco> listaBarcos;
    private ArrayList<Camion> listaCamiones;
    private Barco barcoCarga;
    private Camion camionDescarga;
    private ordenarGeneral ordenaCamion;
    private ordenarGeneral ordenaBarco;

    public sistemaPuerto(ordenarGeneral ordenaCamion, ordenarGeneral ordenaBarco) {
        this.camionDescarga = null;
        this.barcoCarga = null;
        this.listaBarcos = new ArrayList<Barco>();
        this.listaCamiones = new ArrayList<Camion>();
        this.ordenaBarco = ordenaBarco;
        this.ordenaCamion = ordenaCamion;
    }

    public sistemaPuerto(Barco barcoCarga, Camion camionDescarga,ordenarGeneral ordenaCamion, ordenarGeneral ordenaBarco) {
        this.barcoCarga = barcoCarga;
        this.camionDescarga = camionDescarga;
        this.listaBarcos = new ArrayList<Barco>();
        this.listaCamiones = new ArrayList<Camion>();
        this.ordenaBarco = ordenaBarco;
        this.ordenaCamion = ordenaCamion;
    }

    public void cargarYdescargar(){
        if (barcoCarga == null && camionDescarga == null){
            barcoCarga = listaBarcos.get(0);
            camionDescarga = listaCamiones.get(0);
            this.listaBarcos.remove(0);
            this.listaCamiones.remove(0);
        }
    }

    public void addBarco(Barco bb){
        int i = 0;
        boolean sigue = false;
            while (i < listaBarcos.size() && !sigue){
                if (ordenaBarco.esMayor(bb,listaBarcos.get(i))){
                    listaBarcos.add(i,bb);
                    sigue = true;
                }
                i++;
            }
            if (!sigue){
                listaBarcos.add(bb);
            }
    }

    public void addCamion(Camion bb){
        int i = 0;
        boolean sigue = false;
        while (i < listaCamiones.size() && !sigue){
            if (ordenaCamion.esMayor(bb,listaCamiones.get(i))){
                listaCamiones.add(i,bb);
                sigue = true;
            }
            i++;
        }
        if (!sigue){
            listaCamiones.add(bb);
        }
    }


}
