package com.mycompany.semestre3.unidad3.colecciones;

public class Persona {
    /* Atributos */
    private String nombre;
    private String apellidoPaterno;
    private String apelludoMaterno;
    private short edad;
    private float estatura;
    
    /* Metodos */
    // Constructor
    public Persona(String nombre, String apellidoPaterno, String apelludoMaterno, short edad, float estatura) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apelludoMaterno = apelludoMaterno;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApelludoMaterno() {
        return apelludoMaterno;
    }

    public short getEdad() {
        return edad;
    }

    public float getEstatura() {
        return estatura;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApelludoMaterno(String apelludoMaterno) {
        this.apelludoMaterno = apelludoMaterno;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    // toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apelludoMaterno=" + apelludoMaterno + ", edad=" + edad + ", estatura=" + estatura + '}';
    }
    
    
    
}
