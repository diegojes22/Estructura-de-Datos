package com.d.semestre3.unidad_5_6;

import java.util.Collections;

public class BusquedaBinaria {
    public static void main(String[] args) {
        // Variables
        float temperaturas[] = {23.5f, 46.8f, -5, -10.09f, 17.5f, 21, 22.7f, 43.5f, -22.7f};
        
        sort(temperaturas);
        
        for(float f: temperaturas) {
            System.out.print(f+" ");
        }
        System.out.println("");
        
        int pos = busquedaBinaria(temperaturas, -5);
        System.out.println("Posicion: "+pos);
    }
    
    /**
     * Metodo de ordenamiento por insercion
     * @param array 
     */
    public static void sort(float[] array) {
        for(int i = 1; i < array.length-1; i++) {
            for(int j = i+1; j >= 0; j--) {
                if(j > 0) { // con evitamos que se compare un -1 para que no haya errores
                    if(array[j] < array[j-1]) {
                        float tmp = array[j];

                        array[j] = array[j-1];
                        array[j-1] = tmp;
                    }    
                }
            }
        } 
    }
    
    public static int busquedaBinaria(float[] arreglo, float elemento) {
        int inicio = 0;
        int medio = 0;
        int fin = arreglo.length - 1;

        while(inicio <= fin) {
            medio = (inicio + fin) / 2;

            if(arreglo[medio] == elemento) {
                return medio;
            } else if(arreglo[medio] < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }
}
