package com.mycompany.semestre3.unidad3.adminPack.utils;

public class DialogWinRequest {
    /* Atributos */
    private int request = 0;
    
    /* Metodos */
    /**
     * Constructor
     * 
     * Clase para comunicar ventanas de dialogo personalizadas con 
     * otras ventanas principales. Los codigo de comunicacion, por
     * lo general son los siguientes:
     * 
     * ------------- <Question> ---------------------
     * 1: Se preciono "Aceptar" u "OK"
     * 0: Se presiono "cancelar"
     * -1: Se cerro la ventana de dialogo o se oculto.
     */
    public DialogWinRequest() {
        // Do nothing!
    }
    
    /**
     * Si se preciono Aceptar u OK establecemos la respuesta
     * en 1.
     */
    public void acceptIsPressed() {
        request = 1;
    }
    
    /**
     * Si se preciono Cancelar establecemos la respuesta en
     * 0
     */
    public void cancelIsPressed() {
        request = 0;
    }
    
    /**
     * Si la ventana se escondio o se cerro establecemos la
     * respuesta en -1.
     */
    public void windowClosedOrHiden() {
        request = -1;
    }
    
    /**
     * Establecemos la respuesta de acuerdo al boton clickeado.
     * Puede ser de acuerdo al formato establecido o a uno propio.
     * @param r 
     */
    public void updateRequest(int r) {
        request = r;
    }
    
    /**
     * Obtenemos la respuesta del usuario para procesarla y poder
     * actuar de acuerdo a dicha respuesta.
     * 
     * @return 
     */
    public int getRequest() {
        return request;
    }

    @Override
    public String toString() {
        return "DialogWinRequest{" + "request=" + request + '}';
    }
    
    
}
