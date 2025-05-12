import java.time.LocalDate;
public class Persona {
    private String Name,Surname,Gender;
    private int Age,DNI;
    private double Weight,Height;
    private LocalDate fechaNacimiento;


    public Persona(int DNI) {
        this.DNI = DNI;
        this.Name = "Carolina";
        this.Surname = "Echeberria";
        this.Gender = "Femenino";
        this.Age = 18;
        this.fechaNacimiento = LocalDate.of(1973, 11, 3);
        this.Weight = 60.0;
        this.Height = 1.80;
    }

    public Persona(int DNI, String Name, String Surname) {
        this.DNI = DNI;
        this.Name = Name;
        this.Surname = Surname;
        this.Gender = "Femenino";
        this.Age = 18;
        this.fechaNacimiento = LocalDate.of(1973, 11, 3);
        this.Weight = 60.0;
        this.Height = 1.80;
    }


    public Persona(String name, String surname, int dNI, LocalDate fechaNacimiento) {
        Name = name;
        Surname = surname;
        DNI = dNI;
        this.fechaNacimiento = fechaNacimiento;
    }


    public Persona(String name, String surname, String gender, int age, int dNI, double weight, double height,
            LocalDate fechaNacimiento) {
        Name = name;
        Surname = surname;
        Gender = gender;
        Age = age;
        DNI = dNI;
        Weight = weight;
        Height = height;
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getIMC(){
        return (this.Weight / this.Height);
    }


    public void estaEnForma(){
        double valorIMC = getIMC();
            if ((valorIMC >= 18.5) && (valorIMC <= 25)){
                System.out.println("esta en forma");
            }
            else {
                System.out.println("No esta en forma");
            }
    }

    public void esMayor(){
        if (this.Age >= 18){
            System.out.println("Es Mayor");
        }
        else{
            System.out.println("No es Mayor");
        }
    }

    public void puedeVotar(){
        if (this.Age >= 16){
            System.out.println("Puede votar");
        }
        else{
            System.out.println("No puede votar");
        }
    }

    public void cumpleAnios(){
        LocalDate fechaActual;
        fechaActual = LocalDate.now();
            if (this.fechaNacimiento.getMonthValue() == fechaActual.getMonthValue()) {
                if (this.fechaNacimiento.getDayOfMonth() == fechaActual.getDayOfMonth()){
                    System.out.println("Feliz Cumpleaños!!");
                }
                else {
                    System.out.println("No es tu cumpleaños!!");
                }
            } 
            else {
                System.out.println("No es tu cumpleaños!!");
            }
    }

    public void verificarEdad(){
        LocalDate fechaActual2;
        fechaActual2 = LocalDate.now();
        int comparacion = (fechaActual2.getYear() - this.fechaNacimiento.getYear());
            if (comparacion == this.Age) {
                System.out.println("Tiene sentido");
            }
            else {
                System.out.println("No tiene sentido");
            }

    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getSurname() {
        return Surname;
    }
    public void setSurname(String surname) {
        Surname = surname;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public int getDNI() {
        return DNI;
    }

    public double getWeight() {
        return Weight;
    }
    public void setWeight(double weight) {
        Weight = weight;
    }
    public double getHeight() {
        return Height;
    }
    public void setHeight(double height) {
        Height = height;
    }

    
}