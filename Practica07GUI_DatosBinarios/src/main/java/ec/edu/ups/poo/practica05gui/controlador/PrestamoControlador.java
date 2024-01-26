package ec.edu.ups.poo.practica05gui.controlador;

import ec.edu.ups.poo.practica05gui.idao.IBibliotecaDAO;
import ec.edu.ups.poo.practica05gui.idao.ILibroDAO;
import ec.edu.ups.poo.practica05gui.idao.IPrestamoDAO;
import ec.edu.ups.poo.practica05gui.idao.IUsuarioDAO;
import ec.edu.ups.poo.practica05gui.modelo.Biblioteca;
import ec.edu.ups.poo.practica05gui.modelo.Libro;
import ec.edu.ups.poo.practica05gui.modelo.Prestamo;
import ec.edu.ups.poo.practica05gui.modelo.Usuario;
import java.util.Date;
import java.util.List;

public class PrestamoControlador {
    private IPrestamoDAO prestamoDAO;
    private Prestamo prestamo;
    
    private IUsuarioDAO usuarioDAO;
    private Usuario usuario;
    
    private ILibroDAO libroDAO;
    private Libro libro;
    
    private IBibliotecaDAO bibliotecaDAO;
    private Biblioteca biblioteca;

    public PrestamoControlador(IPrestamoDAO prestamoDAO, IUsuarioDAO usuarioDAO, ILibroDAO libroDAO,IBibliotecaDAO bibliotecaDAO) {
        this.prestamoDAO = prestamoDAO;
        this.usuarioDAO = usuarioDAO;
        this.libroDAO = libroDAO;
        this.bibliotecaDAO = bibliotecaDAO;
    }    
    public void create (int codigo,Libro libro, Usuario usuario,Date fechaPrestamo, Date fechaDevolucion)
    {
        prestamo = new Prestamo(codigo,libro, usuario, fechaPrestamo, fechaDevolucion);
        prestamoDAO.crearPrestamo(prestamo);
    }
    
    public Prestamo read (int codigo)
    {
        prestamo = prestamoDAO.obtenerPrestamo(codigo);
        return prestamo;
    }

    public Prestamo update (int codigo, Prestamo prestamo)
    {
        if(prestamoDAO.actualizarPrestamo(codigo, prestamo)==true)
            return prestamo;
        else
            return null;
    }

    public Prestamo delete(int codigo)
    {
        if(prestamoDAO.eliminarPrestamo(codigo)==true)
            return prestamo;
        else
            return null;        
    }
    
    public Libro readLibro (String titulo)
    {
        libro = libroDAO.obtenerLibro(titulo);
        return libro;
    }    
    
    public Usuario readUsuario(int identificaion){
        usuario = usuarioDAO.obtenerUsuario(identificaion);
        return usuario;
    }    
    
    public Biblioteca readBiblioteca(int codigo){
        biblioteca = bibliotecaDAO.obtenerBiblioteca(codigo);
        return biblioteca;
    }  
    
    public List<Biblioteca> toListBiblioteca(){
        return bibliotecaDAO.obtenerBibliotecas();
    }
    public List<Prestamo> toListPrestamo(){
        return prestamoDAO.obtenerPrestamos();
    }    
    public List<Libro> toListLibro()
    {
        return bibliotecaDAO.obtenerLibros();
    }
    public List<Usuario> toListUsuario()
    {
        return usuarioDAO.obtenerUsuarios();
    }
}
