package com.d.semestre3.unidad1.AlmacenMexico;

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
 * Articulo.java
 * 
 * My Message:
 * Ninguno :/
 * 
 */

public class Articulo {
    /* Atributos */
    private String nombre;
    private String marca;
    private int codigo;
    private float precio;
    private int existencia;
    private String categoria;
    
    /* Metodos */
    public Articulo(String nombre, String marca, int codigo, float precio, int existencia, String categoria) {
        this.nombre = nombre;
        this.marca = marca;
        this.codigo = codigo;
        this.precio = precio;
        this.existencia = existencia;
        this.categoria = categoria;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getMarca() { return marca; }
    public int getCodigo() { return codigo; }
    public float getPrecio() { return precio; }
    public int getExistencia() { return existencia; }
    public String getCategoria() { return categoria; }
    
    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public void setPrecio(float precio) { this.precio = precio; }
    public void setExistencia(int existencia) { this.existencia = existencia; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    // ToString
    @Override
    public String toString() {
        return "Articulo{" 
                + "nombre=" + nombre + 
                ", marca=" + marca + 
                ", codigo=" + codigo + 
                ", precio=" + precio + 
                ", existencia=" + existencia + 
                ", categoria=" + categoria + 
        '}';
    }
    
    
    
}
