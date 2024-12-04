package com.d.thefinalproyect.more;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

public class Others {
    /**
     * Obtener los objetos de un arbol para guardarlos en
     * una tabla que sera mostrada
     * @param tree
     * @return 
     */
    public static DefaultTableModel treeToTable(TreeSet<Libro> tree) {
        DefaultTableModel dtm = new DefaultTableModel();
        
        for(String col : Libro.getAtributtesNames()) {
            dtm.addColumn(col);
        }
        
        Iterator t = tree.iterator();
        while(t.hasNext()) {
            Libro libro = (Libro)t.next();
            dtm.addRow(libro.getAsStrArray());
        }
        
        return dtm;
    }
    
    /**
     * Mostramos los atributos de un objeto en una tabla
     * para ser mostrados, util para hacer busquedas.
     * 
     * @param libro
     * @return 
     */
    public static DefaultTableModel onlyObjectTable(Libro libro) {
        DefaultTableModel dtm = new DefaultTableModel();
        
        for(String col : Libro.getAtributtesNames()) {
            dtm.addColumn(col);
        }
        
        dtm.addRow(libro.getAsStrArray());
        
        return dtm;
    }
    
    public static TreeSet transformTree(TreeSet<Libro> tree, Comparator comparator) {
        Libro[] libros = new Libro[tree.size()];
        
        Iterator i = tree.iterator();
        int pos = 0;
        
        do {
            Libro l = (Libro)i.next();
            libros[pos] = l;
            
            pos++;
        } while(i.hasNext());
        
        tree = new TreeSet<Libro>(comparator);
        
        for(Libro libro : libros) {
            tree.add(libro);
        }
        
        return tree;
    }
}
