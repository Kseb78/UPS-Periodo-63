
package ec.edu.ups.est.dao.idao;

import ec.edu.ups.est.dao.modelo.Libro;
import java.util.List;

public interface ILibroDAO {
    List<Libro> obtenerLibros();   
    Libro obtenerLibro(String titulo);  
    Libro obtenerLibroPorAutor(String autor);
    Libro obtenerLibro(int anio);
    void crearLibro(Libro libro);
    boolean actualizarLibro(String titulo, Libro libro);
    boolean eliminarLibro(String titulo);
}
