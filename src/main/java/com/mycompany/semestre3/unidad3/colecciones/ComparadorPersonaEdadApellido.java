package com.mycompany.semestre3.unidad3.colecciones;

import java.util.Comparator;

public class ComparadorPersonaEdadApellido implements Comparator<Persona> {
    @Override
    public int compare(Persona t, Persona t1) {
        // comparar edad
        int edad = t.getEdad() - t1.getEdad();
        if(edad != 0)
            return edad;
        
        // comparar por apeliido paterno
        return t.getApellidoPaterno().compareTo(t1.getApellidoPaterno());
    }
}
