
package ec.edu.ups.est.dao.idao;

import ec.edu.ups.est.dao.modelo.Biblioteca;
import java.util.List;

public interface IBibliotecaDAO {
    List<Biblioteca> obtenerBibliotecas();   
    Biblioteca obtenerBiblioteca(String nombre);   
    void crearBiblioteca(Biblioteca biblioteca);
    boolean actualizarBiblioteca(String nombre, Biblioteca biblioteca);
    boolean eliminarBiblioteca(String nombre);
}
