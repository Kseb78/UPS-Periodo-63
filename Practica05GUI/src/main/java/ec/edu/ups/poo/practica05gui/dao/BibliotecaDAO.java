package ec.edu.ups.poo.practica05gui.dao;

import ec.edu.ups.poo.practica05gui.idao.IBibliotecaDAO;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.poo.practica05gui.modelo.*;

public class BibliotecaDAO implements IBibliotecaDAO{
    private List<Biblioteca> listaBibliotecas;
    private List<Libro> listaLibros;
    
    public BibliotecaDAO() {
        listaBibliotecas=new ArrayList<>();
        listaLibros = new ArrayList<>();
    }
    

    @Override
    public List<Biblioteca> obtenerBibliotecas() {
        return listaBibliotecas;
    }

    @Override
    public Biblioteca obtenerBiblioteca(int codigo) {
        for(Biblioteca biblioteca:listaBibliotecas){
            if(biblioteca.getCodigo()==codigo){
                return biblioteca;
            }
        }
        return null;
    }

    @Override
    public void crearBiblioteca(Biblioteca biblioteca) {
        listaBibliotecas.add(biblioteca);
    }

    @Override
    public boolean actualizarBiblioteca(int codigo, Biblioteca biblioteca) {
        for (int i = 0; i < listaBibliotecas.size(); i++) {
            Biblioteca bibliotecaEncontrada = listaBibliotecas.get(i);
            if(bibliotecaEncontrada.getCodigo()==codigo){
                listaBibliotecas.set(i, biblioteca);
                return true;
            }            
        }
        return false;
    }

    @Override
    public boolean eliminarBiblioteca(int codigo) {
        for (int i = 0; i < listaBibliotecas.size(); i++) {
            Biblioteca bibliotecaEncontrada = listaBibliotecas.get(i);
            if(bibliotecaEncontrada.getCodigo()==codigo){
                listaBibliotecas.remove(i);
                return true;
            }            
        }
        return false;
    }    
    
    @Override
    public void agregarLibro(Libro libro)
    {
        listaLibros.add(libro);
    }
    
    @Override
    public List<Libro> obtenerLibros()
    {
        return listaLibros;
    }
}
