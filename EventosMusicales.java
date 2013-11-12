/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoProga.proyec;

/**
 *
 * @author 007
 */
import java.util.Date;

/**
 *
 * @author 007
 */ 
public class EventosMusicales extends Eventos{
    protected static final int CANTMAX=25000;
    protected double seguro = 0;
    
    public EventosMusicales(int codigo, String titulo, String descripcion, Date fecha, double monto) {
        super(codigo, titulo, descripcion, fecha, monto);
    }
    public tipoMusica InitEnum(int indexMusica){
        
        switch(indexMusica){
            case 0:  
                return tipoMusica.POP;
            case 1:  
                return tipoMusica.ROCK;
            case 2: 
                return tipoMusica.RAP;
            case 3: 
                return tipoMusica.CLASICA;
            default:
                return tipoMusica.OTRO;
        }
    }
    
    public double Seguro(double monto){
        seguro=monto*30/100;
        return seguro;
    }
    
    
}
