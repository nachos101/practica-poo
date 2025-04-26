package EJ4;

import static java.sql.Types.NULL;

public class Matriz {
    private int[][] matriz;

    public Matriz(int m, int n) {
        this.matriz = new int[m][n];
    }

    public void agregarElemento(int elem,int pos1,int pos2){
        this.matriz[pos1][pos2] = elem;
    }

    public int devolverElemento(int pos1,int pos2){
        int elem = this.matriz[pos1][pos2];
        if (elem != NULL){}
        return elem;
    }

}
