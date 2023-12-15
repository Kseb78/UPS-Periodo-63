
package ec.edu.ups.est.dao.controlador;

import ec.edu.ups.est.dao.idao.IPrestamoDAO;
import ec.edu.ups.est.dao.idao.IUsuarioDAO;
import ec.edu.ups.est.dao.modelo.Prestamo;
import ec.edu.ups.est.dao.modelo.Usuario;
import ec.edu.ups.est.dao.vista.PrestamoVista;
import ec.edu.ups.est.dao.vista.UsuarioVista;
import java.util.List;

public class UsuarioControlador {
    private IUsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Usuario usuario;
    
    private IPrestamoDAO prestamoDAO;
    private PrestamoVista prestamoVista;
    private Prestamo prestamo;

    public UsuarioControlador(IUsuarioDAO usuarioDAO, UsuarioVista usuarioVista, IPrestamoDAO prestamoDAO, PrestamoVista prestamoVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
        this.prestamoDAO = prestamoDAO;
        this.prestamoVista = prestamoVista;
    }
    
    public void crearUsuario(){
        usuario = usuarioVista.ingresarDatosUsuario();
        usuarioDAO.crearUsuario(usuario);
    }
    public void actualizarUsuario()
    {
        usuario = usuarioVista.actualizarDatosUsuario();
        usuarioDAO.actualizarUsuario(usuario.getNombre(), usuario);
        if (usuarioDAO.actualizarUsuario(usuario.getNombre(), usuario)==true)
        {
            usuarioVista.mostrarAlertas("usuario actualizado");
        }else
        {
            usuarioVista.mostrarAlertas("usuario no actualizado");
        }
    }
    public void eliminarUsuario(){
        String nombre = usuarioVista.eliminarDatosUsuario();
        if(usuarioDAO.eliminarUsuario(nombre)==true){
            usuarioVista.mostrarAlertas("uuario eliminado");
        }
        else{
            usuarioVista.mostrarAlertas("usuario no eliminado");
        }
    
    }
    public void buscarUsuarioPorNombre(){
        String nombre = usuarioVista.buscarDatosUsuario();
        usuario = usuarioDAO.obtenerUsuario(nombre);
        if(usuario == null){
            usuarioVista.mostrarAlertas("usuario no encontrada");
        }else{
            usuarioVista.mostrarInformacionUsuario(usuario);
        }
    }
    public void listarUsuarios(){
        List<Usuario> listaUsuarios = usuarioDAO.obtenerUsuarios();
        for (Usuario usuario : listaUsuarios) {
            usuarioVista.mostrarInformacionUsuario(usuario);
        }
    }
    
}
