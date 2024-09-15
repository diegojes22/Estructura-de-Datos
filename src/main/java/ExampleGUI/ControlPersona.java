package ExampleGUI;

import javax.swing.table.DefaultTableModel;


/**
 *
 * @author diego
 */
public class ControlPersona {
    /* Atributos */
    private Persona arreglo[];
    private int count;
    private int max;
    
    /* Metodos */
    public ControlPersona() {
        max = 10;
        count = 0;
        arreglo = new Persona[10];
    }
    
    public void Agregar(Persona persona) {
        if(count < max) {
            arreglo[count] = persona;
            count++;
        }
    }
    
    public String Listar() {
        String lista = "";
        
        for(Persona p : arreglo) {
            if(p == null) break;
            lista += p.toString() + "\n";
        }
        
        return lista;
    }
    
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
}
