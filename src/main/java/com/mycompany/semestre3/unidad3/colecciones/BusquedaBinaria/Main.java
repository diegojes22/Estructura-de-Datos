package com.mycompany.semestre3.unidad3.colecciones.BusquedaBinaria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int busquedaBinaria(int[] arreglo, int elemento) {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] miLista = {1, 3, 4, 5, 17, 18, 31, 33};
        int desaparecido = 0;

        System.out.println("--- Busqueda Binaria ---");
        System.out.print("Ingrese el numero a buscar: ");
        desaparecido = in.nextInt();

        int posicion = busquedaBinaria(miLista, desaparecido);

        if(posicion == -1) {
            System.out.println("El elemento no se encuentra en la lista!!!!");
        }
        else {
            System.out.println("El elemento se encuentra en la posicion: "+busquedaBinaria(miLista, desaparecido));
            System.out.println("Elemento: "+miLista[posicion]);
        }
    }
}
