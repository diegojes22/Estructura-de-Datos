package com.mycompany.semestre3.unidad3.colecciones;

public class Tiempo {
    /* Atributos */
    private int hora;
    private int minuto;
    private int segundo;

    /* Metodos */
    // Constructor
    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Getters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    
    // Setters
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    // toString
    @Override
    public String toString() {
        return hora+":"+minuto+":"+segundo;
    }
}
