package ec.edu.ups.poo.practica05gui.controlador;

import ec.edu.ups.poo.practica05gui.idao.IBibliotecaDAO;
import ec.edu.ups.poo.practica05gui.idao.ILibroDAO;
import ec.edu.ups.poo.practica05gui.modelo.Biblioteca;
import ec.edu.ups.poo.practica05gui.modelo.Libro;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LibroControlador {
    private ILibroDAO libroDAO;
    private Libro libro;
    private IBibliotecaDAO bibliotecaDAO;
    private Biblioteca biblioteca;

    public LibroControlador(ILibroDAO libroDAO,IBibliotecaDAO bibliotecaDAO) {
        this.libroDAO = libroDAO;
        this.bibliotecaDAO = bibliotecaDAO;
    }
    
    public boolean create (int codigo, String titulo, String autor, int anio, boolean disponible)
    {
        if(libroDAO.crearLibro(libro))
        {
            try {  
            FileWriter fw = new FileWriter("DATOS\\Libros.txt",true);
            fw.write(String.valueOf(codigo));
            fw.write("-");
            fw.write(autor);
            fw.write("-");
            fw.write(titulo);
            fw.write("-");
            fw.write(String.valueOf(anio));  
            fw.write("-");
            fw.write(String.valueOf(disponible));  
            fw.write("\n");
            fw.close();
            } catch (IOException e) {
                return false;
            }
        }
        return false;
    }

    public void addBook(int codigo,Libro libro)
    {
        for(Biblioteca biblioteca : bibliotecaDAO.obtenerBibliotecas())
        {
            if (biblioteca.getCodigo()==codigo)
            {
                bibliotecaDAO.agregarLibro(libro);
            }
        }
    }
    
    public Libro read (String titulo)
    {
        libro = libroDAO.obtenerLibro(titulo);
        return libro;
    }
    public Libro read(int anio)
    {
        libro = libroDAO.obtenerLibro(anio);
        return libro;
    }
    
    public Libro read1 (String autor)
    {
        libro = libroDAO.obtenerLibro2(autor);
        return libro;
    }
    public Libro read1 (int codigo)
    {
        libro = libroDAO.obtenerLibro2(codigo);
        return libro;    
    }
    
    public Libro update(int codigo, Libro libro)
    {
        if(libroDAO.actualizarLibro(codigo, libro)==true)
        {
            return libro;
        }
        return null;
    }
    
    public Libro delete (int codigo)
    {
        if(libroDAO.eliminarLibro(codigo)==true)
        {
            return libro;
        }
        return null;        
    }
    
    public List<Libro> toList()
    {
        List<Libro> libros = libroDAO.obtenerLibros();
        return libros;
    }
    public List<Biblioteca> toListBiblioteca(){
        return bibliotecaDAO.obtenerBibliotecas();
    }    
}
