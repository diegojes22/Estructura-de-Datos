package com.d.semestre3.unidad3.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UsoLinkedList {
    public static void main(String[] args) {
        // Variables
        LinkedList<String> nombres = new LinkedList<String>();
        List<String> nombres2 = new ArrayList<String>();
        
        nombres.add("Niko");
        nombres.addFirst("Miguel");
        nombres.addLast("Adrian");
        nombres.add(1, "Diego");
        
        nombres2.add("Tania");
        nombres2.add("Paola");
        nombres2.add("Yocelyn");
        nombres2.add("Caty");
        nombres2.add("Fatima");
        nombres2.add("Fernanda");
        
        nombres.addAll(2, nombres2);
        
        for(String n: nombres) {
            System.out.println(n);
        }
        
        
    }
}
