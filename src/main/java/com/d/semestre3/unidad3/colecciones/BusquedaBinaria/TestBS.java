package com.d.semestre3.unidad3.colecciones.BusquedaBinaria;

public class TestBS {
    public static int busquedaBinaria(Persona[] personas, Persona persona) {
        int inicio = 0;
        int medio = 0;
        int fin = personas.length - 1;

        while(inicio <= fin) {
            medio = (inicio + fin) / 2;

            if(personas[medio].compareTo(persona) == 0) {
                return medio;
            } else if(personas[medio].compareTo(persona) < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Persona[] personas = new Persona[3];
        personas[0] = new Persona("Juan", 20);
        personas[1] = new Persona("Maria", 25);
        personas[2] = new Persona("Pedrito", 30);
        
        System.out.println("--- Busqueda Binaria ---");
        
        for(Persona p : personas) {
            System.out.println(p);
        }

        System.out.println(busquedaBinaria(personas, new Persona("kshbdvf", 25)));
    }
}
