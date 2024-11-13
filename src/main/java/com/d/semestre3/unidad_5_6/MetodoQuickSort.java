package com.d.semestre3.unidad_5_6;

public class MetodoQuickSort {
    public static void main(String[] args) {
        String[] nombres = {"Fernanda", "Lic. Caty", "Raziel BigGay", "Adrian", "Miguel", "Armando", "Luis", "Jocelyn",
                            "Luis", "Rebeca", "Tania", "Diego", "Alan Yair", "Antuan", "Alexa 500dx", "Nico", 
                            "Sergio Mayer", "Fatima - y los drones"
        };
        
        System.out.println("\n..:: Arreglo desordenado ::..");
        for(String n : nombres) {
            System.out.println(n);
        }
        
        System.out.println("\n..:: Arreglo ordenado ::..");
        quicksort(nombres);
        for(String n : nombres) {
            System.out.println(n);
        }
    }
    
    public static void quicksort(String[] array) {
        qs(array, 0, array.length - 1);
    }
    
    public static void qs(String[] array, int inf, int sup) {
        // variables
        int izq, der;
        String mitad;
        String aux;
        
        // obtener posiciones
        izq = inf;
        der = sup;
        
        mitad = array[(izq + der) / 2];
        
        // loop
        do {
            // comparaciones de la izquierda
            while(array[izq].compareTo(mitad) < 0 && izq < sup) {
                izq++;
            }
            // comparaciones de la derecha
            while(mitad.compareTo(array[der]) < 0 && der > inf) {
                der--;
            }
            
            if(izq <= der) {
                aux = array[izq];
                array[izq] = array[der];
                
                array[der] = aux;
                
                izq++;
                der--;
            }
        } while(izq <= der);
        
        if(inf < der) {
            qs(array, inf, der);
        }
        if(izq < sup) {
            qs(array, izq, sup);
        }
    }
}
