package TP3;

public class Convertidor {
    public static final double pulgadaAcentimetro = 2.54;
    public static final double libraAkilos = 0.453592;
    public static final double galonAlitro = 3.7851;

    public static double getPulgadaAcentimetro(double PP){
        return PP * pulgadaAcentimetro;
    }
    public static double getCentimetroAPulgada(double CC){
        return CC / pulgadaAcentimetro;
    }
    public static double getlibraAkilos(double PP){
        return PP * libraAkilos;
    }
    public static double getKilosAlibra(double PP){
        return PP / libraAkilos;
    }
    public static double getGalonAlitro(double PP){
        return PP * galonAlitro;
    }
    public static double getLitrosAGalon(double PP){
        return PP / galonAlitro;
    }
}
