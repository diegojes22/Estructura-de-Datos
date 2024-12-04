package com.d.thefinalproyect;

import com.d.thefinalproyect.grapUtils.BasicDialogs;
import com.d.thefinalproyect.grapUtils.WindowTemplate;

import com.d.thefinalproyect.more.Libro;
import com.d.thefinalproyect.more.Others;
import java.util.TreeSet;

/**
 *
 * @author diego
 */
public class OtherDeletes extends javax.swing.JDialog implements WindowTemplate {
    ///
    /// Atributos
    ///
    private TreeSet<Libro> treebooks;
    
    ///
    /// Metodos
    ///
    public OtherDeletes(java.awt.Frame parent, boolean modal, TreeSet tree) {
        super(parent, modal);
        initComponents();
        
        treebooks = tree;
        
        windowConfig();
    }
    
    private void showTree() {
        table.setModel(Others.treeToTable(treebooks));
    }
    
    @Override
    public void windowConfig() {
        if(treebooks.isEmpty() || treebooks == null) 
            close();
        
        showTree();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void clearInputs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean validateFields() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void close() {
        dispose();
        setVisible(false);
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

        deleteLast = new javax.swing.JButton();
        deleteFirst = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        deleteAll = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        deleteLast.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        deleteLast.setForeground(new java.awt.Color(204, 204, 204));
        deleteLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x32/Placeholder.png"))); // NOI18N
        deleteLast.setText("Eliminar ultimo");
        deleteLast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLastActionPerformed(evt);
            }
        });

        deleteFirst.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        deleteFirst.setForeground(new java.awt.Color(204, 204, 204));
        deleteFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x32/Placeholder.png"))); // NOI18N
        deleteFirst.setText("Eliminar primero");
        deleteFirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFirstActionPerformed(evt);
            }
        });

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

        cancelar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x24/PageTransition.png"))); // NOI18N
        cancelar.setText("Volver");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x48/InputValidation.png"))); // NOI18N
        jLabel1.setText("Mas eliminaciones");

        deleteAll.setForeground(new java.awt.Color(102, 102, 102));
        deleteAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x24/ImplicitTransition.png"))); // NOI18N
        deleteAll.setText("Eliminar todo");
        deleteAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAllMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteLast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteAll)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteFirst)
                            .addComponent(deleteLast)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteAll)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ///
    /// Eventos de los componentes
    ///
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        close();
    }//GEN-LAST:event_cancelarActionPerformed

    private void deleteFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFirstActionPerformed
        treebooks.pollFirst();
        showTree();
    }//GEN-LAST:event_deleteFirstActionPerformed

    private void deleteLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLastActionPerformed
        treebooks.pollLast();
        showTree();
    }//GEN-LAST:event_deleteLastActionPerformed

    private void deleteAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMouseClicked
        if(evt.getButton() != 1 || treebooks.isEmpty()) return; // Permitir solo el click izquierdo
        
        if(BasicDialogs.question(this, "Seguro que desea eliminar todos los elementos del arbol? \nEsta accion es irreversible", "Precaucion") == BasicDialogs.YES) {
            treebooks.clear();
            
            BasicDialogs.warning(this, "Toda la informacion del arbol ha sido eliminada", "Accion critica realizada");
            close();
        }
    }//GEN-LAST:event_deleteAllMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OtherDeletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtherDeletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtherDeletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtherDeletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OtherDeletes dialog = new OtherDeletes(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel deleteAll;
    private javax.swing.JButton deleteFirst;
    private javax.swing.JButton deleteLast;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}