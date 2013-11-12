/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoProga.proyec;

/**
 *
 * @author 007
 */
public enum Deportes {
    FUTBOL(0),TENIS(1),RUGBY(2),BASEBALL(3),NULL(4);
    private int index;

    private Deportes(int index) {
        this.index = index;
    }
    
}
