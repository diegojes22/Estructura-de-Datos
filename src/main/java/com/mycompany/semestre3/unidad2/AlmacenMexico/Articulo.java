package com.mycompany.semestre3.unidad2.AlmacenMexico;

public class Articulo {
    /* Atributos */
    private String nombre;
    private String marca;
    private int codigo;
    private float precio;
    private int existencia;
    private String categoria;
    private String descripcion;
    
    /* Metodos */
    // constructor
    public Articulo(String nombre, String marca, int codigo, float precio, int existencia, String categoria, String descripcion) {
        this.nombre = nombre;
        this.marca = marca;
        this.codigo = codigo;
        this.precio = precio;
        this.existencia = existencia;
        this.categoria = categoria;
        this.descripcion = descripcion; 
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getMarca() { return marca; }
    public int getCodigo() { return codigo; }
    public float getPrecio() { return precio; }
    public int getExistencia() { return existencia; }
    public String getCategoria() { return categoria; }
    public String getDescripcion() { return descripcion; }
    
    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public void setPrecio(float precio) { this.precio = precio; }
    public void setExistencia(int existencia) { this.existencia = existencia; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setDescripcion(String desccripcion) { this.descripcion = descripcion; }
    
    // otros metodos
    public String[] getAsList() {
        return new String[] {
            getNombre(),
            getMarca(),
            getCodigo()+"",
            getPrecio()+"",
            getExistencia()+"",
            getCategoria()+"",
            getDescripcion()
        };
    }
    
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