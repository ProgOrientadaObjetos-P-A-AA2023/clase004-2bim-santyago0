package paquete02;

/**
 *
 * @author santy
 */
public class Ciudad {
    
    private String nombre;
    
    public Ciudad(String n) {
        nombre = n;
    }
    
    public void establecerNonmbre(String n) {
        nombre = n;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
}
