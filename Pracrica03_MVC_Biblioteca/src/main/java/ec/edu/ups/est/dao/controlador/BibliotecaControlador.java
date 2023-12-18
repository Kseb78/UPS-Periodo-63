
package ec.edu.ups.est.dao.controlador;

import ec.edu.ups.est.dao.idao.IBibliotecaDAO;
import ec.edu.ups.est.dao.idao.ILibroDAO;
import ec.edu.ups.est.dao.idao.IUsuarioDAO;
import ec.edu.ups.est.dao.modelo.Biblioteca;
import ec.edu.ups.est.dao.modelo.Libro;
import ec.edu.ups.est.dao.modelo.Usuario;
import ec.edu.ups.est.dao.vista.BibliotecaVista;
import ec.edu.ups.est.dao.vista.LibroVista;
import ec.edu.ups.est.dao.vista.UsuarioVista;
import java.util.List;

public class BibliotecaControlador {
    private IBibliotecaDAO bibliotecaDAO;
    private BibliotecaVista bibliotecaVista;
    private Biblioteca biblioteca;
    
    private IUsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Usuario usuario;
    
    private ILibroDAO libroDAO;
    private LibroVista libroVista;
    private Libro libro;

    public BibliotecaControlador(IBibliotecaDAO bibliotecaDAO, BibliotecaVista bibliotecaVista, IUsuarioDAO usuarioDao, UsuarioVista usuarioVista, ILibroDAO libroDAO, LibroVista libroVista) {
        this.bibliotecaDAO = bibliotecaDAO;
        this.bibliotecaVista = bibliotecaVista;
        this.usuarioDAO = usuarioDao;
        this.usuarioVista = usuarioVista;
        this.libroDAO = libroDAO;
        this.libroVista = libroVista;
    }

    public void crearBiblioteca(){
        biblioteca = bibliotecaVista.ingresarDatosBiblioteca();
        bibliotecaDAO.crearBiblioteca(biblioteca);
    }
    public void actualizarBiblioteca()
    {
        biblioteca = bibliotecaVista.actualizarDatosBiblioteca();
        bibliotecaDAO.actualizarBiblioteca(biblioteca.getNombre(), biblioteca);
        if (bibliotecaDAO.actualizarBiblioteca(biblioteca.getNombre(), biblioteca)==true)
        {
            bibliotecaVista.mostrarAlertas("Biblioteca actualizada");
        }else
        {
            bibliotecaVista.mostrarAlertas("Biblioteca no actualizada");
        }
    }
    public void eliminarBiblioteca(){
        String nombre = bibliotecaVista.eliminarDatosBiblioteca();
        if(bibliotecaDAO.eliminarBiblioteca(nombre)==true){
            bibliotecaVista.mostrarAlertas("Biblioteca eliminada");
        }
        else{
            bibliotecaVista.mostrarAlertas("Biblioteca no eliminada");
        }
    
    }
    public void buscarBibliotecaPorNombre(){
        String nombre = bibliotecaVista.buscarDatosBiblioteca();
        biblioteca = bibliotecaDAO.obtenerBiblioteca(nombre);
        if(biblioteca == null){
            bibliotecaVista.mostrarAlertas("biblioteca no encontrada");
        }else{
            bibliotecaVista.mostrarInformacionBiblioteca(biblioteca);
        }
    }
    public void listarBibliotecas(){
        List<Biblioteca> listaBibliotecas = bibliotecaDAO.obtenerBibliotecas();
        for (Biblioteca biblioteca : listaBibliotecas) {
            bibliotecaVista.mostrarInformacionBiblioteca(biblioteca);
        }
    }
    public void agregarLibros()
    {
        String nombre = bibliotecaVista.buscarDatosBiblioteca();
        biblioteca = bibliotecaDAO.obtenerBiblioteca(nombre);
        if(biblioteca == null){
            bibliotecaVista.mostrarAlertas("biblioteca no encontrada");
        }else{
            int libros = bibliotecaVista.agregarLibrosABiblioteca();
            for (int i =0; i<libros ; i++)
            {
                String titulo = libroVista.buscarDatosLibro();
                libro = libroDAO.obtenerLibro(titulo);
                if (libro!=null)
                {
                    biblioteca.agregarLibro(libro);
                    bibliotecaVista.mostrarAlertas("Libro agregado a la bibliteca");
                }else
                {
                    bibliotecaVista.mostrarAlertas("Libro no encontrado");
                }
            }
        }           
    }
    public void agregarUsuarios()
    {
    String nombre = bibliotecaVista.buscarDatosBiblioteca();
    biblioteca = bibliotecaDAO.obtenerBiblioteca(nombre);
    if (biblioteca==null)
    {
        bibliotecaVista.mostrarAlertas("biblioteca no encontrada");
    }else
    {
        int usuarios = bibliotecaVista.agregarUsuariosABiblioteca();
        for (int i = 0;i<usuarios;i++)
        {
            String identificacion = usuarioVista.buscarDatosUsuario();
            usuario = usuarioDAO.obtenerUsuario(identificacion);
            if (usuario!=null)
            {
                biblioteca.registrarUsuario(usuario);
                bibliotecaVista.mostrarAlertas("Usuario agregado a la biblioteca");
            }else
            {
                bibliotecaVista.mostrarAlertas("Usuario no encontrado");
            }
        }
    }
    }
}
