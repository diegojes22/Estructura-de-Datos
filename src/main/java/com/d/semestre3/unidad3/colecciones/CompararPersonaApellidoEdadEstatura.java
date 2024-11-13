package com.d.semestre3.unidad3.colecciones;

import java.util.Comparator;

public class CompararPersonaApellidoEdadEstatura implements Comparator<Persona>{
    @Override
    public int compare(Persona t, Persona t1) {
        // comparar apellidos
        int apellido = t.getApellidoPaterno().compareTo(t1.getApellidoPaterno());
        if(apellido != 0) 
            return apellido;
        
         // comparar edad
        int edad = t.getEdad() - t1.getEdad();
        if(edad != 0)
            return edad;
        
        // comparar estatura
        return (int)(t.getEstatura() - t1.getEstatura());
    }
}
