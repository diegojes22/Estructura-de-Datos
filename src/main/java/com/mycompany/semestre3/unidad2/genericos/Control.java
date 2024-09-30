package com.mycompany.semestre3.unidad2.genericos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class Control <E> {
    /* Atributos */
    private E[] arreglo;
    private int count;
    private int max;
    
    /* Metodos */
    public Control() {
        max = 10;
        count = 0;
        arreglo = (E[]) new Object[max];
    }
    
    public void agregar(E obj) {
        if(count < max) {
            arreglo[count] = obj;
            count++;
        }
    }
    
    public String listar() {
        String lista = "";
        
        for(E p : arreglo) {
            if(p == null) break;
            lista += p.toString() + "\n";
        }
        
        return lista;
    }
    /*
    public DefaultTableModel ObtenerTable() {
        DefaultTableModel dtm = new DefaultTableModel();
        Object[] row = new Object[3];
        
        dtm.addColumn("NOMBRE");
        dtm.addColumn("EDAD");
        dtm.addColumn("ESTATURA");
        
        for(int i = 0; i < count; i++) {
            row[0] = arreglo[i].getNombre();
            row[1] = arreglo[i].getEdad();
            row[2] = arreglo[i].getEstatura();
            
            dtm.addRow(row);
        }
        
        return dtm;
    }
    */
}
