package com.d.semestre3.unidad_5_6.ArchivosAleatorios;

import java.io.IOException;
import java.util.Scanner;

public class TestPersona {
    static ControlPersona cp;
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Variables
        int opcion = 0;
        int pos = -1;
        String cadenaBuscar = null;
        
        String nombre;
        String direccion;
        long telefono;
        
        boolean eliminado = false;
        boolean modificado = false;
        boolean listaModificados = false;
        
        // 
    }
    
    public static int menu() {
        System.out.println("------------------------------------");
        System.out.println("[1] Buscar");
        System.out.println("[2] Buscar siguiente");
        System.out.println("[3] Modificar");
        System.out.println("[4] Añadir");
        System.out.println("[4] Eliminar\n");
        System.out.println("[6] Salir");
        System.out.println("------------------------------------");
        
        System.out.print("C:\\>_");
        return in.nextInt();
    }
    
    public static boolean modificar(int nreg) throws IOException{
        int opc = 0;
        
        String nombre, direccion;
        long telefono;
        
        CPersona objeto = cp.valorEn(nreg);
        
        if(objeto == null) return false;
        
        do {
            System.out.println("------------------------------------");
            System.out.println("[1] Modificar el nombre");
            System.out.println("[2] Modificar la direccion");
            System.out.println("[3] Modificar el numero de telefono\n");
            System.out.println("[4] Salir y guardar");
            System.out.println("[5] Salir sin guardar");
            System.out.println("------------------------------------");
            
            System.out.print("C:\\>_ ");
            opc = in.nextInt();
            
            switch(opc) {
                case 1: 
                    System.out.print("Nombre: ");
                    nombre = in.next();
                    
                    objeto.setNombre(nombre);
                    break;
                case 2: 
                    System.out.print("direccion: ");
                    direccion = in.next();
                    
                    objeto.setDireccion(direccion);
                    break;
                case 3: 
                    System.out.print("Telefono: ");
                    telefono = in.nextLong();
                    
                    objeto.setTelefono(telefono);
                    break;
                    
                case 4:
                    System.out.println("Guardando ...");
                    
                    System.out.println("Saliendo ...");
                    break;
                    
                case 5:
                    System.out.println("Saliendo ...");
                    break;
                
            }
        } while(opc != 4 && opc != 5);
        
        if(opc == 4 ) {
            return cp.ponerValorEn(nreg, objeto);
        }
        
        return false;
            
    }
}
