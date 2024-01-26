package ec.edu.ups.poo.practica05gui.idao;

import java.util.List;
import ec.edu.ups.poo.practica05gui.modelo.*;

public interface ILibroDAO {
    List<Libro> obtenerLibros();   
    Libro obtenerLibro(String titulo);  
    Libro obtenerLibro2(String autor);
    Libro obtenerLibro2(int codigo);
    Libro obtenerLibro(int anio);
    boolean crearLibro(Libro libro);
    boolean actualizarLibro(int codigo, Libro libro);
    boolean eliminarLibro(int codigo);
}
