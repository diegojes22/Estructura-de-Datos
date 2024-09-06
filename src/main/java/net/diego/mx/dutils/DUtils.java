package net.diego.mx.dutils;

import java.util.Scanner;

/**
 *
 * Esta libreria esta en proceso de desarrollo.
 * Todavia no es funcional y esta version no
 * debe ser implementada aun por su temprana
 * etapa de desarrollo.
 */
public class DUtils {
    
    public static void lines(short large) {
        for(;large > 0; large--) {
            System.out.print("-");
        }
        System.out.println("");
    }
    
    public static void lines() {
        lines((short)50);
    }
    
    public static void pause() {
        System.out.println("Presiona Enter para continuar . . .");
        try {
            System.in.read();
        } 
        catch (Exception e) {}
        
    }
    
}
