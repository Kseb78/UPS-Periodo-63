package ec.edu.ups.poo.practica05gui.controlador;

import ec.edu.ups.poo.practica05gui.modelo.*;
import ec.edu.ups.poo.practica05gui.idao.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class BibliotecaControlador {
    private IBibliotecaDAO bibliotecaDAO;
    private Biblioteca biblioteca;
    private ILibroDAO libroDAO;
    private Libro libro;

    public BibliotecaControlador(IBibliotecaDAO bibliotecaDAO,ILibroDAO libroDAO) {
        this.bibliotecaDAO = bibliotecaDAO;
        this.libroDAO = libroDAO;
    }
    
    public boolean create (int codigo,String nombre,String direccion,String telefono)
    {
        if(bibliotecaDAO.crearBiblioteca(biblioteca))
        {
            try {
                FileWriter fw = new FileWriter("DATOS\\Bibliotecas.txt",true);
                fw.write(String.valueOf(codigo));
                fw.write("-");
                fw.write(nombre);
                fw.write("-");
                fw.write(direccion);
                fw.write("-");
                fw.write(telefono);  
                fw.write("\n");
                fw.close();
            } catch (IOException e) {
                return false;
            }
        }
        return true;
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
    
    public List<Libro> toListLibros()
    {
        List<Libro> libros = libroDAO.obtenerLibros();
        return libros;
    }

}
