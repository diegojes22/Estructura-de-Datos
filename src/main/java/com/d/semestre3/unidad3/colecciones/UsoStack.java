package com.d.semestre3.unidad3.colecciones;

import java.util.Stack;

public class UsoStack {
    public static void main(String[] args) {
        Stack<Number> pila = new Stack<Number>();
        
        Long numLong = 12L;
        Integer numInt = 32;
        Float numFloat = 1235.54f;
        Double numDouble = 3527.54;
        
        pila.push(numInt);
        pila.push(numLong);
        pila.push(numFloat);
        pila.push(numDouble);
        
        System.out.println("sacar e ultimo elemento: "+pila.pop());
        
        if(pila.isEmpty())
            System.out.println("La pila esta vacia!");
        else {
            System.out.println("\n..:: Elementos de la pila ::..");
            for(Number n : pila) {
                System.out.println(n);
            }
        }
        
    }
}
