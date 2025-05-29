package Examenes.RECU2024;

public class SecuencialRestrictiva extends coleccionSecuencial {
    private Filtro F;
    public SecuencialRestrictiva(Filtro F) {
        super();
        this.F = F;
    }

    @Override
    public void addElemento(elementoBiblioteca E){
        listaColeccion.addAll(E.busquedaPorFiltro(F));
    }
}
