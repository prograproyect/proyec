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
public class Eventos {

    protected int codigo;
    protected String titulo;
    protected String descripcion;
    protected Date fecha;
    protected double monto;

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public Eventos(int codigo, String titulo, String descripcion, Date fecha, double monto) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.monto = monto;
    }
    
    @Override
    public String toString() {
        return "Codigo: "+codigo+" Titulo: "+titulo+"\nDescripcion: \n"+descripcion+"\nfecha: "+fecha+"Monto: "+monto;
    }
    
    public boolean EventoRealizado(){
        Date fechaActual=new Date();
            if(fecha.getTime()<fechaActual.getTime())
                return false;
            return true;
    }
    
    
    
}

