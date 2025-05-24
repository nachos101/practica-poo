package TP6.EJ3;

public class Envio extends elementoEnvio {
    private Persona Destinatario;
    private Persona Remitente;
    private String formaRetiro;
    private double peso;

    public Envio(Persona Destinatario, Persona Remitente, String formaRetiro, double peso, String ciudadDestino, int nroTracking) {
        super(ciudadDestino, nroTracking);
        this.Destinatario = Destinatario;
        this.Remitente = Remitente;
        this.formaRetiro = formaRetiro;
        this.peso = peso;
    }

    public String getFormaRetiro() {
        return formaRetiro;
    }

    public double getPeso() {
        return peso;
    }

    public String getRemitente(){
        return this.Remitente.getNombre();
    }

    public String getDireccion(){
        return Destinatario.getDireccion();
    }

    public String getDestinatario(){
        return Destinatario.getNombre();
    }


}
