package TP6.EJ3;

import java.util.ArrayList;

public class comboEnvio extends elementoEnvio {
    private ArrayList<elementoEnvio> listaCombos;

    public comboEnvio(String ciudadDestino, int nroTracking) {
        super(ciudadDestino, nroTracking);
        listaCombos = new ArrayList<elementoEnvio>();
    }

    public void addElemento(elementoEnvio E){
        E.setNroTracking(this.getNroTracking());
        if (this.getCiudadDestino().equals(E.getCiudadDestino())){
            listaCombos.add(E);
        }
    }

    public String getRemitente(){
        return listaCombos.get(0).getRemitente();
    }

    public String getDestinatario(){
        return listaCombos.get(0).getDestinatario();
    }

    public String getDireccion(){
        return listaCombos.get(0).getDireccion();
    }

    public double getPeso() {
        double suma = 0;
        for (elementoEnvio elem : listaCombos) {
            suma = elem.getPeso() + suma;
        }
        return suma;
    }

    @Override
    public void setNroTracking(int setNroTracking){
        for (elementoEnvio elem : listaCombos) {
            elem.setNroTracking(setNroTracking);
        }
    }
    
    
}
