package com.d.semestre3.unidad2;

import java.util.Scanner;
import net.diego.mx.dutils.DUtils;

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
        // Variables
        Scanner in = new Scanner(System.in);
        int opc = 0;
        long n, k;
        
        // mainloop
        do {
            DUtils.lines();
            System.out.println("[1] Factorial recusivo");
            System.out.println("[2] Potencia recursiva");
            System.out.println("[3] Serie de Fibonnaci recursivo");
            System.out.println("[4] Factorial iterativo");
            System.out.println("[5] Potencia iterativa");
            System.out.println("[6] Serie de Fibonnaci iterativo");
            System.out.println("[0] Salir");
            DUtils.lines();
            
            System.out.print("Ingrese la opcion: >_");
            opc = in.nextInt();
            
            DUtils.lines();
            
            switch(opc) {
                case 1:
                    System.out.println("--==[ FACTORIAL RECURSIVO ]==--");
                    System.out.print("Ingrese el numero para calcular su factorial: ");
                    n = in.nextInt();
                    
                    System.out.println("Factorial: "+factorial(n));
                    break;
                    
                case 2:
                    System.out.println("--==[ EXPONENTE RECURSIVA ]==--");
                    System.out.print("Ingrese la base:");
                    n = in.nextInt();
                    System.out.print("Ingrese el exponente:");
                    k = in.nextInt();
                    
                    System.out.println("Resultado: "+potenciaRecursiva(n, k));
                    break;
                    
                case 3:
                    System.out.println("--==[ FIBONACCI RECURSIVO ]==--");
                    System.out.print("Ingrese el tope de la serie:");
                    n = in.nextInt();
                    
                    System.out.println("\n"+fibonacciRecursivo(0, 1, n));
                    break;
                    
                case 4:
                    System.out.println("--==[ FACTORIAL ITERATIVO ]==--");
                    System.out.print("Ingrese el numero para calcular su factorial: ");
                    n = in.nextInt();
                    
                    System.out.println("Factorial: "+fact(n));
                    break;
                    
                case 5:
                    System.out.println("--==[ POTENCIA ITERATIVA ]==--");
                    System.out.print("Ingrese la base:");
                    n = in.nextInt();
                    System.out.print("Ingrese el exponente:");
                    k = in.nextInt();
                    
                    System.out.println("Resultado: "+potenciaIterativa(n, k));
                    break;
                    
                case 6:
                    System.out.println("--==[ FIBONACCI ITERATIVO ]==--");
                    System.out.print("Ingrese el numero de impresiones de la serie:");
                    n = in.nextInt();
                    
                    System.out.println("\n"+fibonacciIterativo(n));
                    break;
            }
        } while(opc != 0);
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
    
    /**
     * Calculamos la potencia de un numero de la
     * forma recursiva.
     * 
     * @param n
     * @param k
     * @return 
     */
    public static long potenciaRecursiva(long n, long k) {
        if (k == 0) return 1;
        return n * potenciaRecursiva(n, k - 1); // que lata con esto, por eso usen la funcion definida y ya >:(
    }
    
    /**
     * Calculamos la potencia de un numero de forma iterativa,
     * lo clasico.
     * @param n
     * @param k
     * @return 
     */
    public static long potenciaIterativa(long n, long k) {
        long p = n;
        
        for(long i = 1; i < k; i++ ) {
            p *= n;
        }
        
        return p;
    }
    
    /**
     * Calculamos la sucecion de fibonacci recursivamente.
     * 
     * @param a numero 1
     * @param b numero 2
     * @param n tope de la serie
     * @return 
     */
    public static String fibonacciRecursivo(long a, long b, long n) {
        if (a >= n) return " ";
        
        return a + ", " + fibonacciRecursivo(b, b+a, n);  // no tocar! Esto me hizo sufrir
    }
    
    /**
     * Sucesion de fibonacci hasta n repeticiones con un for.
     * 
     * @param n
     * @return 
     */
    public static String fibonacciIterativo(long n) {
        String serie = "";
        long a = 0;
        long b = 1;
        
        for(long i = 0; i < n; i++) {
            serie += b + ", " + a + ", ";
            b = a+b;
            a = b+a;
        }
        
        return serie;
    }
}
