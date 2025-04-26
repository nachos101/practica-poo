
public class mainn {


    public static double calcularPotencia(double X) {
        double exponente = 3;
        return Math.pow(X, exponente);        
    }
    public static void main(String[] args) {
        System.out.println("HI");
        double X = 2;
        System.out.println(X);
        double V = calcularPotencia(X);
        System.out.println(V);
    }
}