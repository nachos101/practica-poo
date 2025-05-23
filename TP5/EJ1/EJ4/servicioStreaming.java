import java.util.ArrayList;

public class servicioStreaming {
    private ArrayList<Pelicula> listaPeliculas;
    private Condicion filtroRentabilidad;

    public servicioStreaming(){
        listaPeliculas = new ArrayList<Pelicula>();
        filtroRentabilidad = null;
    }

    public servicioStreaming(Condicion filtroRentabilidad) {
        this.filtroRentabilidad = filtroRentabilidad;
        listaPeliculas = new ArrayList<Pelicula>();
    }


    public void addPelicula(Pelicula p){
        if (this.filtroRentabilidad.cumple(p)){
            listaPeliculas.add(p);
        }
    }

    public ArrayList<Pelicula> busquedaPorCriterio(Condicion c){
        ArrayList<Pelicula> listaAux = new ArrayList<Pelicula>();
        for (Pelicula elem : listaPeliculas) {
            if (c.cumple(elem)){
                listaAux.add(elem);
            }
        }
        return listaAux;
    }   

    public void setFiltroRentabilidad(Condicion filtroRentabilidad) {
        this.filtroRentabilidad = filtroRentabilidad;
    }

}
