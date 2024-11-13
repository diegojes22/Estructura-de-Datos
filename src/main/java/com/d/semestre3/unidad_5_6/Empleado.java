package com.d.semestre3.unidad_5_6;

public class Empleado {
    ///
    /// Atributos
    ///
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String rfc;
    private double salario;
    private String departamento;
    private String puesto;
    private char genero;
    
    ///
    /// Metodos
    ///
    /** Constructor */
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String rfc, double salario, String departamento, String puesto, char genero) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rfc = rfc;
        this.salario = salario;
        this.departamento = departamento;
        this.puesto = puesto;
        this.genero = genero;
    }

    /* Getters */
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getRfc() {
        return rfc;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public char getGenero() {
        return genero;
    }

    /* Setter */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    /* More ... */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", rfc=" + rfc + ", salario=" + salario + ", departamento=" + departamento + ", puesto=" + puesto + ", genero=" + genero + '}';
    }
    
    
    
    
    
}
