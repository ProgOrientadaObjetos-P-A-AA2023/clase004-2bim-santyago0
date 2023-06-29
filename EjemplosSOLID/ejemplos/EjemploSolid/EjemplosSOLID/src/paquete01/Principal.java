package paquete01;

import java.util.ArrayList;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("René",39);
        Persona p2 = new Persona("Santiago",20);
        
        System.out.printf("%s\n",p1.obtenerEdad());
        System.out.printf("%s\n",p2.obtenerEdad());
        
        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(p1);
        miLista.add(p2);
        
        double promedio = p1.promedioEdades(miLista);
        System.out.printf("%.2f\n",promedio);
    }
    
}
