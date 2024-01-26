package ec.edu.ups.poo.practica05gui.idao;

import ec.edu.ups.poo.practica05gui.modelo.*;
import java.util.List;

public interface IBibliotecaDAO {
    List<Biblioteca> obtenerBibliotecas();   
    Biblioteca obtenerBiblioteca(int codigo);   
    boolean crearBiblioteca(Biblioteca biblioteca);
    boolean actualizarBiblioteca(int codigo, Biblioteca biblioteca);
    boolean eliminarBiblioteca(int codigo);
    void agregarLibro(Libro libro);
    List<Libro> obtenerLibros();
}
