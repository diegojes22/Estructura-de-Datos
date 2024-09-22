package com.mycompany.semestre3.unidad1.AlmacenMexico;

import java.util.Scanner;


/**
 * INSTITUTO TECNOLOGICO DE LA PIEDAD
 * 
 * ESTRUCTURA DE DATOS
 * PRACTICA 1
 * UNIDAD 1
 * 
 * Autor: Diego Jesus Muñoz Andrade
 * Github: @diegojes22
 * IDE: Apache NetBeans
 * OS: Arch Linux
 * 
 * Main.java
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
    static ControlArticulo control = new ControlArticulo();
    
    /* Main */
    public static void main(String[] args) {
        // Variables
        int opc = 0;
        
        // Mainloop
        do{
            // Main Menu
            lines();
            System.out.println("\t--=={ Inicio }==--");
            System.out.println("[1] Catalogo");
            System.out.println("[2] Movimientos");
            System.out.println("[0] Salir del programa");
            
            System.out.print("\nElige >");
            opc = in.nextInt();
            lines();
            
            // Evaluar opcion
            switch(opc) {
                case 1:
                    MenuCatalogo();
                    break;
                    
                case 2:
                    MenuMovimientos();
                    break;
                    
                case 0:
                    System.out.println("Nos vemos pronto. Adios ;)");
                    in.close();
                    break;
                    
                default:
                    // Don't read
                    if(opc == 22 || opc == -775)  System.out.println("Como encontraste esto? !no deberias estar aqui! Para mas informacion busca Serial Designation [letra] en google.");

                    System.out.println("Esta opcion no esta disponible o no existe.");
                    pause();
                    break;
            }
            
            lines();
            
        }while(opc != 0);
    }
    
    /* Submenus */
    /**
     * MenuCatalogo() -> void
     * 
     * En este submenu "MenuCatalogo" estan todas las opciones y operaciones
     * principales a la hora de manejar y llevar el control de los
     * articulos en esta simulacion. 
     * :>
     */
    public static void MenuCatalogo() {
        // variables
        int opc = 0;
        String nombre;
        
        do{
            // Opciones del menu
            lines();
            System.out.println("\t--=={ Catalogo }==--");
            System.out.println("[1] Altas");
            System.out.println("[2] Bajas");
            System.out.println("[3] Buscar por nombre");
            System.out.println("[4] Catalogo de articulos");
            System.out.println("[0] Volver al inicio");
            
            System.out.print("\n\tElige >");
            opc = in.nextInt();
            
            lines();
            
            // evaluar
            switch(opc) {
                case 1:
                    System.out.println("\t--=={ Altas }==--");
                    System.out.println("Espacios usados: "+control.getEspaciosOcupados()+"\n");
                    control.Agregar(LeerArticulo());
                    
                    break;
                    
                case 2:
                    System.out.println("\t--=={ Bajas }==--");
                    
                    System.out.print("Ingrese el nombre del elemento a eliminar: ");
                    nombre = in.nextLine();nombre = in.nextLine();
                    
                    control.EliminarPorNombre(nombre);
                    
                    break;
                    
                case 3:
                    System.out.println("\t--=={ Buscar por nombre }==--");
                    
                    System.out.print("Ingrese el nombre del elemento a buscar: ");
                    nombre = in.nextLine();nombre = in.nextLine();
                    
                    System.out.println("\n"+control.BuscarPorNombre(nombre));
                    
                    pause();
                    break;
                    
                case 4:
                    System.out.println("\t--=={ Catalogo completo }==--");
                    System.out.println(control.MostrarTodo());
                    
                    pause();
                    break;
                    
                case 0:
                    System.out.println("Volviendo al inicio . . .");
                    break;
                    
                default:
                    System.out.println("Opcion no disponible");
                    break;

            }
        }while(opc != 0);
    }
    
    /**
     * LeerArticulo() -> void
     * 
     * Este metodo se encarga de leer los atributos y devuelve el
     * objeto "Articulo" de acuerdo a los atributos definidos.
     * Principalmente esta ya que se simplifica y se ahorran algunas
     * lineas e codigo. Ya sabes, conceptos de la OOP.
     * 
     * @return Objeto de tipo articulo, resultante de leer los datos.
     */
    public static Articulo LeerArticulo() {
        // Variables
        String nombre = null;
        String marca = null;
        int codigo = 0;
        float precio = 0;
        int existencia = 0;
        String categoria = null;
        
        String opt = "n";
        
        // ciclo de lectura
        do {
            try {
                System.out.print("Ingrese el nombre del articulo: ");
                nombre = in.nextLine();nombre = in.nextLine();
                System.out.print("Ingrese la marca del articulo: ");
                marca = in.nextLine();
                System.out.print("Ingrese el codigo: ");
                codigo = in.nextInt();
                System.out.print("Ingrese el precio del producto: ");
                precio = in.nextFloat();
                System.out.print("Ingrese la existencia del producto: ");
                existencia = in.nextInt();
                System.out.print("Ingrese la categoria del producto: ");
                categoria = in.next();
                
                // confirmacion por parte del usuario
                try {
                    System.out.print("\nLos datos son correctos? <S/N> ");
                    opt = in.next();
                } catch(Exception e) {}
                
            } catch(Exception e) {
                System.err.println("Error de lectura!");
                System.out.println(e.toString());
            }
            
        }while(opt.equalsIgnoreCase("n") || opt.equalsIgnoreCase("no"));
        
        return new Articulo(nombre, marca, codigo, precio, existencia, categoria);
    }
    
    public static void MenuMovimientos() {
        // variables
        int opc = 0;
        int unidades = 0;
        int id = 0;
        String categoria = "";
        
        do {
            // Opciones del menu
            lines();
            System.out.println("\t--=={ Catalogo }==--");
            System.out.println("[1] Compras de articulos");
            System.out.println("[2] Ventas de articulos");
            System.out.println("[3] Reporte general");
            System.out.println("[4] Reporte por categoria");
            System.out.println("[0] Volver al inicio");
            
            System.out.print("\n\tElige >");
            opc = in.nextInt();
            
            lines();
            
            // evaluar
            switch(opc) {
                case 1:
                    System.out.println("--=={ Comprar articulos }==--");
                    System.out.println("Lista de articulos: ");
                    System.out.println(control.getEnumList());
                    
                    System.out.print("Elige el id del articulo: ");
                    id = in.nextInt();
                    System.out.println("Elije el numero de articulos a comprar: ");
                    unidades = in.nextInt();
                    
                    if(control.updateExistencia(id, unidades)) {
                        System.out.println("Transaccion completa con exito!");
                    }
                    break;
                    
                case 2:
                    System.out.println("--=={ Vender articulos }==--");
                    System.out.println("Lista de articulos: ");
                    System.out.println(control.getEnumList());
                    
                    System.out.print("Elige el id del articulo: ");
                    id = in.nextInt();
                    System.out.println("Elije el numero de articulos a vender: ");
                    unidades = in.nextInt();
                    
                    if(control.updateExistencia(id, -unidades)) {
                        System.out.println("Transaccion completa con exito!");
                    }
                    break;
                    
                case 3:
                    System.out.println("--=={ Reporte general }==--");
                    System.out.println(control.MostrarTodo());
                    
                    System.out.println("\nAdvertencia: Para poder editar la informacion vital debe ser super usuario!");
                    pause();
                    break;
                    
                case 4:
                    System.out.println("\t--=={ Categorias }==--");
                    System.out.println("Selecione la categoria: ");
                    System.out.println(control.getCategorias());
                    
                    System.out.print("\nBuscar >_ ");
                    categoria = in.next();
                    
                    System.out.println(control.BuscarPorCategoria(categoria));
                    
                    pause();
                    lines();
                    
                case 0:
                    System.out.println("Volviendo al inicio . . .");
                    break;
                    
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
        } while(opc != 0);
    }
    
    /* Otros metodos */
    /**
     * lines() -> void
     * 
     * imprime una serie de lineas en consola para
     * poder separar el contenido o para mejorar
     * la estetica.
     */
    public static void lines() {
        for(int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
    
    /**
     * pause() -> void
     * 
     * Pequeña pausa hasta que se presiona una tecla.
     * Util para poder ver a detalle informacion que
     * se imnprime o simplemente para poner un freno.
     * LA IMAGINACION ES EL LIMITE ;> 
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
