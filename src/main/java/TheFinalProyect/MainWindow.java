package com.d.thefinalproyect;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import javax.swing.UIManager;

import com.d.thefinalproyect.grapUtils.*;

import com.d.thefinalproyect.more.CompareByTitle;
import com.d.thefinalproyect.more.Libro;
import com.d.thefinalproyect.more.Seriable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.TreeSet;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class MainWindow extends javax.swing.JFrame {
    ///
    /// Atributos
    ///
    private TreeSet<Libro> treebooks;
    
    private File archivo;
    private JFileChooser fileChooser;
    private String ruta;
    private boolean isSaved;
    
    ///
    /// Metodos
    ///
    /** Constructor */
    public MainWindow() {
        initComponents();
        configWindow();
        
        treebooks = new TreeSet<Libro>(new CompareByTitle());
        
        fileChooser = new JFileChooser();
        ruta = "";
        archivo = null;
        isSaved = false;
        
    }
    
    /**
     * Configuraciones basicas de la ventana
     */
    private void configWindow() {
        setLocationRelativeTo(null);
        setTitle("TreeLib");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                askToSave();
                closeWindow();
            }
        });
        
        setWelcomePage();
    }
    
    /**
     * Establecer la pagina de inicio
     */
    private void setWelcomePage() {
        Utils.addPanel(mainBackground, new WelcomePage());
    }
    
    /**
     * Limpiar el area donde se muestran las
     * paginas de trabajo.
     */
    private void clearMainBackground() {
        mainBackground.removeAll();
        mainBackground.revalidate();
        mainBackground.repaint();
    }
    
    /**
     * Cerrar la ventana
     */
    private void closeWindow() {
        dispose();
        setVisible(false);
        System.exit(0);
    }
    
    /** 
     * Indicar que el contenido ha sido modificado y que deve
     * ser guardado
     */
    private void contentModified() {
        isSaved = false;
        setTitle("TreeLib *");
    }
    
    private boolean checkFile() {
        return !isSaved || ruta.isEmpty() || ruta.equals("");
    }
    
    /**
     * Pregunta si se quiere guardar el archivo actual
     */
    private void askToSave() {
        if(isSaved) return;
        
        if(checkFile()) return;
        
        if(BasicDialogs.question(this, "Desea guardar el archivo actual", "Advertencia") != BasicDialogs.YES) 
            return;
        
         try {
            Seriable.write(treebooks, ruta);
            setTitle("TreeLib");
            isSaved = true;
        } catch(Exception e) {
            e.printStackTrace();
            BasicDialogs.error(this, "No fue posible guardar el archivo", "Error de guardado");
            setTitle("TreeLib *");
        }
    }
    
    /**
     * Abre un archivo que contenga un objeto
     * de la clase TreeSet
     */
    private void openFile() {
        // Si hay un archivo actualmente abierto se solicita permiso
        if(checkFile()) 
            askToSave();
        
        // Elegir el archivo y en caso de que se cancele la seleccion no se hace nada
        if (fileChooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) 
            return;
        
        archivo = fileChooser.getSelectedFile();
        ruta = archivo.getAbsolutePath();
        
        // Intentar abrir el archivo
        try {
            treebooks = Seriable.read(ruta);
            if(treebooks == null) throw new Exception();
        } catch(Exception e) {
            BasicDialogs.error(this, "No se abrir este archivo porque no es compatible", "Error de lectura");
            treebooks = new TreeSet<Libro>();
        }
    }
    
    /**
     * Crear un nuevo archivo para trabajar sobre el
     * @return 
     */
    private boolean newFile() {
        // Si hay un archivo actualmente abierto se solicita permiso
        if(checkFile()) 
            askToSave();
        
        // Preguntar en donde se guardara el archivo
        if (fileChooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) 
            return false;
        
        // seleccionar el archivo
        archivo = fileChooser.getSelectedFile();
        ruta = archivo.getAbsolutePath();
        
        // verificar si ya existe un archivo con el mismo nombre
        if(archivo.exists()) {
            if(BasicDialogs.question(this, "El archivo ya existe \n¿Desea sobreescribirlo?", "Confirmacion") != BasicDialogs.YES) {
                ruta = "";
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Guardar arbol en un nuevo archivo
     */
    private void saveAs() {
        if(!newFile()) 
            return;
        
        if(!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch(Exception e) {
                BasicDialogs.error(this, "No se pudo guardar el archivo porque no es posible crearlo", "Error al guardar el archivo");
                return;
            }
        }
        
        try {
            Seriable.write(treebooks, ruta);
            setTitle("TreeLib");
            isSaved = true;
        } catch(Exception e) {
            e.printStackTrace();
            BasicDialogs.error(this, "No fue posible guardar el archivo", "Error de guardado");
            setTitle("TreeLib *");
        }
    }
    
    /**
     * Guardar un archivo
     */
    private void save() {
        if(ruta.equals("") || ruta.isEmpty()) 
            saveAs();
        
        try {
            Seriable.write(treebooks, ruta);
            setTitle("TreeLib");
            isSaved = true;
        } catch(Exception e) {
            BasicDialogs.error(this, "No fue posible guardar el archivo", "Error de guardado");
            setTitle("TreeLib *");
        }
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

        windowSideMenu = new RoundedPanel(40);
        gotoWelcomePage = new javax.swing.JButton();
        gotoSearchPage = new javax.swing.JButton();
        gotoDeletePage = new javax.swing.JButton();
        gotoListPage = new javax.swing.JButton();
        exitFromApp = new javax.swing.JButton();
        gotoSetings = new javax.swing.JButton();
        gotoSavePage = new javax.swing.JButton();
        gotoAddPage = new javax.swing.JButton();
        mainBackground = new RoundedPanel(40);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        windowSideMenu.setBackground(new java.awt.Color(51, 51, 51));

        gotoWelcomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x32/Acrylic.png"))); // NOI18N
        gotoWelcomePage.setToolTipText("Inicio");
        gotoWelcomePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoWelcomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoWelcomePageActionPerformed(evt);
            }
        });

        gotoSearchPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x32/IconElement.png"))); // NOI18N
        gotoSearchPage.setToolTipText("Buscar");
        gotoSearchPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoSearchPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoSearchPageActionPerformed(evt);
            }
        });

        gotoDeletePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x32/InputValidation.png"))); // NOI18N
        gotoDeletePage.setToolTipText("Eliminar");
        gotoDeletePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoDeletePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoDeletePageActionPerformed(evt);
            }
        });

        gotoListPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x32/TreeView.png"))); // NOI18N
        gotoListPage.setToolTipText("Listar");
        gotoListPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoListPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoListPageActionPerformed(evt);
            }
        });

        exitFromApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x32/PageTransition.png"))); // NOI18N
        exitFromApp.setToolTipText("Salir");
        exitFromApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitFromApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFromAppActionPerformed(evt);
            }
        });

        gotoSetings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x32/ColorPaletteResources.png"))); // NOI18N
        gotoSetings.setToolTipText("Ajustes");
        gotoSetings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoSetings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoSetingsActionPerformed(evt);
            }
        });

        gotoSavePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x32/CalendarView.png"))); // NOI18N
        gotoSavePage.setToolTipText("Archivo");
        gotoSavePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoSavePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoSavePageActionPerformed(evt);
            }
        });

        gotoAddPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x32/AppBarToggleButton.png"))); // NOI18N
        gotoAddPage.setToolTipText("Agregar");
        gotoAddPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoAddPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoAddPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout windowSideMenuLayout = new javax.swing.GroupLayout(windowSideMenu);
        windowSideMenu.setLayout(windowSideMenuLayout);
        windowSideMenuLayout.setHorizontalGroup(
            windowSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowSideMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(windowSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(windowSideMenuLayout.createSequentialGroup()
                        .addComponent(gotoWelcomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(windowSideMenuLayout.createSequentialGroup()
                        .addComponent(gotoSearchPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(windowSideMenuLayout.createSequentialGroup()
                        .addComponent(gotoDeletePage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(windowSideMenuLayout.createSequentialGroup()
                        .addComponent(gotoListPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(windowSideMenuLayout.createSequentialGroup()
                        .addComponent(exitFromApp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(windowSideMenuLayout.createSequentialGroup()
                        .addComponent(gotoSetings, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(windowSideMenuLayout.createSequentialGroup()
                        .addComponent(gotoSavePage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(windowSideMenuLayout.createSequentialGroup()
                        .addComponent(gotoAddPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        windowSideMenuLayout.setVerticalGroup(
            windowSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowSideMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gotoWelcomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gotoAddPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gotoSearchPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gotoListPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gotoDeletePage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gotoSavePage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gotoSetings, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitFromApp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainBackground.setBackground(new java.awt.Color(63, 56, 66));

        javax.swing.GroupLayout mainBackgroundLayout = new javax.swing.GroupLayout(mainBackground);
        mainBackground.setLayout(mainBackgroundLayout);
        mainBackgroundLayout.setHorizontalGroup(
            mainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );
        mainBackgroundLayout.setVerticalGroup(
            mainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(windowSideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(mainBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(windowSideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(mainBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ///
    /// Eventos de los componentes
    ///
    /** Opcion de Agregar */
    private void gotoAddPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoAddPageActionPerformed
        Utils.addPanel(mainBackground, new PageAdd(treebooks));
        contentModified();
    }//GEN-LAST:event_gotoAddPageActionPerformed

    /** Opcion para volver a la pantalla de inicio */
    private void gotoWelcomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoWelcomePageActionPerformed
        setWelcomePage();
    }//GEN-LAST:event_gotoWelcomePageActionPerformed

    /** Opcion de busqueda */
    private void gotoSearchPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoSearchPageActionPerformed
        Utils.addPanel(mainBackground, new PageSearch(treebooks));
    }//GEN-LAST:event_gotoSearchPageActionPerformed

    /** Opcion de listar */
    private void gotoListPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoListPageActionPerformed
        Utils.addPanel(mainBackground, new PageList(treebooks));
    }//GEN-LAST:event_gotoListPageActionPerformed

    /** Opcion de eliminar */
    private void gotoDeletePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoDeletePageActionPerformed
        Utils.addPanel(mainBackground, new PageDelete(treebooks));
        contentModified();
    }//GEN-LAST:event_gotoDeletePageActionPerformed

    /** Opcion de ajustes */
    private void gotoSetingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoSetingsActionPerformed
        Utils.addPanel(mainBackground, new Settings());
    }//GEN-LAST:event_gotoSetingsActionPerformed

    /** Opcion de guardado */
    private void gotoSavePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoSavePageActionPerformed
        int status = 0;
        SaveDialog guardar = new SaveDialog(this, true);
        
        status = guardar.showWin();
        
        switch(status) {
            case SaveDialog.DEFAULT:
                return;
                
            case SaveDialog.SAVE:
                this.save();
                break;
                
            case SaveDialog.SAVE_AS:
                this.saveAs();
                break;
                
            case SaveDialog.NEW:
                this.newFile();
                break;
                
            case SaveDialog.OPEN:
                this.openFile();
                break;
                
            default:
                return;
        }
    }//GEN-LAST:event_gotoSavePageActionPerformed

    /**
     * Evento para cerrar la ventana.
     * @param evt 
     */
    private void exitFromAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFromAppActionPerformed
        askToSave();
        closeWindow();
    }//GEN-LAST:event_exitFromAppActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcDarkIJTheme.setup(); // Look & Feel
        UIManager.put("Button.arc", 10);
        UIManager.put( "TextComponent.arc", 30 );

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitFromApp;
    private javax.swing.JButton gotoAddPage;
    private javax.swing.JButton gotoDeletePage;
    private javax.swing.JButton gotoListPage;
    private javax.swing.JButton gotoSavePage;
    private javax.swing.JButton gotoSearchPage;
    private javax.swing.JButton gotoSetings;
    private javax.swing.JButton gotoWelcomePage;
    private javax.swing.JPanel mainBackground;
    private javax.swing.JPanel windowSideMenu;
    // End of variables declaration//GEN-END:variables
}
