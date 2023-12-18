
package ec.edu.ups.est.dao.vista;

import ec.edu.ups.est.dao.modelo.Usuario;
import java.util.Scanner;

public class UsuarioVista {
    private Scanner entrada;
    
    public UsuarioVista(){
        entrada = new Scanner(System.in);
    }
    public Usuario ingresarDatosUsuario(){
        System.out.println("ingrese un nuevo usario");
        System.out.println("ingrese el nombre del usuario");
        String nombre = entrada.next();
        System.out.println("ingrese el correo del usuario");
        String correo = entrada.next();
        System.out.println("ingrese la identificaion del usuario");
        String identificaion = entrada.next();
        return new Usuario(correo,nombre,identificaion); 
    }
    public Usuario actualizarDatosUsuario(){
        System.out.println("actualice usuario");
        System.out.println("ingrese la identificaion del usuario a actualizar");
        String identificaion = entrada.next();
        System.out.println("ingrese el nombre del usuario");
        String nombre = entrada.next();
        System.out.println("ingrese el correo del usuario");
        String correo = entrada.next();
        return new Usuario(correo,nombre,identificaion); 
    }
    public String eliminarDatosUsuario(){
        System.out.println("eliminar usuario");
        System.out.println("ingrese la identificaion del usuario");
        String identificacion = entrada.next();
        return identificacion;
    }
    public String buscarDatosUsuario(){
        System.out.println("------Buscar Usuario------");
        System.out.println("Ingresa la identificacion del usuario a buscar");
        String identificacion = entrada.next();
        return identificacion;
    } 
    public int agregarPrestamoAUsuario(){
        System.out.println("------Agregar prestamo a usuario------");
        System.out.println("Ingresa número de prestamos a agregar");
        int num = entrada.nextInt();
        return num;
    }   
    public void mostrarInformacionUsuario(Usuario usuario){
        System.out.println(usuario.toString());
    }
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
}
