package com.d.semestre3.unidad3.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPersona {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<Persona>();
        
        listaPersonas.add(new Persona("Pedrito", "Ibarra", "Suarez", (short)35, 1.50f));
        listaPersonas.add(new Persona("Jose", "Perez", "Soliz", (short)19, 1.70f));
        listaPersonas.add(new Persona("Juan Jose", "Perez", "Manriquez", (short)68, 1.68f));
        listaPersonas.add(new Persona("Maria Guadalupe", "Murillo", "Andrade", (short)58, 1.66f));
        listaPersonas.add(new Persona("Ana", "Murillo", "Figueroa", (short)24, 1.70f));
        listaPersonas.add(new Persona("Nicolas", "Perez", "Figueroa", (short)21, 1.70f));
        listaPersonas.add(new Persona("Nemesio", "Oceguera", "Cervantes", (short)54, 1.65f));
        
        System.out.println("..:: Lista desordenada ::..");
        printArray(listaPersonas);
        
        Collections.sort(listaPersonas, new ComparadorPersonaApellidos());
        
        System.out.println("\n..:: Lista ordenada ::..");
        printArray(listaPersonas);
        
        // Comprarar ordenamiento por edad y por apellido paterno
        Collections.sort(listaPersonas, new ComparadorPersonaEdadApellido());
        
        System.out.println("\n..:: Lista ordenada por edad y apellido ::..");
        printArray(listaPersonas);
        
        // Ordenamiento por apellido paterno, edad y estatura
        Collections.sort(listaPersonas, new CompararPersonaApellidoEdadEstatura());
        
        System.out.println("\n..:: Lista ordenada por apellido, edad y estatura ::..");
        printArray(listaPersonas);
        
        // Ordenamiento por estatura
        Collections.sort(listaPersonas, new CompararPesonaEstatura());
        
        System.out.println("\n..:: Lista por estatura ::..");
        printArray(listaPersonas);
    }
    
    public static void printArray(List<Persona> array) {
        for(Object element : array)
            System.out.println(element);
    }
}
