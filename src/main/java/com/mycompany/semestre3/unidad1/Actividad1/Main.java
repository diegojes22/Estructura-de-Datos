package com.mycompany.semestre3.unidad1.Actividad1;

import java.util.Scanner;


/**
 * INSTITUTO TECNOLOGICO DE LA PIEDAD
 * 
 * Autor: Diego Jesus Muñoz Andrade
 * Github: @diegojes22
 * 
 * My Message:
 * Por favor, no robes este codigo :(
 * Piensalo, hacer esto fue algo que me costo mucho trabajo y esfuerzo
 * como para que algien use mi trabajo sin por lo menos darme un
 * reconocimiento o algo del credito. Ademas robar es algo que no es
 * nada etico ni legal. Si ignoras esto, pues ya que >:/
 * - SERIAL DESIGNATION D-0x007eff
 * 
 */

public class Main {
    /* Atributos globales */
    static Scanner in = new Scanner(System.in);
    
    /* Main */
    public static void main(String[] args) {
        // Variables
        int opc = 0;
        
        // Mainloop
        do{
            // Main Menu
            System.out.println("--=={ Inicio }==--");
            System.out.println("[1] Catalogo");
            System.out.println("[2] Opcion 2");
            System.out.println("[3] Opcion 3");
            System.out.println("[0] Salir del programa");
            
            System.out.print("\nElige >");
            opc = in.nextInt();
            lines();
            
            // Evaluar opcion
            switch(opc) {
                case 1:
                    
                    break;
                    
                case 2:
                    System.out.println("--=={ Opcion 2 }==--");
                    break;
                    
                case 3:
                    System.out.println("--=={ Opcion 3 }==--");
                    break;
                    
                case 0:
                    System.out.println("Nos vemos pronto. Adios ;)");
                    in.close();
                    break;
                    
                default:
                    // Don't read
                    if(opc == 22 || opc == -775)  System.out.println("Como encontraste esto? !no deberias estar aqui! Para mas informacion busca Serial Designation [] en google.");

                    System.out.println("Esa opcion no esta disponible o no existe.");
                    pause();
                    break;
            }
            
            lines();
            
        }while(opc != 0);
    }
    
    /* Submenus */
    public static void MenuCatalogo() {
        // variables
        int opc = 0;
        
        do{
            // Opciones del menu
            lines();
            System.out.println("\t--=={ Catalogo }==--");
            System.out.println("\t[0] Salir");
            
            System.out.println("\n\tElige >");
            opc = in.nextInt();
            
            // evaluar
            switch(opc) {
                case 1:
                    System.out.println("--=={ Opcion 1 }==--");
                    System.out.println("No hay nada aqui porque no lo he programado.\n");
                    
                    pause();
                    break;
                    
                case 0:
                    System.out.println("Volviendo . . .");
                    break;

            }
            
            
        }while(opc != 0);
    }
    
    /* Otros metodos */
    /**
     * lines: imprime una serie de lineas en consola para
     *        poder separar el contenido o para mejorar
     *        la estetica.
     */
    public static void lines() {
        for(int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
    
    /**
     * pause: Pequeña pausa hasta que se presiona una tecla.
     *        Util para poder ver a detalle informacion que
     *        se imnprime o simplemente para poner un freno.
     *        LA IMAGINACION ES EL LIMITE ;> 
     * 
     */
    public static void pause() {
        System.out.println("Presiona Enter para continuar . . .");
        try {
            System.in.read();
        } 
        catch (Exception e) {}
        
    }
}
