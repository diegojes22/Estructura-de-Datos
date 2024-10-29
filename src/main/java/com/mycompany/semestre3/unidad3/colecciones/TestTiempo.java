package com.mycompany.semestre3.unidad3.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTiempo {
    public static void main(String[] args) {
        List<Tiempo> listaTiempo = new ArrayList<Tiempo>();
        
        listaTiempo.add(new Tiempo(8,28,30));
        listaTiempo.add(new Tiempo(06,00,00));
        listaTiempo.add(new Tiempo(5,20,00));
        listaTiempo.add(new Tiempo(5,20,10));
        listaTiempo.add(new Tiempo(24,12,00));
        listaTiempo.add(new Tiempo(23,33,44));
        listaTiempo.add(new Tiempo(23,33,10));
        
        System.out.println("..:: Lista Desordenada ::..");
        for(Tiempo t: listaTiempo){
            System.out.println(t);
        }
        
        Collections.sort(listaTiempo, new ComparadorTiempo());
        
        System.out.println("\n..:: Lista Ordenada ::..");
        for(Tiempo t: listaTiempo){
            System.out.println(t);
        }
    }
}
