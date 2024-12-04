package com.d.thefinalproyect.more;

import java.io.Serializable;
import java.util.Comparator;

public class CompareByPages implements Comparator<Libro>, Serializable{

    @Override
    public int compare(Libro t, Libro t1) {
        return t1.getNumeroPaginas() - t.getNumeroPaginas();
    }
    
}
