package paquete03;

/**
 *
 * @author santy
 */
public class TransporteTransvia {
    
    private String cooperativaTransvia;
    public double tarifa;
    
    public void establecerCooperativaTransvia(String n){
        cooperativaTransvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 20.00 + 0.1;
    }
    
    public String obtenerCooperativaTransvia(){
        return cooperativaTransvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
}
