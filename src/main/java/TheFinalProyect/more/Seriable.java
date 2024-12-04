package com.d.thefinalproyect.more;

import java.io.*;
import java.util.TreeSet;

public class Seriable {
    /**
     * Nos permite guaradar nuestra estuctura con todos sus datos
     * y atributos en un archivo.
     * 
     * @param <E>
     * @param control
     * @param path 
     */
    public static <E> void write(TreeSet<E> tree, String path) throws FileNotFoundException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(tree);
    }
    
    /**
     * Nos permite recuperar determinada estructura de su archivo
     * para poder trabajarla.
     * 
     * @param <E>
     * @param nombreArchivo
     * @return 
     */
    public static <E> TreeSet<E> read(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            TreeSet<E> control = (TreeSet<E>) ois.readObject();
            System.out.println("Objeto leído exitosamente desde " + nombreArchivo);
            
            return control;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getClass() + ": " + e.getCause());
        } 
        
        return null;
    }
}
