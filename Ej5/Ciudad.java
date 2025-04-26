package Ej5;

public class Ciudad {
    private String Nombre;
    private int cantHabitantes;
    private double gastoCiudad;
    private double imp1,imp2,imp3,imp4,imp5;

    public Ciudad(String nombre, int cantHabitantes, double gastoCiudad, float imp1, float imp2, float imp3, float imp4, float imp5) {
        this.Nombre = nombre;
        this.cantHabitantes = cantHabitantes;
        this.gastoCiudad = gastoCiudad;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public void setCantHabitantes(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }

    public double getGastoCiudad() {
        return gastoCiudad;
    }

    public void setGastoCiudad(double gastoCiudad) {
        this.gastoCiudad = gastoCiudad;
    }

    public double getImp1() {
        return imp1;
    }

    public void setImp1(double imp1) {
        this.imp1 = imp1;
    }

    public double getImp2() {
        return imp2;
    }

    public void setImp2(double imp2) {
        this.imp2 = imp2;
    }

    public double getImp3() {
        return imp3;
    }

    public void setImp3(double imp3) {
        this.imp3 = imp3;
    }

    public double getImp4() {
        return imp4;
    }

    public void setImp4(double imp4) {
        this.imp4 = imp4;
    }

    public double getImp5() {
        return imp5;
    }

    public void setImp5(double imp5) {
        this.imp5 = imp5;
    }

    public double getMontoRecaudado(){
        return (imp1+imp2+imp3+imp4+imp5);
    }

    public boolean getDeficit(){
        return ((getMontoRecaudado()-gastoCiudad)>0);
    }

}