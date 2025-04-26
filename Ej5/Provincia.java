package Ej5;

import Ej5.Ciudad;

import java.util.ArrayList;

public class Provincia {
    private String NombreProvincia;
    private ArrayList<Ciudad> Ciudades;

    public Provincia(String NombreProvincia) {
        this.NombreProvincia = NombreProvincia;
        Ciudades = new ArrayList<>();
    }

    public String getNombreProvincia() {
        return NombreProvincia;
    }

    public int getHabitantesProvincia(){
        int totalHab=0;
        for (int i = 0; i < Ciudades.size(); i++) {
            totalHab = totalHab + this.Ciudades.get(i).getCantHabitantes();
        }
        return totalHab;
    }

    public boolean tieneDeficitProvincia(){
        int totalDeficit = 0;
        for (int i = 0; i < Ciudades.size(); i++) {
            if (Ciudades.get(i).getDeficit() == true) {
                totalDeficit = totalDeficit + 1;
            }
        }
        if (totalDeficit > (Ciudades.size()/2)){
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<String> ciudadesConDeficit() {
        ArrayList<Ciudad> ciudadesCopia = new ArrayList<>();
        ciudadesCopia.addAll(Ciudades);
        ArrayList<String> ciudadesConDefict = new ArrayList<>();
        for (int i = 0; i < ciudadesCopia.size(); i++) {
            if (ciudadesCopia.get(i).getDeficit()) {
                ciudadesConDefict.add(ciudadesCopia.get(i).getNombre());
            }
        }
        return ciudadesConDefict;
    }

}