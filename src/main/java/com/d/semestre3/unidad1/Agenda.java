/**
 * Alumno: Diego Jesus Muñioz Andrade
 * Grupo: 3-C
 * 
 * Unidad 1
 * 
 * Actividad 1
 * Una breve introduccion sobre las listas enlazadas
 * y a estructuras de datos.
 * 
 */

package com.d.semestre3.unidad1;

public class Agenda {
    // Atributos
    private String name;
    private String email;
    private int phone;
    
    private Agenda node; // referencia al siguiente objeto de la pila

    // Metodos
    /**
     * Constructor
     */
    public Agenda(String name, String email, int phone, Agenda node) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.node = node;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getPhone() { return phone; }
    public Agenda getNode() { return node; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(int phone) { this.phone = phone; }
    public void setNode(Agenda node) { this.node = node; }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agenda{");
        sb.append("name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append('}');
        return sb.toString();
    }
    
    public void append(Agenda new_node) {
        node = new_node;
    }
    
    ///////////////////////////////////
    public static void main(String[] args) {
        Agenda p = new Agenda("Juan", "12", 1,
                new Agenda("Pedro", "13", 2, 
                        new Agenda("Maria", "63e5", 3, null)
                )
        );
        
        System.out.println(p.toString());
    }

}