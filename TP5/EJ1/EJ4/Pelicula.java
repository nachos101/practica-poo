
import java.util.ArrayList;

public class Pelicula {
    private String titulo, sinopsis, director;
    private int duracion, edadMinima, anioEstreno;
    private ArrayList<String> generos, actores;

    public Pelicula(int anioEstreno, String director, int duracion, int edadMinima, String sinopsis, String titulo) {
        this.anioEstreno = anioEstreno;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.sinopsis = sinopsis;
        this.titulo = titulo;
        this.generos = new ArrayList<String>();
        this.actores = new ArrayList<String>();
    }

    public void addActor(String s){
        if (!participoActor(s)){
            actores.add(s);
        }
    }

    public void addGenero(String s){
        generos.add(s);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public boolean participoDirector(String s){
        return director.equals(s);
    }

    public boolean participoActor(String s){
        return actores.contains(s);
    }

    public boolean tieneGenero(String s){
        return generos.contains(s);
    }
    
}
