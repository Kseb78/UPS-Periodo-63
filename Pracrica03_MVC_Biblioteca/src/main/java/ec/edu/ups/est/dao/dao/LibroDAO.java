
package ec.edu.ups.est.dao.dao;

import ec.edu.ups.est.dao.idao.ILibroDAO;
import ec.edu.ups.est.dao.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO implements ILibroDAO{
    private List<Libro> listaLibros;
    
    public LibroDAO() {
        listaLibros=new ArrayList<>();
    }

    @Override
    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    @Override
    public Libro obtenerLibro(String titulo) {
        for(Libro libro:listaLibros){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                return libro;
            }
        }
        return null;    
    }

    @Override
    public Libro obtenerLibroPorAutor(String autor) {
        for(Libro libro:listaLibros){
            if(libro.getAutor().equalsIgnoreCase(autor)){
                return libro;
            }
        }
        return null;
    }

    @Override
    public Libro obtenerLibro(int anio) {
        for(Libro libro:listaLibros){
            if(libro.getAnio()==anio){
                return libro;
            }
        }
        return null;
    }

    @Override
    public void crearLibro(Libro libro) {
        listaLibros.add(libro);
    }

    @Override
    public boolean actualizarLibro(String titulo, Libro libro) {
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro libroEncontrado = listaLibros.get(i);
            if(libroEncontrado.getTitulo().equalsIgnoreCase(titulo)){
                listaLibros.set(i, libro);
                return true;
            }            
        }
        return false;    
    }

    @Override
    public boolean eliminarLibro(String titulo) {
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro ibroEncontrado = listaLibros.get(i);
            if(ibroEncontrado.getNombre().equalsIgnoreCase(titulo)){
                listaLibros.remove(i);
                return true;
            }            
        }
        return false;    
    }
    
}
