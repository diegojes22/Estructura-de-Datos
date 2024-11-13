package com.d.semestre3.unidad3.colecciones;

import java.util.Comparator;

public class ComparadorTiempo implements Comparator<Tiempo>{

    @Override
    public int compare(Tiempo t, Tiempo t1) {
        int compararHora = t.getHora() - t1.getHora();
        if(compararHora != 0) 
            return compararHora;
        
        int compararMinuto = t.getMinuto() - t1.getMinuto();
        if(compararMinuto != 0) 
            return compararMinuto;
        
        int compararSegundo = t.getSegundo() - t1.getSegundo();
        return compararSegundo;
    }
    
}
