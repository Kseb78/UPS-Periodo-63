
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

public class PrestamoControlador {
    private IPrestamoDAO prestamoDAO;
    private PrestamoVista prestamoVista;
    private Prestamo prestamo;
    
    private IUsuarioDAO usuarioDao;
    private UsuarioVista usuarioVista;
    private Usuario usuario;
    
    private ILibroDAO libroDAO;
    private LibroVista libroVista;
    private Libro libro;

    public PrestamoControlador(IPrestamoDAO prestamoDAO, PrestamoVista prestamoVista, IUsuarioDAO usuarioDao, UsuarioVista usuarioVista, ILibroDAO libroDAO, LibroVista libroVista) {
        this.prestamoDAO = prestamoDAO;
        this.prestamoVista = prestamoVista;
        this.usuarioDao = usuarioDao;
        this.usuarioVista = usuarioVista;
        this.libroDAO = libroDAO;
        this.libroVista = libroVista;
    }
    
    public void crearPrestamo(){
        prestamo = prestamoVista.ingresarDatosPrestamo();
        prestamoDAO.crearPrestamo(prestamo);
    }
    public void actualizarPrestamo()
    {
        prestamo = prestamoVista.actualizarDatosPrestamo();
        prestamoDAO.actualizarPrestamo(prestamo.getFechaPrestamo(), prestamo);
        if (prestamoDAO.actualizarPrestamo(prestamo.getFechaPrestamo(), prestamo)==true)
        {
            prestamoVista.mostrarAlertas("prestamo actualizado");
        }else
        {
            prestamoVista.mostrarAlertas("prestamo no actualizado");
        }
    }
     public void eliminarPrestamo()
    {
        Date fechaPrestamo = prestamoVista.eliminarDatosPrestamo();
        if(prestamoDAO.eliminarPrestamo(fechaPrestamo)==true)
        {
            prestamoVista.mostrarAlertas("El prestamo se ha eliminado");
        }else
        {
            prestamoVista.mostrarAlertas("El prestamo se ha eliminado");    
        }
    }
    
    public void obtenerPrestamosPorFechaPrestamo()
    {
        Date fechaPrestamo = prestamoVista.buscarDatosPrestamo();
        prestamo = prestamoDAO.obtenerPrestamosPorFechaPrestamo(fechaPrestamo);
        if(prestamo==null)
        {
            prestamoVista.mostrarAlertas("Prestamo no encontrado");
        }
        else
        {
            prestamoVista.mostrarInformacionPrestamo(prestamo);
        }
    }
        
    public void listarPrestamos(){
        List<Prestamo> listaPrestamos = prestamoDAO.obtenerPrestamos();
        for (Prestamo prestamo : listaPrestamos) {
            prestamoVista.mostrarInformacionPrestamo(prestamo);
        }
    }       
    
    
    
}
