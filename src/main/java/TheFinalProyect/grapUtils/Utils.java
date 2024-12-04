/**
 * LICENSE: GNU General Public License v3.0
 * For more information, visit: https://www.gnu.org/licenses/gpl-3.0.html
 * 
 * Author: D
 * Version: Beta 1.0
 * 
 * Description:
 * Este paquete contiene utilidades en desarrollo para mejorar la experiencia gráfica 
 * en aplicaciones Java con Swing. Actualmente, algunas características pueden estar 
 * incompletas, mal implementadas o presentar errores. Se recomienda usarlo con precaución 
 * y reportar cualquier problema o sugerencia en el repositorio oficial de GitHub.
 * 
 * GitHub: https://github.com/diegojes22
 * 
 * Nota:
 * Este código es de uso libre bajo la licencia GNU-GPL3. Si encuentras útil este trabajo 
 * o deseas colaborar, no dudes en contribuir al proyecto. Cada comentario, reporte o mejora 
 * es bienvenido.
 * 
 * ATTE: D
 */
package com.d.thefinalproyect.grapUtils;

/**
 * Esta clase contiene algunas funciones y utilidades para el
 * manejo y construccion de interfaces graficas.
 */
public class Utils {
    /**
     * Reemplaza el contenido de un panel padre con un nuevo panel.
     * <p>
     * Este método ajusta el tamaño y la posición del nuevo panel para que coincida 
     * completamente con las dimensiones del panel padre. Luego, remueve todos los 
     * componentes existentes en el panel padre y agrega el nuevo panel.
     * </p>
     *
     * @param parent el panel contenedor que será reemplazado
     * @param newPanel el nuevo panel que se añadirá al contenedor
     * @throws NullPointerException si alguno de los parámetros es {@code null}
     */
    public static void addPanel(javax.swing.JPanel parent, javax.swing.JPanel newPanel) {
        newPanel.setSize(parent.getWidth(), parent.getHeight());
        newPanel.setLocation(0, 0);
        
        parent.removeAll();
        parent.add(newPanel, java.awt.BorderLayout.CENTER);
        parent.revalidate();
        parent.repaint();
    }
}
