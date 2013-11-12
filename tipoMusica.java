/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoProga.proyec;

/**
 *
 * @author 007
 */
public enum tipoMusica {
    POP(0),ROCK(1),RAP(2),CLASICA(3),REGGEATON(4),OTRO(5);
    
    private  int indice;

    private tipoMusica(int indice) {
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }
    
    }
