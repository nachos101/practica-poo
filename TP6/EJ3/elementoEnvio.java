package TP6.EJ3;

public abstract class elementoEnvio {
    private int nroTracking;
    private String ciudadDestino;

    public elementoEnvio(String ciudadDestino, int nroTracking) {
        this.ciudadDestino = ciudadDestino;
        this.nroTracking = nroTracking;
    }

    public abstract String getRemitente();
    public abstract double  getPeso();
    public abstract String getDireccion();
    public abstract String getDestinatario();

    public int getNroTracking() {
        return nroTracking;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setNroTracking(int nroTracking) {
        this.nroTracking = nroTracking;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    
    
}
