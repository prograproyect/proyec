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

public class EventosDeportivos extends Eventos{
    protected static final int CANTMAX=20000;
    String Equipos[]=new String[2];
    Deportes tipo;
    
    
    public EventosDeportivos(int codigo, String titulo, String descripcion, Date fecha, double monto) {
        super(codigo, titulo, descripcion, fecha, monto);
    }
    
    public Deportes InitEnum(int indexDeporte){
       
        switch(indexDeporte){
            case 0:  
                return tipo=Deportes.FUTBOL;
            case 1:  
                return tipo = Deportes.TENIS;
            case 2: 
                return tipo =Deportes.RUGBY;
            case 3: 
                return tipo=Deportes.BASEBALL;
            default:
                return tipo=Deportes.NULL;
        }
            
    }
    @Override
    public String toString(){
        return "Evento Deportivo de tipo: "+tipo +"\n"+super.toString();
    }
    
}
