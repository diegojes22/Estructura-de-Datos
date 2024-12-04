package com.d.thefinalproyect.more;

import java.io.Serializable;

public class Libro implements Serializable{
    ///
    /// Atributos
    ///
    private String titulo;
    private int ISBN;
    private int numeroPaginas;
    private String fecha;
    private String editorial;
    private String autor;
    
    ///
    /// Metodos
    ///
    /** Constructor */
    public Libro(String titulo, int ISBN, int numeroPaginas, String fecha, String editorial, String autor) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.fecha = fecha;
        this.editorial = editorial;
        this.autor = autor;
        
    }
    

    /* Getters */
    public String getTitulo() {
        return titulo;
    }
    public int getISBN() {
        return ISBN;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public String getFecha() {
        return fecha;
    }
    public String getEditorial() {
        return editorial;
    }
    public String getAutor() {
        return autor;
    }

    /* Setters */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    /* More Methods */
    /** ToString */
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", numeroPaginas=" + numeroPaginas + ", fecha=" + fecha + ", editorial=" + editorial + ", Autor = "+autor+"}";
    }
    
    /**
     * Obtenemos el nombre de los atributos del objeto,
     * lo cual es perfecto para tablas.
     * @return 
     */
    public static String[] getAtributtesNames() {
        return new String[] {"Titulo", "ISBN", "Numero de paginas", "fecha", "editorial", "Autor"};
    }
    
    /**
     * Obtenemos el valor de los atributos como
     * un arreglo de Strings.
     * @return 
     */
    public String[] getAsStrArray() {
        return new String[] {
            titulo,
            ISBN+"",
            numeroPaginas+"",
            fecha,
            editorial,
            autor
        };
    }
    
}
