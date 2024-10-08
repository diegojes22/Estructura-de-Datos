package ExampleGUI;

/**
 *
 * @author diego
 */
public class EjemploMenu extends javax.swing.JFrame {
    
    /* Atributos */
    private ControlPersona control = new ControlPersona();

    /**
     * Creates new form EjemploMenu
     */
    public EjemploMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pizarron = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenuOption1 = new javax.swing.JMenu();
        exitOptMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        listarOptMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PizarronLayout = new javax.swing.GroupLayout(Pizarron);
        Pizarron.setLayout(PizarronLayout);
        PizarronLayout.setHorizontalGroup(
            PizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
        );
        PizarronLayout.setVerticalGroup(
            PizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        FileMenuOption1.setText("Archivo");

        exitOptMenu.setText("Salir");
        exitOptMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitOptMenuMouseClicked(evt);
            }
        });
        FileMenuOption1.add(exitOptMenu);

        jMenuBar1.add(FileMenuOption1);

        jMenu2.setText("Agregar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        listarOptMenu.setText("Listar");
        listarOptMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarOptMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(listarOptMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pizarron)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pizarron)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        VentanaHijaAgregar vha = new VentanaHijaAgregar(control);
        Pizarron.add(vha);
        vha.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void exitOptMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitOptMenuMouseClicked
        
    }//GEN-LAST:event_exitOptMenuMouseClicked

    private void listarOptMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarOptMenuMouseClicked
        VentanaHijaListar vhi = new VentanaHijaListar(control);
        
        Pizarron.add(vhi);
        vhi.setVisible(true);
    }//GEN-LAST:event_listarOptMenuMouseClicked

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
            java.util.logging.Logger.getLogger(EjemploMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjemploMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjemploMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjemploMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjemploMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FileMenuOption1;
    private javax.swing.JDesktopPane Pizarron;
    private javax.swing.JMenu exitOptMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu listarOptMenu;
    // End of variables declaration//GEN-END:variables
}
