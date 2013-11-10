/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoProga.proyec;

import java.util.ArrayList;

/**
 *
 * @author 007
 */
public class Usuarios {
    protected String nombre;
    protected String usuario;
    protected String password;
    protected int edad;
    protected boolean log=false;
    protected ArrayList<Eventos> eventos;

    public Usuarios(String nombre, String usuario, String password, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.edad = edad;
    }

   

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isLog() {
        return log;
    }
    
    public void login(){
        log = true;
    }
    public void logout(){
        log = false;
    }

    @Override
    public String toString(){
        return "Nombre: "+this.nombre+", Username: "+this.usuario+", Edad:"+this.edad;
      
    }
    
    public void listarEventosCreados(){
        for( Eventos x: eventos)
            System.out.println(x);
    }
    
    
}
