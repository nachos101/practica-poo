public class Electrodomestico {
    private String Nombre,Color;
    private int Consumo;
    private double Peso, Precio;

    public Electrodomestico(String Nombre){
        this.Nombre = Nombre;
        this.Color = "Gris";
        this.Consumo = 10;
        this.Precio = 100;
        this.Peso = 2;
    }

    public Electrodomestico(String nombre, String color, int consumo, double peso, double precio) {
        Nombre = nombre;
        Color = color;
        Consumo = consumo;
        Peso = peso;
        Precio = precio;
    }
    public void esBajoConsumo(){
        int Consumo2 = 45;
            if (this.Consumo <= 45){
                System.out.println("Es bajo consumo");
            }
        else {
            System.out.println("No es bajo consumo");
            }
    }

    public double calcBalance(){
        return Precio / Peso;
    }

    public void esAltaGama(){
        double Gama = 3;
            if (calcBalance() > Gama){
                System.out.println("Es alta gama");
            }
            else {
                System.out.print("No es alta gama");
            }
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public int getConsumo() {
        return Consumo;
    }

    public void setConsumo(int consumo) {
        Consumo = consumo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }
}
