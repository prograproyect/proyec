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

    public EventosDeportivos(int codigo, String titulo, String descripcion, Date fecha, double monto) {
        super(codigo, titulo, descripcion, fecha, monto);
    }
    
    public Deportes InitEnum(int indexDeporte){
        Deportes deport;
        switch(indexDeporte){
            case 0:  
                return deport=Deportes.FUTBOL;
            case 1:  
                return deport = Deportes.TENIS;
            case 2: 
                return deport =Deportes.RUGBY;
            case 3: 
                return deport=Deportes.TENIS;
            default:
                return deport=Deportes.NULL;
        }
            
    }
    
}
