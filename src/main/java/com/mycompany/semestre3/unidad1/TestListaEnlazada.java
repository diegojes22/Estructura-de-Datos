/**
 * Alumno: Diego Jesus Muñioz Andrade
 * Grupo: 3-C
 * 
 * Unidad 1
 * 
 * Actividad 1
 * Una breve introduccion sobre las listas enlazadas
 * y a estructuras de datos.
 * 
 */

package com.mycompany.semestre3.unidad1;

import java.util.Scanner;
import net.diego.mx.dutils.DUtils;

public class TestListaEnlazada {
    public static void main(String[] args) {
        // Variables
        String name;   // attributes of the class
        String email;
        int phone;
        
        Agenda P = null;
        Agenda node = null;
        
        short opc = 0;
        Scanner in = new Scanner(System.in);
        
        // Mainloop
        do {
            // Main menu of the program
            System.out.println("[1] Append node in the final");
            System.out.println("[2] Append node in the start");
            System.out.println("[3] View all nodes");
            System.out.println("[4] Search node");
            System.out.println("[5] Delete the last node");
            System.out.println("[6] Delete the first node");
            System.out.println("[7] Exit");
            
            // read
            System.out.print("\nChoose a option: ");
            opc = (short)in.nextInt();
            
            switch(opc) {
                case 1:
                    System.out.println("--[ Agregar nodo al final ]--");
                    System.out.print("Ingrese el nombre: ");     // Datos para crear el objeto
                    name = in.nextLine();name = in.nextLine();
                    System.out.print("Ingrese el correo: ");
                    email = in.nextLine();
                    System.out.print("Ingrese el numero: ");
                    phone = in.nextInt();
                    
                    node = new Agenda(name, email, phone, null);
                    
                    // Generar lista si no hay
                    if(P == null) {
                        P = CrearPrimero(P, node);
                    }
                    // Agregar a la lista
                    else {
                        AgregarFinal(P, node);
                    }
                    
                    break;
                case 2:
                    System.out.println("--[ Agregar nodo al inicio ]--");
                    System.out.print("Ingrese el nombre: ");
                    name = in.nextLine();name = in.nextLine();
                    System.out.print("Ingrese el correo: ");
                    email = in.nextLine();
                    System.out.print("Ingrese el numero: ");
                    phone = in.nextInt();
                    
                    node = new Agenda(name, email, phone, null);
                    
                    if(P == null) {
                        P = CrearPrimero(P, node);
                    }
                    else {
                        P = AgregarInicio(P, node);
                    }
                    break;
                case 3:
                    System.out.println("--[ Elementos en la lista ]--");
                    recorrer(P);
                    DUtils.lines();
                    break;
                case 4:
                    System.out.println("--[ Buscar por nombre ]--");
                    System.out.print("Ingrese el nombre del usuario a buscar: ");
                    name = in.nextLine();name = in.nextLine();
                    
                    System.out.println("\nResultado:\n");
                    System.out.println(BuscarPorNombre(name, P)+"\n");
                    
                    DUtils.pause();
                    DUtils.lines();
                    break;
                case 5:
                    System.out.println("--[ Eliminar el ultimo elemento ]--");
                    P = EliminarFinal(P);
                    DUtils.lines();
                case 6:
                    System.out.println("--[ Eliminar primer elemento ]--");
                    P = EliminarInicio(P);
                    break;
                case 7:
                    System.out.println("OK, Good Bye ;)");
                    break;
                default:
                    System.out.println("Sorry :(");
                    break;
            }
            
        } while(opc != 7);
        
        in.close();
    }
    
    /* Operaciones */
    public static Agenda CrearPrimero(Agenda P, Agenda Nodo) {
        P = Nodo;
        return P;
    }
    
    public static Agenda AgregarInicio(Agenda P, Agenda Nodo) {
        Nodo.setNode(P);
        P = Nodo;
        return P;
    }
    
    public static void recorrer(Agenda P) {
        Agenda Q = P;
        
        while(Q != null) {
            System.out.println(Q.toString());
            Q = Q.getNode();
        }
    }
    
    public static void AgregarFinal(Agenda P, Agenda Nodo) {
        Agenda Q = P;
        
        // si solo hay un elemento en la lista
        if(Q.getNode() == null) {
            Q.setNode(Nodo);
            return;
        } 
        
        while(Q != null) {
            if(Q.getNode() == null) {
                Q.setNode(Nodo);
                Nodo.setNode(null);// Corrige el loop (Don't touch)
                Q = null;
            } else {
                Q = Q.getNode();
            }
        }
    }
    
    public static Agenda EliminarInicio(Agenda P) {
        // Si la lista esta vacia, solo para avisar
        if(P == null) {
            System.out.println("Error, la lista esta vacia");
        }
        // Si solo hay un elemento
        else if(P.getNode() == null) {
            P = null;
        }
        // Si hay mas elementos
        else {
            P = P.getNode();
        }
        
        return P;
    }
    
    public static Agenda EliminarFinal(Agenda P) {
        Agenda Q = P;
        Agenda T = null;
        
        // si la lista esta vacia
        if (P == null) {
            System.out.println("Error: La lista esta vacia!");
        }
        // si solo hay un elemento en la lista
        else if (P.getNode() == null) {
            P = null;
        }
        
        // Si hay mas de 2 elementos: Pendiente revisar en la casa
        else {
            while(Q.getNode() != null) {
                T = Q;
                Q = Q.getNode();
            }    
            
            Q = null;
            T.setNode(null);
        }
        
        return P;
    }
    
    public static String BuscarPorNombre(String nombre, Agenda P) {
        Agenda Q = P;
        String result = "["+nombre+"]"+" no se encuentra en la lista.";
        
        while(Q != null) {
            if(Q.getName().equalsIgnoreCase(nombre)) {;
                result = Q.toString();
                break;
            }
            
            Q = Q.getNode();
        }
        
        return result;
    }
}