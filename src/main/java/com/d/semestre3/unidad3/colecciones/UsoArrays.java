package com.d.semestre3.unidad3.colecciones;

import java.util.Arrays;

/**
 *
 * @author diego
 */
public class UsoArrays {
    private int arregloInt[] = {1,2,3,4,5,6};
    private double arregloDouble[] = {8.4, 9.3, 0.2, 7.9, 3.4};
    private int arregloIntLLeno[], copiaArregloInt[];
    
    public UsoArrays() {
        arregloIntLLeno = new int[10];
        copiaArregloInt = new int[arregloInt.length];
        
        Arrays.fill(arregloIntLLeno, 9);
        Arrays.sort(arregloDouble);
        
        System.arraycopy(arregloInt, 0, copiaArregloInt, 0, copiaArregloInt.length);
    }
    
    public void imprimirArreglos() {
        System.out.print("Arreglo double: ");
        for(double val : arregloDouble) {
            System.out.printf("%.1f, ", val);
        }
        
        System.out.print("\nArreglo entero: ");
        for(int val : arregloInt) {
            System.out.printf("%d, ", val);
        }
        
        System.out.print("\nArreglo entero lleno: ");
        for(int val : arregloIntLLeno) {
            System.out.printf("%d, ", val);
        }
        
        System.out.print("\nArreglo entero copiado: ");
        for(int val : copiaArregloInt) {
            System.out.printf("%d, ", val);
        }
        
        System.out.println();
    }
    
    public int buscarUnInt(int val) {
        return Arrays.binarySearch(arregloInt, val);
    }
    
    public void imprimirIgualdad() {
        boolean isEqual = Arrays.equals(arregloInt, copiaArregloInt);
        
        System.out.printf("Arreglo int %s Copia arreglo\n", 
            (isEqual ? "==" : "!=")
        );
    }
    
    public void imprimirIgualdad2() {
        boolean isEqual = Arrays.equals(arregloInt, arregloIntLLeno);
        
        System.out.printf("Arreglo int %s Arreglo lleno\n", 
            (isEqual ? "==" : "!=")
        );
    }
    
    public static void main(String[] args) {
        UsoArrays prog = new UsoArrays();
        
        prog.imprimirArreglos();
        prog.imprimirIgualdad();
        prog.imprimirIgualdad2();
        
        System.out.println("La posicion del objeto es: "+prog.buscarUnInt(5));
        System.out.println("La posicion del objeto es: "+prog.buscarUnInt(22));
    }
}
