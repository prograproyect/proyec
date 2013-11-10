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
public class UsuarioDeContenidos extends Usuarios{

    public UsuarioDeContenidos(String nombre, String usuario, String password, int edad) {
        super(nombre, usuario, password, edad);
        super.eventos = new ArrayList<>();
    }
    //atributos

    
    
}
