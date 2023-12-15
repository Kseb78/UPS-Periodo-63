
package ec.edu.ups.est.dao.vista;

import ec.edu.ups.est.dao.modelo.Biblioteca;
import java.util.Scanner;

public class BibliotecaVista {
    private Scanner entrada;
    
    public BibliotecaVista(){
        entrada = new Scanner(System.in);
    }
    public Biblioteca ingresarDatosBiblioteca(){
        System.out.println("ingrese una nueva biblioteca");
        System.out.println("ingrese el nombre de la biblioteca");
        String nombre = entrada.next();
        System.out.println("ingrese la direccion de la biblioteca");
        String direccion = entrada.next();
        return new Biblioteca(nombre,direccion); 
    }
    public Biblioteca actualizarDatosBiblioteca(){
        System.out.println("actualizar biblioteca");
        System.out.println("ingrese el nombre de la biblioteca");
        String nombre = entrada.next();
        System.out.println("ingrese la direccion de la biblioteca");
        String direccion = entrada.next();
        return new Biblioteca(nombre,direccion); 
    }
    public String eliminarDatosBiblioteca(){
        System.out.println("eliminar biblioteca");
        System.out.println("ingrese el nombre de la biblioteca");
        String nombre = entrada.next();
        return nombre;
    }
    public String buscarDatosBiblioteca(){
        System.out.println("------Buscar Biblioteca------");
        System.out.println("Ingresa el nombre del libro a buscar");
        String nombre = entrada.next();
        return nombre;
    } 
    public int agregarLibrosABiblioteca(){
        System.out.println("------Agregar Libros a la biblioteca------");
        System.out.println("Ingresa número de libros a agregar");
        int num = entrada.nextInt();
        return num;
    }
    public int agregarUsuariosABiblioteca(){
        System.out.println("------Agregar usuarios a la biblioteca------");
        System.out.println("Ingresa número de usuarios a agregar");
        int num = entrada.nextInt();
        return num;
    }
    public void mostrarInformacionBiblioteca(Biblioteca biblioteca){
        System.out.println(biblioteca.toString());
    }
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
    
    
}
