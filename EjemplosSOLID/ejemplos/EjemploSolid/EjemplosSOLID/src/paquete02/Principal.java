/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Ciudad c1 = new Ciudad("Loja");
        Ciudad c2 = new Ciudad("Quito");
        Ciudad c3 = new Ciudad("Guayaquil");
        Ciudad c4 = new Ciudad("Ambato");
        Ciudad c5 = new Ciudad("Cuenca");
        
        Persona p1 = new Persona("René",39,c1);
        Persona p2 = new Persona("Santiago",20,c2);
        Persona p3 = new Persona("Luis",21,c3);
        Persona p4 = new Persona("Jhordy",18,c4);
        Persona p5 = new Persona("Sarango",19,c5);
        
        OperacionesEstudiantes op1 = new OperacionesEstudiantes();
        
        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(p1);
        miLista.add(p2);
        miLista.add(p3);
        miLista.add(p4);
        miLista.add(p5);
        
        op1.establecerEstudiante(miLista);
        op1.establecerPromedioEdades();
        op1.establecerEdadMinima();
        op1.establecerEdadMaxima();
        op1.establecerListaCiudadesEstudiantes();
        
        System.out.printf("Promedio Edades: %.2f\n"
                + "Edad Mínima: %d\n"
                + "Edad Máxima: %d\n"
                + "Listado de Ciudades: %s\n",
                op1.obtenerPromedioEdades(),
                op1.obtenerEdadMinima(),
                op1.obtenerEdadMaxima(),
                op1.obtenerListaCiudadesEstudiantes());
    }
    
}
