package com.d.semestre3.unidad1.AlmacenMexico;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
 * ControlArticulo.java
 * 
 * My Message:
 * Que flojera documentar todo esto. Ojala me pagaran por hacer esto
 * y no al reves.  >:/
 * 
 */
public class ControlArticulo {
    /* Atributos */
    private Articulo[] inventario = null;
    private int max = 20;
    private int index = 0;
    
    /* Metodos */
    // Constructor
    public ControlArticulo() {
        inventario = new Articulo[max];
    }
    
    /**
     * Agregar() -> void
     * 
     * @param articulo El objeto a agregar en el arreglo que 
     * contiene a los otros elementos.
     */
    public void Agregar(Articulo articulo) {
        // Verificar si hay espacio
        if(VeificarEspacio()) return;
        
        // verificar si no hay otro articulo con el mismo nombre.
        if(CompararNombres(articulo.getNombre())) {
            System.out.println("Error: Ya existe un articulo con el mismo nombre! Intente de nuevo por favor.");
            return;
        }
        
        // Agregar
        inventario[index] = articulo;
        index++;
    }
    
    /**
     * Agregar() -> void
     * 
     * @param nombre
     * @param marca
     * @param codigo
     * @param precio
     * @param existencia
     * @param categoria 
     * 
     * Es lo mismo pero en vez de pasar un objeto ya creado, puedes pasar
     * directamente los atributos y el metodo creara el objeto, y se lo
     * pasara al otro metodo que recibe un objeto para agregarlo.
     */
    public void Agregar(String nombre, String marca, int codigo, float precio, int existencia, String categoria) {
        Agregar(new Articulo(nombre, marca, codigo, precio, existencia, categoria));
    }
    
    /**
     * BuscarPorNombre() -> String
     * 
     * Buscamos un objeto por su nombre para ver sus propiedades, nada
     * mas.
     * 
     * @param nombre Referencia para buscar el objeto.
     * 
     * @return Las propiedades del objeto como un String para que
     * sean impresas.
     */
    public String BuscarPorNombre(String nombre) {
        String consulta = "Error: ["+nombre+"] no se encuentra en la lista.";
        
        for(int p = 0; p < index; p++) {
            if(inventario[p].getNombre().equalsIgnoreCase(nombre)) {
                consulta = inventario[p].toString();
            }
        }
        
        return consulta;
    }
    
    public String BuscarPorCategoria(String categoria) {
        String consulta = "";
        
        for(int i = 0; i < index; i++) {
            if(inventario[i].getCategoria().equalsIgnoreCase(categoria)) {
                consulta += inventario[i];
            }
        }
        
        return consulta;
    }
    
    /**
     * CompararNombres() -> bool
     * 
     * @param nombre Nombre a comprarar para ver i dicho nombre ya
     * existe en la lista.
     * 
     * @return Si el nombre ya esta en la lista, el valor devuelto es
     * true, en caso contrario sera false.
     * 
     * Este metodo es de uso privado, es utilizadopara evitar que
     * se agregen dos objetos con el mismo nombre en la lista y 
     * evitar posibles conflictos y errores.
     */
    private boolean CompararNombres(String nombre) {
        for(int p = 0; p < index; p++) {
            if(inventario[p].getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * EliminarPorNombres() -> void
     * 
     * @param nombre Nombre del objeto que se desea eliminar.
     * 
     * Este metodo elimina un objeto de la lista, al eliminarlo los
     * elementos que estan por delante son recorridos para evitar
     * huecos en la lista.
     */
    public void EliminarPorNombre(String nombre) {
        for(int p = 0; p < index; p++) {
            if(inventario[p].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Elemento eliminado!");
                inventario[p] = null;
                
                for(int i = p; i < index; i++) {
                    try {
                        inventario[i] = inventario[i+1];
                        inventario[i+1] = null;    
                    } catch(Exception e) {
                        System.err.println("A ocurrido un error:");
                        System.out.println(e.toString());
                    }
                }
                
                index--;
                break;
            }
        }
    }
    
    /**
     * MostrarTodo() -> Sring
     * 
     * @return Devuelve la lista completa de todos los objetos
     * que existen en la misma. Esto lo hace en formato String.
     */
    public String MostrarTodo() {
        String consulta = "";
        
        for(int p = 0; p < index; p++) {
            consulta += inventario[p].toString() + "\n";
        }
        
        return consulta;
    }
    
    /**
     * VerificarEspacio() -> bool
     * 
     * @return True si la lista esta llena.
     * 
     * Verificamos si hay suficiente espacio en la lista para
     * evitar posibles excepciones o comportamientos indeeados.
     */
    private boolean VeificarEspacio() {
        if(index >= max-1) {
            System.out.println("Error: No se pudo agregar el objeto porque la lista esta llena!");
            return true;
        }
        
        return false;
    }
    
    public String getCategorias() {
        String categorias = "";
        
        for(int i = 0; i < index; i++) {
            String c = inventario[i].getCategoria() + " ";
        }
        
        categorias = Arrays.stream(categorias.split((" "))).distinct().collect(Collectors.joining(" "));
        
        return categorias;
    }
    
    public String getEnumList() {
        String lista = "";
        
        for(int i = 0; i < index; i++) {
            lista += (i+1) + inventario[i].getNombre() + "\n";
        }
        
        return lista;
    }
    
    public boolean updateExistencia(int id, int unidades) {
        if(id < 0 || id > index) {
            System.out.println("Error: Noexiste ningun articulo con ese ID!");
            return false;
        }
        
        // venta de articulos
        if(unidades < 0) {
            if(inventario[id].getExistencia() < (-1)*unidades) {
                System.out.println("Advertencia: No hay suficientes articulos para vender.");
                return false;
            }else{
                inventario[id].setExistencia(
                    inventario[id].getExistencia() + unidades
                );
            }
        }
        
        // compra de unidades
        else if (unidades > 0) {
            inventario[id].setExistencia(
                    inventario[id].getExistencia() + unidades
                );
        }
        
        return true;
    }
    
    /**
     * Solo es para ver los espacios ocupados, nada mas.
     * No es muy util pero por algo esta aqui.
     * 
     * @return String
     */
    public String getEspaciosOcupados() {
        return (index)+" de "+(max-1);
    }
}
