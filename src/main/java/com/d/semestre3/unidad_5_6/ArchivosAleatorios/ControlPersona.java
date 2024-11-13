package com.d.semestre3.unidad_5_6.ArchivosAleatorios;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ControlPersona {
    private RandomAccessFile fes; // como la FES de la MARINA :O
    private int nregs;
    private int tamañoReg = 140; // tamaño del registro en bytes como maximo
    
    public ControlPersona(File fichero) throws IOException {
        if(fichero.exists() && !fichero.isFile()) {
            throw new IOException(fichero.getName() + " no es un archivo!");
        }
        
        fes = new RandomAccessFile(fichero, "rw");
        nregs = (int)Math.ceil((double)fes.length() / (double)tamañoReg);
    }
    
    public void cerrar() throws IOException {
        fes.close();
    }
    
    public boolean ponerValorEn(int i, CPersona obj) throws IOException {
        if(i >= 0 && i <= nregs) {
            if(obj.size() + 4 > tamañoReg) {
                System.err.println("Tamaño del regidtro excedido!");
            }
            else {
                System.out.println("Ok...");
                fes.seek(i * tamañoReg);
                
                fes.writeUTF(obj.getNombre());
                fes.writeUTF(obj.getDireccion());
                fes.writeLong(obj.getTelefono());
                
                return true;
            }
        }
        else 
            System.err.println("Numero de registro fuera del limites");
        
        return false;
    }
    
    public void agregar(CPersona obj) throws IOException {
        if(ponerValorEn(nregs, obj))
            nregs++;
    }
    
    public CPersona valorEn(int i) throws IOException {
        if(i >= 0 && i < nregs) {
            String nombre;
            String direccion;
            long telefono;
            
            fes.seek(tamañoReg * i); // situamos el puntero de lectura/escritura
            
            nombre = fes.readUTF();
            direccion = fes.readUTF();
            telefono = fes.readLong();
            
            return new CPersona(nombre, direccion, telefono);
        }
        else {
            System.err.println("Numero de registro fuera del limite");
        }
        
        return null;
    }
    
    public boolean eliminar(long telefono) throws IOException {
        CPersona obj;
        
        for(int i = 0; i < nregs; i++) {
            obj = valorEn(i);
            
            if(obj.getTelefono() == telefono ) {
                obj.setTelefono(0);
                ponerValorEn(i, obj);
                
                return true;
            }
        }
        
        return false;
    }
}
