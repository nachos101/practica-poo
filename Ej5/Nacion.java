package Ej5;
import Ej5.Provincia;
import java.util.ArrayList;

public class Nacion {
    private String NombrePais;
    private ArrayList<Provincia> Provincias;

    public Nacion(String NombrePais) {
        this.NombrePais = NombrePais;
        Provincias = new ArrayList<>();
    }

    //public ArrayList<Provincia> getProvincias() {
      //  return Provincias;
    //}

    public void addProvincia(Provincia provincia) {
        this.Provincias.add(provincia);
    }

    public ArrayList<String> getProvinciasConDeficit(){
        ArrayList<Provincia> provinciasCopia = new ArrayList<>();
        provinciasCopia.addAll(Provincias);
        ArrayList<String> listaConDeficit = new ArrayList<>();
        for (int i = 0; i < provinciasCopia.size(); i++) {
            if (provinciasCopia.get(i).tieneDeficitProvincia()){
                listaConDeficit.add(provinciasCopia.get(i).getNombreProvincia());
            }
        }
        return listaConDeficit;
    }

    public ArrayList<String> getCiudadesConDeficit(){
        ArrayList<String> ciudadesConDefict = new ArrayList<>();
            for (Provincia provincia : Provincias) {
                ciudadesConDefict.addAll(provincia.ciudadesConDeficit());
            }
            return ciudadesConDefict;
    }

}