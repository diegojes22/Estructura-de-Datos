package ExampleGUI;

/**
 *
 * @author diego
 */
public class Persona {
    /* Atributos */
    private String nombre;
    private int edad;
    private int estatura;
    
    /* Metodos */
    // Constructor
    public Persona(String nombre, int edad, int estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public int getEstatura() { return estatura; }
    
    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setEstatura(int estatura) { this.estatura = estatura; }

    // toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + '}';
    }
    
    
}
