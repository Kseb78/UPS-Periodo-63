
package ec.edu.ups.est.dao.controlador;

import ec.edu.ups.est.dao.idao.ILibroDAO;
import ec.edu.ups.est.dao.modelo.Libro;
import ec.edu.ups.est.dao.vista.LibroVista;
import java.util.List;

public class LibroControlador {
    private ILibroDAO libroDAO;
    private LibroVista libroVista;
    private Libro libro;

    public LibroControlador(ILibroDAO libroDAO, LibroVista libroVista) {
        this.libroDAO = libroDAO;
        this.libroVista = libroVista;
    }
    
    public void crearLibro(){
        libro = libroVista.ingresarDatosLibro();
        libroDAO.crearLibro(libro);
    }
    public void actualizarLibro(){
        libro = libroVista.actualizarDatosLibro();
        if(libroDAO.actualizarLibro(libro.getTitulo(), libro) == true){
            libroVista.mostrarAlertas("libro actualizado correctamente!");                    
        }else{
            libroVista.mostrarAlertas("Ha ocurrido un error!");                    
        }            
    }
    public void eliminarLibro(){
        String titulo = libroVista.eliminarDatosLibro();
        if(libroDAO.eliminarLibro(titulo) == true){
            libroVista.mostrarAlertas("libro eliminado correctamente!");                    
        }else{
            libroVista.mostrarAlertas("Ha ocurrido un error!");
        }
    }
    public void buscarLibroPorTitulo(){
        String titulo = libroVista.buscarDatosLibro();
        libro = libroDAO.obtenerLibro(titulo);
        if(libro == null){
            libroVista.mostrarAlertas("libro no encontrado");
        }else{
            libroVista.mostrarInformacionLibro(libro);
        }
    }
    
    public void listarLibros(){
        List<Libro> listaLibros = libroDAO.obtenerLibros();
        for (Libro libro : listaLibros) {
            libroVista.mostrarInformacionLibro(libro);
        }
    }
    
}
