/**
 * Hola Mundo
 */

package com.d.semestre3.unidad_5_6;

public class MetodoBurbuja {
    public static void main(String[] args) {
        double[] numerosDoubles = {500.10, 87.887, 78.18, 1, -99.58, 778.11, 20.5, 17.98, 488,5, 45.25, -8875, 1.5, 0.0007, 0.8, -7777, -8, 65.78, 77.9, 780.1, 780.2, 1000};
    
        System.out.println("..:: Numero en desorden ::..");
        for(Double n : numerosDoubles) {
            System.out.print(n+", ");
        }
        
        System.out.println("\n\n..:: Numeros ordenados ::..");
        burbuja(numerosDoubles);
        for(Double n : numerosDoubles) {
            System.out.print(n+", ");
        }
        
        System.out.println("\n\n..:: Numeros ordenados al reves::..");
        burbujaReves(numerosDoubles);
        for(Double n : numerosDoubles) {
            System.out.print(n+", ");
        }
        
        System.out.println("");
    }
    
    public static void burbuja(double[] array) {
        boolean sorted;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            sorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambio usando una asignación temporal
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    sorted = false;
                }
            }
            // Si no hubo intercambios, el array ya está ordenado
            if (sorted) break;
        }
    }
    
    public static void burbujaReves(double[] array) {
        boolean sorted;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            sorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambio usando una asignación temporal
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    sorted = false;
                }
            }
            // Si no hubo intercambios, el array ya está ordenado
            if (sorted) break;
        }
    }
    
    public static void burbuja(String[] array) {
        boolean sorted;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            sorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareToIgnoreCase(array[j + 1]) < 0) {
                    // Intercambio usando una asignación temporal
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    sorted = false;
                }
            }
            // Si no hubo intercambios, el array ya está ordenado
            if (sorted) break;
        }
    }
}
