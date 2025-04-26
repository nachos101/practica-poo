import java.util.ArrayList;


public class Serie {

    private String title, creator , description,gender;
    private ArrayList<Temporadas> seasons;


    public Serie(String titulo, String creador, String descripcion, String genero) {
        this.title = titulo;
        this.creator = creador;
        this.description = descripcion;
        this.gender = genero;
        this.seasons = new ArrayList<>();
    }

    public Serie(String titulo, String creador, String descripcion, String genero, ArrayList<Temporadas> temporadas) {
        this.title = titulo;
        this.creator = creador;
        this.description = descripcion;
        this.gender = genero;
        this.seasons = temporadas;
    }

    public void modRating(String titulo1, double Cali, int T)
    {
        seasons.get(T).setRating(titulo1,Cali);
    }

    public int getAnySeason()
    {
        return seasons.get(0).getWatched();
    }

    public int getAllSeasons()
    {
        int sumaTotal=0;
        for (int i = 0; i < seasons.size() ; i++) {
            sumaTotal= sumaTotal + seasons.get(i).getWatched();
        }
        return sumaTotal;
    }

    public double getPromedioAnySeason()
    {
        return seasons.get(0).promedioUsuario();
    }

    public double getPromedioAllSeasons()
    {
        double sumaTotal = 0;
        for (int i = 0; i < seasons.size() ; i++) {
            sumaTotal = sumaTotal + seasons.get(i).promedioUsuario();
        }
        return sumaTotal;
    }

    public void isAllLooked()
    {
        boolean loVi = true;
        int i=0;
        while ((loVi == true) && (i < seasons.size())){
            loVi = seasons.get(i).lookedAll();
            i++;
        }
        if (loVi == true) {
            System.out.println("Vio todo");
        }
        else {
            System.out.println("No vio todo");
        }
    }

}
