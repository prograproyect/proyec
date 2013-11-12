/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoProga.proyec;

import java.util.Date;

/**
 *
 * @author 007
 */
public class EventosReligiosos extends Eventos{

    public EventosReligiosos(int codigo, String titulo, String descripcion, Date fecha, double monto) {
        super(codigo, titulo, descripcion, fecha, monto);
    }
    @Override
    public String toString(){
        return "Evento de tipo Religioso\n"+super.toString();
    }
    
}