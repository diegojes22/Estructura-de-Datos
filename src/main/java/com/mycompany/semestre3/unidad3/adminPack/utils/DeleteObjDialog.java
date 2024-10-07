package com.mycompany.semestre3.unidad3.adminPack.utils;

public class DeleteObjDialog extends javax.swing.JDialog {
    /* Atributos */
    DialogWinRequest request;
    
    /* Metodos */
    /**
     * Constructor por defecto.
     */
    public DeleteObjDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    /**
     * Mostramos el dialogo, pero esta aun mas simplificado
     * y es mas facil de llamar.
     * @param parent
     * @return 
     */
    public static int showDialog(java.awt.Frame parent) {
        DialogWinRequest request = new DialogWinRequest();
        
        DeleteObjDialog subwin = new DeleteObjDialog(parent, true);
        subwin.setUserRequest(request);
        subwin.setVisible(true);
        
        return request.getRequest();
    }
    
    /**
     * Le pasamos el atributo para establecer la comunicacion
     * y poder obtener una respuesta de acuerdo al parametro 
     * por referencia y el boton pulsado.
     * 
     * @param r 
     */
    public void setUserRequest(DialogWinRequest r) {
        this.request = r;
        request.windowClosedOrHiden();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winBg = new javax.swing.JPanel();
        titleWindow = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        acceptBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        winBg.setBackground(new java.awt.Color(51, 51, 51));
        winBg.setForeground(new java.awt.Color(255, 255, 255));

        titleWindow.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        titleWindow.setForeground(new java.awt.Color(255, 204, 102));
        titleWindow.setIcon(new javax.swing.ImageIcon("/home/diego/NetBeans-Proyects/Estructura-de-Datos/src/main/java/com/mycompany/semestre3/unidad3/adminPack/images/x32/advertencia.png")); // NOI18N
        titleWindow.setText("Advertencia");

        messageLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setText("¿Esta seguro de que quiere eliminar el ultimo elemento de la pila?");
        messageLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cancelBtn.setBackground(new java.awt.Color(0, 153, 255));
        cancelBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("No");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        acceptBtn.setBackground(new java.awt.Color(255, 102, 102));
        acceptBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        acceptBtn.setForeground(new java.awt.Color(255, 255, 255));
        acceptBtn.setText("Si");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout winBgLayout = new javax.swing.GroupLayout(winBg);
        winBg.setLayout(winBgLayout);
        winBgLayout.setHorizontalGroup(
            winBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winBgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(winBgLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(winBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(winBgLayout.createSequentialGroup()
                        .addComponent(titleWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        winBgLayout.setVerticalGroup(
            winBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(80, 80, 80)
                .addGroup(winBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(winBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(winBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Evento de los componentes graficos */
    /**
     * Evento para cancelar
     * @param evt 
     */
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.request.cancelIsPressed();
        this.setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    /**
     * Evento para aceptar
     * @param evt 
     */
    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        this.request.acceptIsPressed();
        this.setVisible(false);
    }//GEN-LAST:event_acceptBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteObjDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteObjDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteObjDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteObjDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteObjDialog dialog = new DeleteObjDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel titleWindow;
    private javax.swing.JPanel winBg;
    // End of variables declaration//GEN-END:variables
}
