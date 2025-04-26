import java.util.ArrayList;

public class Temporadas {

    private ArrayList<Episodio> episodes = new ArrayList<>();

    public Temporadas(ArrayList<Episodio> episodios) {
        this.episodes = episodios;
    }
    public ArrayList<Episodio> getEpisodes() {
        return episodes;
    }

    public void setRating(String Titulo, double Calificacion){
        Episodio nuevoEpisodio = new Episodio(Titulo);
        for (int i = 0; i < episodes.size() ; i++) {
            if (episodes.get(i).equals(nuevoEpisodio)) {
                episodes.get(i).setCalificacion(Calificacion);
                episodes.get(i).setVisto(true);
            }
        }

    }
    public int getWatched()
    {
        int contador = 0;
        for (int i = 1; i <= episodes.size() ; i++) {
            if (episodes.get(i).isVisto() == true){
                contador++;
            }
        }
        return contador;
    }

    public double promedioUsuario()
    {
        double promedio = 0;
        double cont = 0;
        for (int i = 0; i < episodes.size(); i++) {
            if ((episodes.get(i).getCalificacion() <= 5.0) && (episodes.get(i).getCalificacion() >= 1.0)){
            promedio = promedio + episodes.get(i).getCalificacion();
            cont++;
            }
        }
        return promedio / cont;
    }

    public boolean lookedAll()
    {
        int counter = 0;
        for (int i = 0; i < episodes.size(); i++) {
            if (episodes.get(i).isVisto() == true){
                counter++;
            }
        }
        if (counter == episodes.size()){
            return true;
        }
        else {
            return false;
        }
    }


}
