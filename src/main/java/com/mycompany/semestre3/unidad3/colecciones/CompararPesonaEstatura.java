package com.mycompany.semestre3.unidad3.colecciones;

import java.util.Comparator;

public class CompararPesonaEstatura implements Comparator<Persona> {
    @Override
    public int compare(Persona t, Persona t1) {
        return Float.compare(t.getEstatura(), t1.getEstatura());
    }
}
