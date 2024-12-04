package com.d.thefinalproyect.more;

import java.io.Serializable;
import java.util.Comparator;

public class CompareByEditorial implements Comparator<Libro>, Serializable {

    @Override
    public int compare(Libro t, Libro t1) {
        return t.getEditorial().compareToIgnoreCase(t1.getEditorial());

    }
    
}
