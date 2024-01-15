package ec.edu.ups.poo.practica05gui.dao;

import ec.edu.ups.poo.practica05gui.idao.ILibroDAO;
import java.util.List;
import ec.edu.ups.poo.practica05gui.modelo.*;
import java.util.ArrayList;


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
    public Libro obtenerLibro2(String autor) {
        for(Libro libro:listaLibros){
            if(libro.getAutor().equalsIgnoreCase(autor)){
                return libro;
            }
        }
        return null;
    }
    
    @Override
    public Libro obtenerLibro2(int codigo) {
        for(Libro libro:listaLibros){
            if(libro.getCodigo()==codigo){
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
    public boolean actualizarLibro(int codigo, Libro libro) {
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro libroEncontrado = listaLibros.get(i);
            if(libroEncontrado.getCodigo()==codigo){
                listaLibros.set(i, libro);
                return true;
            }            
        }
        return false;    
    }

    @Override
    public boolean eliminarLibro(int codigo) {
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro ibroEncontrado = listaLibros.get(i);
            if(ibroEncontrado.getCodigo()==codigo){
                listaLibros.remove(i);
                return true;
            }            
        }
        return false;    
    }

}
