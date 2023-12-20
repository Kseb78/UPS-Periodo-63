
package ec.edu.ups.practica04_interfazgrafica;

import java.awt.Frame;

public class MiVentana extends Frame{
    public MiVentana(String titulo, int ancho, int alto){
        this.setTitle(titulo);
        this.setSize(ancho, alto);
        this.setVisible(true);
    }
}
