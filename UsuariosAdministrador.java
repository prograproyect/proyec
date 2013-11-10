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
public class UsuariosAdministrador extends Usuarios{
    //Atributos
    public static final String user = "admin";
    public static final String pass = "supersecreto";

    public UsuariosAdministrador(String nombre, String usuario, String password, int edad) {
        super(nombre, usuario, password, edad);
        super.eventos = new ArrayList<>();
    }
}

   
