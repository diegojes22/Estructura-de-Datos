package com.mycompany.semestre3.unidad3.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PruevaCollection {
    // Variables
    private static final String[] colores = {"MAGENTA", "ROJO", "BLANCO", "AZUL", "CYAN"};
    private static final String[] eliminarColores = {"ROJO", "BLANCO", "AZUL"};
    
    // funciones
    public PruevaCollection() {
        List<String> lista = new ArrayList<String>();
        List<String> eliminarLista = new ArrayList<String>();
        
        // Lista 1
        for(String c : colores) 
            lista.add(c);
        // Lista 2 - para no confundirese :|
        for(String c : eliminarColores)
            eliminarLista.add(c);
        
        System.out.println("Colores de la lista");
        for(int i = 0; i < colores.length; i++) {
            System.out.printf("color %d: %s \n", i, lista.get(i));
        } 
        
        eliminarColores(lista, eliminarLista);
        
        System.out.println("\nColores de la lista - despues");
        for(int i = 0; i < lista.size(); i++) {
            System.out.printf("color %d: %s \n", i, lista.get(i));
        } 
    }
    
    public void eliminarColores(Collection<String> coleccion1, Collection<String> coleccion2) {
        Iterator<String> iterador = coleccion1.iterator();
        
        while(iterador.hasNext()) {
            if(coleccion2.contains(iterador.next()) ) {
                iterador.remove();
            }
        }
    }
    
    public static void main(String[] args) {
        new PruevaCollection();
    }
}
