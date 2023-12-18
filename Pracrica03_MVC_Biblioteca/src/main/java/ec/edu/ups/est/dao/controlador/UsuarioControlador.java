
package ec.edu.ups.est.dao.controlador;

import ec.edu.ups.est.dao.idao.ILibroDAO;
import ec.edu.ups.est.dao.idao.IPrestamoDAO;
import ec.edu.ups.est.dao.idao.IUsuarioDAO;
import ec.edu.ups.est.dao.modelo.Libro;
import ec.edu.ups.est.dao.modelo.Prestamo;
import ec.edu.ups.est.dao.modelo.Usuario;
import ec.edu.ups.est.dao.vista.LibroVista;
import ec.edu.ups.est.dao.vista.PrestamoVista;
import ec.edu.ups.est.dao.vista.UsuarioVista;
import java.util.Date;
import java.util.List;

public class UsuarioControlador {
    private IUsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Usuario usuario;
    
    private IPrestamoDAO prestamoDAO;
    private PrestamoVista prestamoVista;
    private Prestamo prestamo;

    private ILibroDAO libroDAO;
    private LibroVista libroVista;
    private Libro libro;
    
    public UsuarioControlador(IUsuarioDAO usuarioDAO, UsuarioVista usuarioVista, IPrestamoDAO prestamoDAO, PrestamoVista prestamoVista,ILibroDAO libroDAO, LibroVista libroVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
        this.prestamoDAO = prestamoDAO;
        this.prestamoVista = prestamoVista;
        this.libroDAO = libroDAO;
        this.libroVista = libroVista;        
    }
    
    public void crearUsuario(){
        usuario = usuarioVista.ingresarDatosUsuario();
        usuarioDAO.crearUsuario(usuario);
    }
    public void actualizarUsuario()
    {
        usuario = usuarioVista.actualizarDatosUsuario();
        usuarioDAO.actualizarUsuario(usuario.getIdentificacion(), usuario);
        if (usuarioDAO.actualizarUsuario(usuario.getIdentificacion(), usuario)==true)
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
        String identificacion = usuarioVista.buscarDatosUsuario();
        usuario = usuarioDAO.obtenerUsuario(identificacion);
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
    public void agregarPrestamo()
    {
        String identificacion = usuarioVista.buscarDatosUsuario();
        usuario = usuarioDAO.obtenerUsuario(identificacion);
        if (usuario==null)
        {
            prestamoVista.mostrarAlertas("Usuario no encontrado");
        }else
        {   
            String titulo = libroVista.buscarDatosLibro();
            libro = libroDAO.obtenerLibro(titulo);
            if (libro==null)
            {
                prestamoVista.mostrarAlertas("Libro no encontrado");
            }else
            {
                prestamo = prestamoVista.ingresarDatosPrestamo();
                prestamo.setLibro(libro);
                prestamoDAO.crearPrestamo(prestamo);
                libro.setDisponible(false);
                usuario.agregarPrestamo(prestamo);
                libro.prestar();
            }
        }
    }
    public void devolverPrestamo()
    {
        Date fechaPrestamo = prestamoVista.buscarDatosPrestamo();
        prestamo = prestamoDAO.obtenerPrestamosPorFechaPrestamo(fechaPrestamo);
        if(prestamo==null)
        {
            prestamoVista.mostrarAlertas("Prestamo no encontrado");
        }
        else
        {
           libro.setDisponible(true);
           prestamoDAO.eliminarPrestamo(fechaPrestamo);
           usuario.devolverLibro(prestamo);
           int diaPrestamo = prestamo.getFechaPrestamo().getDate();
           prestamo.esPrestamoVigente(diaPrestamo);
           libro.devolver();
        }
    }
    
    
}
