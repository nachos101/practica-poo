package TP3.EJ6;

import java.util.ArrayList;

public class centroComputos {
    private ArrayList<Computadora> listaComputadoras;
    private ArrayList<Proceso> listaEspera;
    private ordenarGeneral metodoComputadora;
    private ordenarGeneral metodoProceso;

    public centroComputos(ordenarGeneral metodoComputadora, ordenarGeneral metodoProceso) {
        listaComputadoras = new ArrayList<Computadora>();
        listaEspera = new ArrayList<Proceso>();
        this.metodoComputadora = metodoComputadora;
        this.metodoProceso = metodoProceso;
    }

    public void agregarComputadora(Computadora cc){
        boolean agrego = false;
        int i = 0;
        while ((i < listaComputadoras.size()) && (!agrego)){
            if (metodoComputadora.esMayor(cc,listaComputadoras.get(i))){
                listaComputadoras.add(i,cc);
                agrego = true;
            }
            i++;
        }
        if (!agrego) {
            listaComputadoras.add(cc);
        }

    }
    public void agregarListaEspera(Proceso pp){
        boolean agrego = false;
        int i = 0;
        while ((i < listaEspera.size()) && (!agrego)){
            if (metodoProceso.esMayor(pp,listaEspera.get(i))){
                listaEspera.add(i,pp);
            }
            i++;
        }
        if (!agrego){
            listaEspera.add(pp);
        }
    }

    public void agregarProceso(Proceso pp){
        boolean agrego = false;
        int i = 0;
        while ((i < listaComputadoras.size()) && (!agrego)){
            if (listaComputadoras.get(i).estaDisponible()){
                listaComputadoras.get(i).setPp(pp);
                agrego = true;
            }
            i++;
        }
        if (!agrego){
            agregarListaEspera(pp);
        }
        }
    }
