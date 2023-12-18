package ec.edu.ups.est.dao.dao;

import ec.edu.ups.est.dao.idao.IBibliotecaDAO;
import ec.edu.ups.est.dao.modelo.Biblioteca;
import ec.edu.ups.est.dao.modelo.Libro;
import ec.edu.ups.est.dao.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaDAO implements IBibliotecaDAO {
    private List<Biblioteca> listaBibliotecas;

    public BibliotecaDAO() {
        listaBibliotecas=new ArrayList<>();
    }
    

    @Override
    public List<Biblioteca> obtenerBibliotecas() {
        return listaBibliotecas;
    }

    @Override
    public Biblioteca obtenerBiblioteca(String nombre) {
        for(Biblioteca biblioteca:listaBibliotecas){
            if(biblioteca.getNombre().equalsIgnoreCase(nombre)){
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
    public boolean actualizarBiblioteca(String nombre, Biblioteca biblioteca) {
        for (int i = 0; i < listaBibliotecas.size(); i++) {
            Biblioteca bibliotecaEncontrada = listaBibliotecas.get(i);
            if(bibliotecaEncontrada.getNombre().equalsIgnoreCase(nombre)){
                listaBibliotecas.set(i, biblioteca);
                return true;
            }            
        }
        return false;
    }

    @Override
    public boolean eliminarBiblioteca(String nombre) {
        for (int i = 0; i < listaBibliotecas.size(); i++) {
            Biblioteca bibliotecaEncontrada = listaBibliotecas.get(i);
            if(bibliotecaEncontrada.getNombre().equalsIgnoreCase(nombre)){
                listaBibliotecas.remove(i);
                return true;
            }            
        }
        return false;
    }

    
}
