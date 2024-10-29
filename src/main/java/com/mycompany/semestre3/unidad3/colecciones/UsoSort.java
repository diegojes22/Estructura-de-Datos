package com.mycompany.semestre3.unidad3.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsoSort {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<Integer>();
        List<String> nombres = new ArrayList<String>();
        
        listaNumeros.add(12);
        listaNumeros.add(69);
        listaNumeros.add(-88);
        listaNumeros.add(19);
        listaNumeros.add(0);
        listaNumeros.add(22);
        
        nombres.add("Niko");
        nombres.addFirst("Miguel");
        nombres.addLast("Adrian");
        nombres.add("Diego");
        nombres.add("Tania");
        nombres.add("Rebeca");
        nombres.add("Caty");
        nombres.add("Fatima");
        nombres.add("Pedrito");
        
        System.out.println("LISTAS DESORDENADAS");
        System.out.println("...:::: ::::...");
        for(Integer n: listaNumeros) {
            System.out.println(n);
        }
        
        System.out.println("...:::: ::::...");
        for(String n: nombres) {
            System.out.println(n);
        }
        
        // ordernar
        Collections.sort(listaNumeros);
        Collections.sort(nombres);
        
        System.out.println("\nLISTAS ORDENADAS");
        System.out.println("...:::: ::::...");
        for(Integer n: listaNumeros) {
            System.out.println(n);
        }
        
        System.out.println("...:::: ::::...");
        for(String n: nombres) {
            System.out.println(n);
        }
        
        // ordenar
        Collections.sort(nombres, Collections.reverseOrder());
        Collections.sort(listaNumeros, Collections.reverseOrder());
        
        System.out.println("\nLISTAS ORDENADAS AL REVES");
        System.out.println("...:::: ::::...");
        for(Integer n: listaNumeros) {
            System.out.println(n);
        }
        
        System.out.println("...:::: ::::...");
        for(String n: nombres) {
            System.out.println(n);
        }
    }
}
