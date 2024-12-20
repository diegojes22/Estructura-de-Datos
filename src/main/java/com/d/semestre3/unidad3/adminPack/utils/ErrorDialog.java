package com.d.semestre3.unidad3.adminPack.utils;

public class ErrorDialog extends javax.swing.JDialog {
    /* Atributos */
    private DialogWinRequest request;
    private String title;
    private String msg;

    /* Metodos */
    /**
     * Constructor por defecto.
     */
    public ErrorDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    /**
     * Establecer el valor para los otros atributos.
     * 
     * @param title
     * @param msg 
     */
    public void setAtribuittes(String title, String msg) {
        this.title = title;
        this.msg = msg;
        
        this.titleWindow.setText(title);
        this.messageLabel.setText(msg);
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
     * Mostramos el dialogo, pero esta aun mas simplificado
     * y es mas facil de llamar.
     * @param parent
     * @return 
     */
    public static int showDialog(java.awt.Frame parent, String title, String msg) {
        DialogWinRequest request = new DialogWinRequest();
        
        ErrorDialog subwin = new ErrorDialog(parent, true);
        subwin.setAtribuittes(title, msg);
        subwin.setUserRequest(request);
        subwin.setVisible(true);
        
        return request.getRequest();
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
        acceptBtn = new javax.swing.JButton();
        titleWindow = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        winBg.setBackground(new java.awt.Color(51, 51, 51));
        winBg.setForeground(new java.awt.Color(255, 255, 255));

        acceptBtn.setBackground(new java.awt.Color(0, 153, 255));
        acceptBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        acceptBtn.setForeground(new java.awt.Color(255, 255, 255));
        acceptBtn.setText("OK");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        titleWindow.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        titleWindow.setForeground(new java.awt.Color(255, 102, 102));
        titleWindow.setText("Error");

        messageLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setText("Mensaje de error");
        messageLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout winBgLayout = new javax.swing.GroupLayout(winBg);
        winBg.setLayout(winBgLayout);
        winBgLayout.setHorizontalGroup(
            winBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winBgLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(winBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(winBgLayout.createSequentialGroup()
                        .addGroup(winBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(winBgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(winBgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(winBgLayout.createSequentialGroup()
                        .addComponent(titleWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))))
        );
        winBgLayout.setVerticalGroup(
            winBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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

    /* Eventos de los componentes */
    /**
     * Cerrar la ventana de dialogo
     * @param evt 
     */
    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        this.request.cancelIsPressed();
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
            java.util.logging.Logger.getLogger(ErrorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ErrorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ErrorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ErrorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ErrorDialog dialog = new ErrorDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel titleWindow;
    private javax.swing.JPanel winBg;
    // End of variables declaration//GEN-END:variables
}
