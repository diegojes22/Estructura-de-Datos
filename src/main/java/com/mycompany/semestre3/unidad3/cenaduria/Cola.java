package com.mycompany.semestre3.unidad3.cenaduria;

import com.mycompany.semestre3.unidad3.cenaduria.Pedido;
import javax.swing.table.DefaultTableModel;

public class Cola {
    /* Atributos */
    private int primero;
    private int ultimo;
    private int max;
    
    Pedido[] array;
    
    /* Metodos */
    /**
     * Constructor
     */
    public Cola() {
        max = 20;
        primero = -1;
        ultimo = -1;
        
        array = new Pedido[max];
    }
    
    /**
     * Verificar si la cola esta vacia
     * @return 
     */
    private boolean estaVacia() {
        return ultimo == -1;
    }
    
    /**
     * Verificar si la cola esta llena
     * @return 
     */
    private boolean estaLLena() {
        return ultimo >= max - 1;
    }
    
    /**
     * Agregar elementos a la cola
     * 
     * @param pedido
     * @return 
     */
    public String agregar(Pedido pedido) {
        String msg = "";
        
        if(!estaLLena()) {
            ultimo++;
            array[ultimo] = pedido;
            
            if(ultimo == 0) {
                primero = 0;
            } 
            
            return "Pedido agregado correctamente!";
        }
        
        return "Ya no se pueden atender mas pedidos!";
    }
    
    /**
     * 
     * @return 
     */
    public Pedido sacar() {
        Pedido pedidoListo = null;
        
        if(!estaVacia()) {
            pedidoListo = array[primero];
            array[primero] = null; 
            
            if(primero == ultimo) {
                primero = -1;
                ultimo = -1;
            }
            else {
                primero++;
            }
        }
        
        return pedidoListo;
    }
    
    /**
     * 
     * @return 
     */
    public String reporte() {
        String result = "";
        
        for(int i = primero; i <= ultimo; i++) {
            result += array[i].toString() + " \n";
        } 
        
        return result;
    }
    
    /**
     * 
     * @return 
     */
    public DefaultTableModel getTabla() {
        DefaultTableModel dtm = new DefaultTableModel();
        
        for(String m: Pedido.getAttribuitesAsArray())
            dtm.addColumn(m);
        
        for(int i = primero; i <= ultimo; i++) {
            dtm.addRow(array[i].getAllAsArray());
        }
        
        return dtm;
    }
}
