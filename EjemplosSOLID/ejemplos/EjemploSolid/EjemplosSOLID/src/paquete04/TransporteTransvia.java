package paquete04;

/**
 *
 * @author santy
 */
public class TransporteTransvia extends Transporte {
    
    private String cooperativaTransvia;
    
    public void establecerCooperativaTransvia(String n){
        cooperativaTransvia = n;
    }
    
    
    public void establecerTarifa(){
        tarifa = 20.0 + 0.1;
    }
    
    
    public String obtenerCooperativaTaxi(){
        return cooperativaTransvia;
    }
    
}
