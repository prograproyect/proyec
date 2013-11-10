/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoProga.proyec;

/**
 *
 * @author 007
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author 007
 */
public class JavaTicket {
    static Scanner lea=new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList <Eventos> eventos=new ArrayList<Eventos>();
        ArrayList<Usuarios> users=new ArrayList<Usuarios>();
        users.add(new UsuariosAdministrador("admininistrador", "admin", "supersecreto", 20));
       //boolean conectado= false;
       
       Usuarios usuarioConectado=null;
        do{
        System.out.println("-------------------");
        System.out.print("SISTEMA DE LOGIN\n\nIngrese su Usuario: ");
        String user=lea.next();
        
        System.out.print("Ingrese su password: ");
        String password=lea.next();
        
        
        for(Usuarios u : users){
            
            if(user.equals(u.getUsuario()) && password.equals(u.getPassword())){
                
                usuarioConectado = u;
                System.out.println("Bienvenido "+u.getUsuario());
            }else{
                System.out.println("Usuario y/o contrasena invalido");
            }
        }
       if(usuarioConectado  == null)
           continue;
       do{ 
        System.out.println("MENU\n1.Administracion de Eventos\n2.Administracion de Usuarios\n3.Reportes\n4.Cerrar Sesion\nIngrese su numero favorito: ");
        
        switch(lea.nextInt()){
            case 1: System.out.println("1.Crear Evento\n2.Eliminar Evento\n3.Editar evento\n4.Ver evento\n5.Regresar al menu prinicpal\nIngrese su numero favorito: ");
                    switch(lea.nextInt()){
                        case 1:
                            eventos.add(crearEvento());
                            break;
                        case 2:
                            System.out.println("Codigo: ");
                            int cod=lea.nextInt();
                            for(Eventos e:eventos){
                                
                                if(e.getCodigo()==cod)
                                eventos.remove(e);
                            System.out.println("evento Eliminado");
                            break;
                           }
                    break;
                    }
            break;
            case 2: if(usuarioConectado instanceof UsuariosAdministrador){
                
            }
                break;
            case 3: System.out.println("Menu 1,2,3,4,5,6");
                    for(Eventos e: eventos){
                System.out.println("-----------------------\n"+e+"\n---------------------------");
            }
                break;
            case 4: usuarioConectado=null;
        }
       }while(usuarioConectado!=null);
       }while(true); 
    }

    private static Eventos crearEvento() {
         System.out.println("Escoger evento\n1.Deportivo\n2.Musical\n3.Religioso\nOpcion: ");
         int tipo=lea.nextInt(); 
            System.out.println("Codigo: ");
            int codigo=lea.nextInt();
            
            System.out.println("Titulo: ");
            String titulo=lea.next();
            
            System.out.println("Descripcion: "); 
            String descripcion=lea.next();
            System.out.println("Monto: ");
            int monto=lea.nextInt();
            System.out.println("Anio: "); 
            int anio=lea.nextInt();
            System.out.println("Mes: "); 
            int mes=lea.nextInt();
            System.out.println("Dia: "); 
            int dia=lea.nextInt();
            
            Calendar c=Calendar.getInstance();
            c.set(anio, mes, dia);
         switch(tipo){
             case 1: return new EventosDeportivos(codigo, titulo, descripcion,c.getTime(), monto);
             case 2: return new EventosMusicales(codigo, titulo, descripcion,c.getTime(), monto);
             case 3: return new EventosReligiosos(codigo, titulo, descripcion,c.getTime(), monto);
             default: return null;
            }
    }
}
