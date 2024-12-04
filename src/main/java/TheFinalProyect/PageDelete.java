package com.d.thefinalproyect;

import com.d.thefinalproyect.grapUtils.BasicDialogs;
import com.d.thefinalproyect.grapUtils.RoundedPanel;
import com.d.thefinalproyect.grapUtils.WindowTemplate;

import com.d.thefinalproyect.more.Libro;
import com.d.thefinalproyect.more.Others;
import java.util.Iterator;
import java.util.TreeSet;

public class PageDelete extends RoundedPanel implements WindowTemplate {

    ///
    /// Atributos
    ///
    private TreeSet<Libro> treebooks;
    
    ///
    /// Metodos
    ///
    /** Constructor */
    public PageDelete(TreeSet tree) {
        super(40);
        initComponents();
        
        treebooks = tree;
        
        windowConfig();
    }
    
    private void showTree() {
        table.setModel(Others.treeToTable(treebooks));
    }
    
    @Override
    public void windowConfig() {
        showTree();
        
        // Verificar si hay elementos
        if(treebooks.isEmpty()) {
            BasicDialogs.error(this, "El arbol esta vacio, por lo que no se pueden eliminar elementos", "Arbol vacio");
            eliminar.setEnabled(false);
            return;
        }
    }

    @Override
    public void clearInputs() {
        // Do Nothing
    }

    @Override
    public boolean validateFields() {
        return false;
    }

    @Override
    public void close() {
        // Do Nothing
    }

    ///
    /// Inicializacion de los elementos
    ///
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        invocarMasOpciones = new javax.swing.JLabel();

        setBackground(new java.awt.Color(63, 56, 66));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x48/InputValidation.png"))); // NOI18N
        jLabel1.setText("Eliminar");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        eliminar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x24/InputValidation.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        invocarMasOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x24/DropDownButton.png"))); // NOI18N
        invocarMasOpciones.setText("Mas opciones");
        invocarMasOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invocarMasOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invocarMasOpcionesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invocarMasOpciones, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(invocarMasOpciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    ///
    /// Eventos de los componentes
    ///
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int selection = table.getSelectedRow();
        Libro[] libros = new Libro[treebooks.size()];
        
        // Verificar si hay elementos
        if(treebooks.isEmpty()) {
            BasicDialogs.error(this, "El arbol esta vacio, por lo que no se pueden eliminar elementos", "Arbol vacio");
            eliminar.setEnabled(false);
            return;
        }
        // Verificar si hay un elemento seleccionado
        if(selection == -1) {
            BasicDialogs.warning(this, "Por favor, seleccione un elemento para eliminarlo", "Advertencia");
            return;
        }
        
        // Recorrer el arbol para eliminar el elemento
        Iterator i = treebooks.iterator();
        int pos = 0;
        do {
            Libro libro = (Libro)i.next();
            
            if(pos == selection) {
                if(treebooks.remove(libro)) {
                    BasicDialogs.info(this, "Objeto eliminado", "Listo");
                    showTree();
                    return;
                }
            }
            
            pos++;
        } while(i.hasNext());
        
        // En caso de no coincidir mostrar error
        BasicDialogs.error(this, "No fue posible eliminar el libro. \nIntente de nuevo por favor", "No se completo la tarea!");
    }//GEN-LAST:event_eliminarActionPerformed

    private void invocarMasOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invocarMasOpcionesMouseClicked
        if(evt.getButton() != 1) return; // Permitir solo el click izquierdo
        
        new OtherDeletes(null, true, treebooks);
        showTree();
    }//GEN-LAST:event_invocarMasOpcionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel invocarMasOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
