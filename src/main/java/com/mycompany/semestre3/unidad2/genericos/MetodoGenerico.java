package com.mycompany.semestre3.unidad2.genericos;

public class MetodoGenerico {
    public static <E> void imprimir(E arreglo[]) {
        for(E data : arreglo)
            System.out.printf("%s ", data);
    }
    
    public static void main(String[] args) {
        String[] nombres = {"Nico", "Adrian", "Brandom", "Diego", "Barboza", "BigGay", "Cati", "Luis", "Angel"};
        Float[] estaturas = {1.70f, 1.82f, 1.72f, 1.79f, 1.76f, 0f, 1.65f, 1.72f, 1.72f};
        Integer[] edades = {18, 19, 19, 19, 20, 18, 19, 19, 19};
        
        System.out.printf("Nombre: ");
        imprimir(nombres);
        System.out.printf("\nEdades: ");
        imprimir(edades);
        System.out.printf("\nEstaturas");
        imprimir(estaturas);
        
    }
}
