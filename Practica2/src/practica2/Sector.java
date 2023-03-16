package practica2;

/**
 *
 * @author JD
 */
public class Sector {
    private String nombre;
    private String tiempo;
    private String costo;

    public Sector(String nombre, String tiempo, String costo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    
}
