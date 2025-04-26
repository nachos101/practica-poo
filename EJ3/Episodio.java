import java.util.Objects;

public class Episodio {
    private String titulo, descripcion;
    private double calificacion;
    private boolean visto;

    public Episodio(String titulo) {
        this.titulo = titulo;
        this.descripcion = "N";
        this.calificacion = -1.0;
        this.visto = false;
    }

    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.calificacion = -1.0;
        this.visto = false;
    }

    public Episodio(String titulo, String descripcion, double calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.visto = false;
    }

    public Episodio(String titulo, String descripcion, double calificacion, boolean visto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.visto = visto;
    }

    @Override
    public boolean equals(Object obj) {
        return titulo.equals(((Episodio) obj).getTitulo());
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public boolean isVisto() {
        return visto;
    }


    public void setCalificacion(double calificacion) {
        if ((calificacion <= 5.0) && (calificacion >= 1.0)) {
            this.calificacion = calificacion;
        }
        else{
            System.out.println("El valor no es correcto, debe ser entre 1 y 5");
        }
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
}
