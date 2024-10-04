package com.mycompany.semestre3.unidad3;

public class Pedido {
    /* Atributos */
    private String nombreCliente;
    private int noPedido;
    private String direccion;
    private String telefono;
    
    private final String[] menu = {       // Platillos del menu
        "Enchiladas",
        "Tacos dorados",
        "Refresco",
        "Pozole",
        "Sopes",
    };
    private final float[] precios = {     // Precios de los platillos
        8,
        6,
        20,
        60,
        11,
    };
    private final int noPlatillos = menu.length;  // Numero de platillos
    
    private short orden[] = new short[noPlatillos];
    
    /* Metodos */
    // Constructor
    public Pedido(String nombreCliente, int noPedido, String direccion, String telefono) {
        this.nombreCliente = nombreCliente;
        this.noPedido = noPedido;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public Pedido(String nombreCliente, int noPedido, String direccion, String telefono, short[] orden) {
        this.nombreCliente = nombreCliente;
        this.noPedido = noPedido;
        this.direccion = direccion;
        this.telefono = telefono;
        
        this.orden = orden;
    }
    
    // Getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getNoPedido() {
        return noPedido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String[] getMenu() {
        return menu;
    }

    public float[] getPrecios() {
        return precios;
    }

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public short[] getOrden() {
        return orden;
    }
    
    // Setters
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNoPedido(int noPedido) {
        this.noPedido = noPedido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setOrden(short[] orden) {
        this.orden = orden;
    }
    
    // ToString
    @Override
    public String toString() {
        String cadena = "Pedido {" + "nombreCliente=" + nombreCliente + ", noPedido=" + noPedido + ", direccion=" + direccion + ", telefono=" + telefono + "} \n";
        double total = 0;
        
        // imprimir el pedido como una tabla
        cadena += "|Platillo\t|Cuanto\t|Precio\t|Total\t| \n";
        
        for(int i = 0; i < noPlatillos; i++) {
            if(orden[i] != 0)
                cadena += "|"+menu[i]+"\t|"+orden[i]+"\t|"+precios[i]+"\t|"+precios[i]*orden[i]+"\t| \n";
            
            total += precios[i] * orden[i];
        }
        
        cadena += "\nTotal a pagar = "+total+"\n";
        
        return cadena;
    }
    
}
