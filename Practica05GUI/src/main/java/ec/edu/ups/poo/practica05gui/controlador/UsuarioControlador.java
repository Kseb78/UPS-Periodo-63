package ec.edu.ups.poo.practica05gui.controlador;

import ec.edu.ups.poo.practica05gui.idao.ILibroDAO;
import ec.edu.ups.poo.practica05gui.idao.IPrestamoDAO;
import ec.edu.ups.poo.practica05gui.idao.IUsuarioDAO;
import ec.edu.ups.poo.practica05gui.modelo.Libro;
import ec.edu.ups.poo.practica05gui.modelo.Prestamo;
import ec.edu.ups.poo.practica05gui.modelo.Usuario;
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
    
    public void crearUsuario(String correo,String nombre,String identificacion){
        usuario = new Usuario(correo, nombre, identificacion);
        usuarioDAO.crearUsuario(usuario);
    }
    public void actualizarUsuario(String correo,String nombre,String identificacion)
    {
        usuario = usuarioDAO.obtenerUsuario(identificacion);
        usuario.setNombre(nombre);
        usuario.setCorreo(correo);
    }
    public void eliminarUsuario(String identificaion){
        usuario = usuarioDAO.obtenerUsuario(identificaion);
        usuarioDAO.eliminarUsuario(usuario.getIdentificacion());
    }
    
    public List<Usuario> list() {
        return usuarioDAO.obtenerUsuarios();
    }
    
    
    public Usuario buscarUsuario(String identificaion){
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
