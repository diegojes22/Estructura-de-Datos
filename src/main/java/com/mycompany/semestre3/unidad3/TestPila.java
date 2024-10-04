package com.mycompany.semestre3.unidad3;

import java.util.Scanner;
import net.diego.mx.dutils.DUtils;

public class TestPila {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        
        int opc = 0;
        
        // mainloop
        do {
            DUtils.lines();
            System.out.print("\tINICIO");
            System.out.println("[1] Agregar elemento");
            System.out.println("[2] Sacar elemento");
            System.out.println("[3] Mostrar");
            System.out.println("[0] Salir");
            
            System.out.print("\nElige >_");
            opc = in.nextInt();
            DUtils.lines();
            
            switch(opc) {
                // Salida
                case 0:
                    System.out.println("Adios ;)");
                    break;
            }
        } while(opc != 0);
    }
}