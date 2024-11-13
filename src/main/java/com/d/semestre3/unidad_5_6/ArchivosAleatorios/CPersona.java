package com.d.semestre3.unidad_5_6.ArchivosAleatorios;

public class CPersona {
    ///
    /// Atributos
    ///
    private String nombre;
    private String direccion;
    private long telefono;

    ///
    /// Metodos 
    ///
    /** Constructor */
    public CPersona(String nombre, String direccion, long telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /* Getters */
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    /* Setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    // More
    public int size() {
        return nombre.length() * 2 + direccion.length() * 2 + 8;
    }
}
