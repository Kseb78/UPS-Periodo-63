package ec.edu.ups.poo.practica05gui.controlador;

import ec.edu.ups.poo.practica05gui.modelo.*;
import ec.edu.ups.poo.practica05gui.idao.*;
import java.util.*;


public class BibliotecaControlador {
    private IBibliotecaDAO bibliotecaDAO;
    private Biblioteca biblioteca;

    public BibliotecaControlador(IBibliotecaDAO bibliotecaDAO) {
        this.bibliotecaDAO = bibliotecaDAO;
    }
    
    public void create (int codigo,String nombre,String direccion,String telefono)
    {
        biblioteca = new Biblioteca(codigo,nombre,direccion,telefono);
        bibliotecaDAO.crearBiblioteca(biblioteca);
    }
    
    public Biblioteca read(int codigo)
    {
        biblioteca = bibliotecaDAO.obtenerBiblioteca(codigo);
        return biblioteca;
    }    
    
    public Biblioteca update (int codigo,Biblioteca biblioteca)
    {
        if(bibliotecaDAO.actualizarBiblioteca(codigo, biblioteca)==true)
            return biblioteca;
        else
            return null;
        
    }
    
    public Biblioteca delete(int codigo)
    {
        if(bibliotecaDAO.eliminarBiblioteca(codigo)==true)
            return biblioteca;
        else
            return null;
    }
    
    public List<Biblioteca> toList()
    {
        List<Biblioteca> bibliotecas = bibliotecaDAO.obtenerBibliotecas();
        return bibliotecas;
    }

}
