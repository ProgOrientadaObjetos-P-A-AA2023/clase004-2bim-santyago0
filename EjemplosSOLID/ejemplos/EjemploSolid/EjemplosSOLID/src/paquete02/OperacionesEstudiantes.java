/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadMinima;
    private int edadMaxima;
    private String listaCiudadesEstudiantes;
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
    public void establecerEdadMinima() {
        for(Persona e: obtenerEstudiante()) {
            if(edadMinima == 0) {
                edadMinima = e.obtenerEdad();
            }
            if(edadMinima > e.obtenerEdad()) {
                edadMinima = e.obtenerEdad();
            }
        }
    }
    
    public int obtenerEdadMinima() {
        return edadMinima;
    }
    
    public void establecerEdadMaxima() {
        for(Persona e: obtenerEstudiante()) {
            if(edadMaxima == 0) {
                edadMaxima = e.obtenerEdad();
            }
            if(edadMaxima < e.obtenerEdad()) {
                edadMaxima = e.obtenerEdad();
            }
        }
    }
    
    public int obtenerEdadMaxima() {
        return edadMaxima;
    }
    
    public void establecerListaCiudadesEstudiantes() {
        listaCiudadesEstudiantes = "\n";
        for(Persona e: obtenerEstudiante()) {
            listaCiudadesEstudiantes = String.format ("%s\t%s\n",
                    listaCiudadesEstudiantes,
                    e.obtenerCiudad().obtenerNombre());
        }
    }
    
    public String obtenerListaCiudadesEstudiantes() {
        return listaCiudadesEstudiantes;
    }
    
}
