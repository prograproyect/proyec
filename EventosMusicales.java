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
    private tipoMusica tp;
    
    public EventosMusicales(int codigo, String titulo, String descripcion, Date fecha, double monto) {
        super(codigo, titulo, descripcion, fecha, monto);
    }
    public tipoMusica InitEnum(int indexMusica){
        
        switch(indexMusica){
            case 1:  
                return tp=tipoMusica.POP;
            case 2:  
                return tp=tipoMusica.ROCK;
            case 3: 
                return tp=tipoMusica.RAP;
            case 4: 
                return tp=tipoMusica.CLASICA;
            case 5: 
                return tp=tipoMusica.REGGEATON;
                    
            default:
                return tp=tipoMusica.OTRO;
        }
    }
    
    public double Seguro(double monto){
        seguro=monto*30/100;
        return seguro;
    }
    @Override
     public String toString(){
        return "Evento Musical de tipo: "+tp+"\n"+super.toString();
    }
    
}
