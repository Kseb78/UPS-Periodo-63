package ec.edu.ups.poo.practica05gui.controlador;

import ec.edu.ups.poo.practica05gui.idao.ILibroDAO;
import ec.edu.ups.poo.practica05gui.idao.IPrestamoDAO;
import ec.edu.ups.poo.practica05gui.idao.IUsuarioDAO;
import ec.edu.ups.poo.practica05gui.modelo.Libro;
import ec.edu.ups.poo.practica05gui.modelo.Prestamo;
import ec.edu.ups.poo.practica05gui.modelo.Usuario;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UsuarioControlador {
     private IUsuarioDAO usuarioDAO;
    private Usuario usuario;
    
    private IPrestamoDAO prestamoDAO;
    private Prestamo prestamo;

    private ILibroDAO libroDAO;
    private Libro libro;
    
    public UsuarioControlador(IUsuarioDAO usuarioDAO) {//, IPrestamoDAO prestamoDAO, ILibroDAO libroDAO
        this.usuarioDAO = usuarioDAO;       
        /*this.prestamoDAO = prestamoDAO;        
        this.libroDAO = libroDAO;   */
    }
    
    public boolean crearUsuario(String correo,String nombre,int identificacion){
        if(usuarioDAO.crearUsuario(usuario))
        {
            try {
            FileWriter fw = new FileWriter("DATOS\\Usuarios.txt",true);
            fw.write(correo);
            fw.write("-");
            fw.write(nombre);
            fw.write("-");
            fw.write(String.valueOf(identificacion)); 
            fw.write("\n");
            fw.close();
            return true;
            } catch (IOException e) {
                return false;
            }
        }
        return false;

    }
    public Usuario actualizarUsuario(int identificacion,Usuario usuario)
    {
        if(usuarioDAO.actualizarUsuario(identificacion, usuario)==true)
        {
            return usuario;
        }
        return null;
    }
    public void eliminarUsuario(int identificaion){
        usuario = usuarioDAO.obtenerUsuario(identificaion);
        usuarioDAO.eliminarUsuario(usuario.getIdentificacion());
    }
    
    public List<Usuario> list() {
        return usuarioDAO.obtenerUsuarios();
    }
    
    
    public Usuario buscarUsuario(int identificaion){
        usuario = usuarioDAO.obtenerUsuario(identificaion);
        return usuario;
    }
    /*public void listarUsuarios(){
        List<Usuario> listaUsuarios = usuarioDAO.obtenerUsuarios();
        for (Usuario usuario : listaUsuarios) {
            usuarioVista.mostrarInformacionUsuario(usuario);
        }
    }*/
}
