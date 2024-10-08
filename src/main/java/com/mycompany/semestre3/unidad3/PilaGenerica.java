package com.mycompany.semestre3.unidad3;

import com.mycompany.semestre3.unidad3.adminPack.Articulo;

public class PilaGenerica <E>{
    /* Atributos */
    private E pila[];
    private int max;
    private int tope;
    
    /* Metodos */
    // Constructor
    public PilaGenerica() {
        max = 20;
        tope = -1;
        pila = (E[]) new Object[max];
    }
    
    // Getters
    public int getTope() {
        return tope;
    }
    public int getMax() {
        return max;
    }
    public String getSize() {
        return tope + "/" + max;
    }
    
    // Verificar si esta llena
    private boolean isFull() {
        return tope == max - 1;
    }
    // Verificar si esta vacia
    private boolean isEmpty() {
        return tope == -1;
    }
    
    // Agregar objeto
    public String push(E obj) {
        String request = "No se pudo agregar el articulo por que la pila esta llena!";
        
        if(isFull()) return request; // verifica si la pila esta llena
        
        // agregar el objeto
        request = "Objeto "+getSize()+" agregado en la lista!";
        tope++;
        
        pila[tope] = obj;
        
        return request;
    }
    
    // Obtener el ultimo objeto y eliminarlo
    public E pop() {
        if(isEmpty()) return null;
        
        E obj = pila[tope];
        
        pila[tope] = null;
        tope--;
        
        return obj;
    }
    
    // Mostrar todo
    public String getAll() {
        String data = "";
        
        for(int i = 0; i <= tope; i++) {
            data += pila[i].toString() + "\n";
        }
        
        return data;
    }
}
