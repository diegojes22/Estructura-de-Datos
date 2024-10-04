package com.mycompany.semestre3.unidad3;

public class Articulo {
    /* Atributos */
    private String nombre;
    private double precio;
    private int codigo;
    private short existencia;
    
    /* Metodos */
    // Constructor
    public Articulo(String nombre, double precio, int codigo, short existencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.existencia = existencia;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public short getExistencia() {
        return existencia;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setExistencia(short existencia) {
        this.existencia = existencia;
    }

    // ToString
    @Override
    public String toString() {
        return "Article{" + "nombre=" + nombre + ", precio=" + precio + ", codigo=" + codigo + ", existencia=" + existencia + '}';
    }
    
}
