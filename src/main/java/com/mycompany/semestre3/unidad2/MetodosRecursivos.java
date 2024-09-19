package com.mycompany.semestre3.unidad2;

import java.util.Scanner;

/**
 * INSTITUTO TECNOLOGICO DE LA PIEDAD
 * 
 * 18 de Septiembre del 2024
 * Estructuras de Datos: Unidad 1
 * 
 * Programa 1: Tipico programa del factorial :/
 * Enserio, ya estoy cansado de este tipo de
 * programas.
 * 
 */
public class MetodosRecursivos {
    /* Main */
    public static void main(String[] args) {
        // Variables=
        Scanner in = new Scanner(System.in);
        long n;
        
        // leer
        System.out.print("Ingrese un numero para calcuar su factorial: ");
        n = in.nextInt();
        
        // resultado
        System.out.println("\nResultado: "+fact(n)+"\n");
    }
    
    /**
     * Factorial al estilo recursivo.
     * 
     * @param n Numero para calcular su factorial
     * @return factorial del numero
     */
    public static long factorial(long n) {
        if(n == 0) 
            return 1;
                
        else 
            return n * factorial(n - 1);
    }
    
    /**
     * Factorial pero con un ciclo.
     * 
     * @param n Numero para calcular el factorial
     * @return factorial del numero.
     */
    public static long fact(long n) {
        long f = n;
        
        for(long i = 1; i < n; i++ ) {
            f *= i;
        }
        
        return f;
    }
}
