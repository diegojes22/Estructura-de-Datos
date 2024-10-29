
package com.mycompany.semestre3.unidad3.colecciones.BusquedaBinaria;

/**
 *
 * @author diego
 */
public class Persona {
    /* Atributos */
    private String nombre;
    private int edad;

    /* Constructor */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /* Metodos */
    public String getNombre() { return this.nombre; }
    public int getEdad() { return this.edad; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre+" Edad: "+this.edad;
    }

    public int compareTo(Persona p) {
        return this.nombre.compareTo(p.getNombre());
    }
}
