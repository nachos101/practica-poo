package Examenes.RECU2024;

public class LibroVariable extends Libro{
    private double valorVariable;
    public LibroVariable(String titulo, int puntaje, double tiempoLectura, double v) {
        super(titulo, puntaje, tiempoLectura);
        valorVariable = v;
    }

    public double getTiempoLectura(){
        return (super.getTiempoLectura()*this.listaGeneros.size()) / (valorVariable);
    }
}
