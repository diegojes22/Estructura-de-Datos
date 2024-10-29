package com.mycompany.semestre3.unidad3.colecciones;

import java.util.Comparator;

public class ComparadorPersonaApellidos implements Comparator<Persona> {

    @Override
    public int compare(Persona t, Persona t1) {
        int ap1 = t.getApellidoPaterno().compareTo(t1.getApellidoPaterno());
        if(ap1 != 0) 
            return ap1;
        
        int ap2 = t.getApelludoMaterno().compareTo(t1.getApelludoMaterno());
        if(ap2 != 0) 
            return ap2;
        
        return t.getNombre().compareTo(t1.getNombre());
        
    }
    
}
