package com.mycompany.semestre3.unidad3;

import com.mycompany.semestre3.unidad3.adminPack.Articulo;

public class TestPilaGenerica {
    public static void main(String[] args) {
        PilaGenerica<String> nombres = new PilaGenerica<String>();
        PilaGenerica<Articulo> articulos = new PilaGenerica<Articulo>(); 
        PilaGenerica<Float> estaturas = new PilaGenerica<Float>(); 
        
        // usar la pila de nombre
        nombres.push("Juan");
        nombres.push("Pedrito");
        nombres.push("Alan");
        nombres.push("Carlos");
        System.out.println("Deleted: "+nombres.pop()+"\n");
        
        System.out.println(nombres.getAll());
        
        // usar la pila de estaturas
        float[] estaturasAlumnos = {1.80f, 1.69f, 1.74f, 1.79f, 1.50f, 1.72f};
        for(Float e: estaturasAlumnos) {
            estaturas.push(e);
        }
        System.out.println("Deleted: "+estaturas.pop());
        System.out.println("Deleted: "+estaturas.pop()+"\n");
        
        System.out.println(estaturas.getAll()+"\n");
        
        // uasr la pila articulo
        Articulo[] array = {
            new Articulo("Jabon Zote", 20, 1, (short)45),
            new Articulo("Refresco", 25, 2, (short)45),
            new Articulo("Atun", 35, 3, (short)24),
            new Articulo("Maruchan", 32, 4, (short)100),
        };
        
        articulos.push(array[0]);
        articulos.push(array[1]);
        articulos.push(array[2]);
        articulos.push(array[3]);
        
        System.out.println("Deleted: "+articulos.pop());
        System.out.println(articulos.getAll());

    }
}
