package ec.edu.ups.principal;

import java.util.*;
import ec.edu.ups.clases.*;
import ec.edu.ups.interfaces.*;

public class Principal 
{
	public static void main(String[] args) 
	{
		Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "123 Calle Principal");
		 Scanner scanner = new Scanner(System.in);
		 int opcion;
		 do {
			 	 System.out.println(" ");
				 System.out.println("Bienvenido al Sistema de Gestión de Biblioteca");
				 System.out.println("1. Agregar Libro");
				 System.out.println("2. Registrar Usuario");
				 System.out.println("3. Buscar Libro");
				 System.out.println("4. Prestar Libro");
				 System.out.println("5. Devolver Libro");
				 System.out.println("6. Salir");
				 System.out.print("Ingrese una opción: ");
				 opcion = scanner.nextInt();
		 switch (opcion) {
				 case 1:
		// Implementación para agregar libro
			Libro libro1 = new Libro();
		    biblioteca.agregarLibro(libro1);
		 break;
		 case 2:
		 // Implementación para registrar usuario
			 Usuario usuario1 = new Usuario();
			 biblioteca.registrarUsuario(usuario1);
		 break;
		 case 3:
		 // Implementación para buscar libro
			 System.out.println("ingrese el titulo, autor u año del libro solicitado");
             
             if (scanner.hasNextInt()) {
                 int scannerAño = scanner.nextInt();
                 ArrayList<Libro> librosEncontrados = biblioteca.buscarLibro(scannerAño);
                 for (Libro libro : librosEncontrados) {
                     System.out.println(libro);
                 }
             } else {
                 String scannerInput = scanner.next();
                 ArrayList<Libro> librosEncontradosPorTitulo = biblioteca.buscarLibro(scannerInput);
                 for (Libro libro : librosEncontradosPorTitulo) {
                     System.out.println(libro);
                 }
                 ArrayList<Libro> librosEncontradosPorAutor = biblioteca.buscarLibroPorAutor(scannerInput);
                 for (Libro libro : librosEncontradosPorAutor) {
                     System.out.println(libro);
                 }
             }         

		 break;
		 case 4:
		 // Implementación para prestar libro
				biblioteca.prestarLibro(null, null);
		 break;
		 case 5:
		 // Implementación para devolver libro
			System.out.println("Ingrese la identificacion del usuario: ");
			String identificacion = scanner.next();
			 
			for (Usuario usuario : biblioteca.getListaUsuarios())
			{
				if (usuario.getIdentificacion().equalsIgnoreCase(identificacion))
				{
					System.out.println(usuario.getNombre()+" que libro deseas devolver?");
					System.out.println(usuario.obtenerTitulos(biblioteca)); 
					String libroDevolver = scanner.next();
					for (Libro libro: biblioteca.getListaLibros())
					{
						if (libro.getTitulo().equalsIgnoreCase(libroDevolver))
						{
							usuario.devolverLibro(libro,usuario);
						}
						else
						{
							System.out.println("No se ha ingresado un titulo de la lista");
						}
					}
				}
				else
				{
					System.out.println("El usuario no se encuentra en la lista");
				}
			} 

		 break;
		 case 6:
		 System.out.println("Saliendo del sistema...");
		 break;
		 default:
		 System.out.println("Opción no válida. Por favor intente de nuevo.");
		 }
		 } while (opcion != 6);
		 scanner.close();
		 }
	}

