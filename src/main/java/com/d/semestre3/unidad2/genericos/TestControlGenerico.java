package com.d.semestre3.unidad2.genericos;

public class TestControlGenerico {
    public static void main(String[] args) {
        // Variables
        Persona[] personas = {
            new Persona("Reyes", 19, 182),
            new Persona("Nico", 18, 170),
            new Persona("Miguel", 18, 160),
            new Persona("Tania", 18, 162),
            new Persona("Juan Carlos", 24, 167),
            new Persona("Pedrito", 35, 120),
        };
        String[] nombres = {"Nico", "Adrian", "Brandom", "Diego", "Barboza", "BigGay", "Cati", "Luis", "Angel", "Miguel"};
        
        Control <Integer>controlInteger = new Control<Integer>();
        Control <Persona>controlPersona = new Control<Persona>();
        Control <String>controlNombres = new Control<String>();
        
        // uso del control de enteros
        controlInteger.agregar(100);
        controlInteger.agregar(500);
        
        System.out.println(controlInteger.listar());
        
        // uso del control de nombres
        for(String n : nombres)
            controlNombres.agregar(n);
        
        System.out.println(controlNombres.listar());
        
        // uso del control de personas
        for(Persona p : personas)
            controlPersona.agregar(p);
        
        System.out.println(controlPersona.listar());
    }
}
