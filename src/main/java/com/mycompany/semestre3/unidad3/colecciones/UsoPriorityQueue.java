package com.mycompany.semestre3.unidad3.colecciones;

import java.util.PriorityQueue;

public class UsoPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Double> cola = new PriorityQueue<Double>();
        cola.offer(1.2);
        cola.offer(9.8);
        cola.offer(5.4);
        cola.offer(3.7);
        cola.offer(10.5);
        cola.offer(2.4);
        
        for(Double d: cola) {
            System.out.println(d);
        }
        
        while(cola.size() > 0) {
            System.out.println("Elemento a eliminar: "+cola.peek());
            cola.poll();
        }
        
        if(cola.isEmpty()) {
            System.out.println("La cola esta vacia!");
        }
    }
}
