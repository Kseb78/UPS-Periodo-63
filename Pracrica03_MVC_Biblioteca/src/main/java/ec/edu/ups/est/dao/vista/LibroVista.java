
package ec.edu.ups.est.dao.vista;

import ec.edu.ups.est.dao.modelo.Libro;
import java.util.Scanner;

public class LibroVista {
    private Scanner entrada;
    public LibroVista(){
        entrada = new Scanner(System.in);
    }
    public Libro ingresarDatosLibro(){
        System.out.println("ingrese un nuevo libro");
        System.out.println("ingrese el titulo del libro");
        String titulo = entrada.next();
        System.out.println("ingrese el autor del libro");
        String autor = entrada.next();
        System.out.println("ingrese el año de publicaion del libro");
        int anio = entrada.nextInt();
        System.out.println("¿se encuntra disponible el libro?");
        boolean disponible = entrada.nextBoolean();
        return new Libro(titulo,autor,anio,disponible); 
    }
    public Libro actualizarDatosLibro(){
        System.out.println("actualizar libro");
        System.out.println("ingrese el titulo del libro");
        String titulo = entrada.next();
        System.out.println("ingrese el autor del libro");
        String autor = entrada.next();
        System.out.println("ingrese el año de publicaion del libro");
        int anio = entrada.nextInt();
        System.out.println("¿se encuntra disponible el libro?");
        boolean disponible = entrada.nextBoolean();
        return new Libro(titulo,autor,anio,disponible); 
    }
    public String eliminarDatosLibro(){
        System.out.println("eliminar libro");
        System.out.println("ingrese el nombre del libro");
        String nombre = entrada.next();
        return nombre;
    }
    public String buscarDatosLibro(){
        System.out.println("------Buscar libro-----");
        System.out.println("Ingresa el nombre del libro a buscar");
        String nombre = entrada.next();
        return nombre;
    }    
    public void mostrarInformacionLibro(Libro libro){
        System.out.println(libro.toString());
    }
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
}
