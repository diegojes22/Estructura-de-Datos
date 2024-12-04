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
 * Este en particular ya esta mejor :)
 * Aunque puedo agregarle mas
 * 
 * ATTE: D
 */

package com.d.thefinalproyect.grapUtils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Clase de diálogos básicos para interactuar con el usuario mediante mensajes emergentes.
 * <p>
 * Proporciona métodos simples para mostrar alertas, errores, información y preguntas de confirmación,
 * con la ayuda de la clase {@code JOptionPane}.
 * </p>
 */
public class BasicDialogs {
    ///
    /// Constantes
    ///
    /* Cuando el usuario da click en "Si", "Aceptar", u "OK" */
    public static final int YES    = 0;
    /** Alias de {@link #YES} para "Ok" (porque nunca está de más tener dos nombres para lo mismo). */
    public static final int OK     = 0;
    /* Cuando el usuario da click en "No" */
    public static final int NO     = 1;
    /* Cuando el usuario da click en "Cancelar" */
    public static final int CANCEL = 2;
    /* Cuando el usuario cierra la ventana de dialogo*/
    public static final int CLOSED =-1;
    
    ///
    /// Metodos
    ///
    /**
     * Muestra un cuadro de diálogo de confirmación para que el usuario decida entre "Sí" o "No".
     *
     * <b>Ejemplo:</b>
     * <pre>
     * int respuesta = BasicDialogs.question(null, "¿Desea salir de la aplicación?", "Confirmación");
     * if (respuesta == BasicDialogs.YES) {
     *     System.exit(0);
     * }
     * </pre>
     *
     * @param parent el componente padre (puede ser {@code null}).
     * @param message el mensaje que se mostrará al usuario.
     * @param title el título del cuadro de diálogo.
     * @return {@link #YES}, {@link #NO} o {@link #CLOSED} dependiendo de la acción del usuario.
     */
    public static int question(Component parent, String message, String title) {
        return JOptionPane.showConfirmDialog(parent, message, title, JOptionPane.YES_NO_OPTION);
    }
    
    /**
     * Muestra un cuadro de diálogo de error. Ideal para reportar problemas serios.
     *
     * <b>Ejemplo:</b>
     * <pre>
     * try {
     *     // Algo que podría fallar
     * } catch (Exception e) {
     *     BasicDialogs.error(null, "Ocurrió un error inesperado: " + e.getMessage(), "Error");
     * }
     * </pre>
     *
     * @param parent el componente padre (puede ser {@code null}).
     * @param message el mensaje de error.
     * @param title el título del cuadro de diálogo.
     */
    public static void error(Component parent, String message, String title) {
        JOptionPane.showMessageDialog(parent, message, title, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Muestra una advertencia al usuario. Perfecto para cosas que no están mal, pero podrían estar mejor.
     *
     * <b>Ejemplo:</b>
     * <code><pre>
     * BasicDialogs.warning(null, "No has llenado todos los campos requeridos.", "Advertencia");
     * </pre></code>
     *
     * @param parent el componente padre (puede ser {@code null}).
     * @param message el mensaje de advertencia.
     * @param title el título del cuadro de diálogo.
     */
    public static void warning(Component parent, String message, String title) {
        JOptionPane.showMessageDialog(parent, message, title, JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Muestra información al usuario. Genial para celebrar éxitos o transmitir datos importantes.
     *
     * <b>Ejemplo:</b>
     * <code><pre>
     * BasicDialogs.info(null, "¡Operación completada exitosamente!", "Información");
     * </pre></code>
     *
     * @param parent el componente padre (puede ser {@code null}).
     * @param message el mensaje informativo.
     * @param title el título del cuadro de diálogo.
     */
    public static void info(Component parent, String message, String title) {
        JOptionPane.showMessageDialog(parent, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Muestra un cuadro de diálogo simple sin iconos ni florituras.
     * A veces, menos es más.
     *
     * <b>Ejemplo:</b>
     * <pre>
     * BasicDialogs.dialog(null, "Este es un mensaje simple.", "Sin adornos");
     * </pre>
     *
     * @param parent el componente padre (puede ser {@code null}).
     * @param message el mensaje a mostrar.
     * @param title el título del cuadro de diálogo (puede ser una cadena vacía).
     */
    public static void dialog(Component parent, String message, String title) {
        JOptionPane.showMessageDialog(parent, message, title, JOptionPane.PLAIN_MESSAGE);
    }
    
}