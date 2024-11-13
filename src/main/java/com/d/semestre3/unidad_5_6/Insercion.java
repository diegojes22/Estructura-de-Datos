package com.d.semestre3.unidad_5_6;

/**
 * INSTITUTO TECNOLOGICO DE LA PIEDAD
 * INGENIERIA EN SISTEMAS COMPUTACIONALES
 * 
 * @date 2 de noviembre del 2024. Feliz dia de muertos
 * @autor Diego Jesus Muñoz Andrade | 3-C
 *              -alias D
 * 
 * Estudio del agoritmo de ordenamiento por insercion:
 * Este algoritmo es algo asi como ordenar cartas en
 * una baraja del uno. 
 * 
 * Los pasos son los siguientes:
 *  1- Consideramos el primer elemento como ordenado
 *  2- Verificamos si el elemento despues del ordenado es
 *     menor a los anteriores, si es menor entonces los
 *     intercambiamos hasta que esten en su posicion.
 *  3- Se repite el proceso hasta que los elementos esten
 *     ordenados.
 * 
 * Tracas hijo de su p### ####. No se crean, esta facil :D
 *   -from: D
 */

public class Insercion {
    /** Main */
    public static void main(String[] args) {
        // muestra de prueba
        int[] array = {5, 2, 4, 6, 1, 3, 0};

        System.out.println("..:: Desordenado ::..");
        printArray(array);

        System.out.println("\n\n..:: Ordenado del menor al mayor ::..");
        sort(array);
        printArray(array);

        System.out.println("\n\n..:: Ordenado del mayor al menor ::..");
        reverseSort(array);
        printArray(array);
    }

    /**
     * Imprimimos un arreglo de enteros
     * 
     * @param array hagan esto generico por favor :/
     */
    public static void printArray(int[] array) {
        for(int obj: array) {
            System.out.print(obj+" ");
        }
        System.out.println(); //salto de linea
    }

    /**
     * Ordena el arreglo de forma ascendente, es decir, 
     * de menor a mayor.
     * @param array
     */
    public static void sort(int[] array) {
        for(int i = 1; i < array.length-1; i++) {
            for(int j = i+1; j >= 0; j--) {
                if(j > 0) { // con evitamos que se compare un -1 para que no haya errores
                    if(array[j] < array[j-1]) {
                        int tmp = array[j];

                        array[j] = array[j-1];
                        array[j-1] = tmp;
                    }    
                }
            }
        } 
    }

    /**
     * Ordena el arreglo de forma descendente, 
     * es decir, de mayor a menor.
     * 
     * solo cambia un signo :/
     * @param array
     */
    public static void reverseSort(int[] array) {
        for(int i = 1; i < array.length-1; i++) {
            for(int j = i+1; j >= 0; j--) {
                if(j > 0) { // con evitamos que se compare un -1 para que no haya errores
                    if(array[j] > array[j-1]) {
                        int tmp = array[j];

                        array[j] = array[j-1];
                        array[j-1] = tmp;
                    }    
                }
            }
        } 
    }

}
