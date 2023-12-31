package ec.edu.ups.est.pracrica03_mvc_biblioteca;

import ec.edu.ups.est.dao.controlador.BibliotecaControlador;
import ec.edu.ups.est.dao.controlador.LibroControlador;
import ec.edu.ups.est.dao.controlador.PrestamoControlador;
import ec.edu.ups.est.dao.controlador.UsuarioControlador;
import ec.edu.ups.est.dao.dao.BibliotecaDAO;
import ec.edu.ups.est.dao.dao.LibroDAO;
import ec.edu.ups.est.dao.dao.PrestamoDAO;
import ec.edu.ups.est.dao.dao.UsuarioDAO;
import ec.edu.ups.est.dao.idao.IBibliotecaDAO;
import ec.edu.ups.est.dao.idao.ILibroDAO;
import ec.edu.ups.est.dao.idao.IPrestamoDAO;
import ec.edu.ups.est.dao.idao.IUsuarioDAO;
import ec.edu.ups.est.dao.vista.BibliotecaVista;
import ec.edu.ups.est.dao.vista.LibroVista;
import ec.edu.ups.est.dao.vista.PrestamoVista;
import ec.edu.ups.est.dao.vista.UsuarioVista;
import java.util.ArrayList;
import java.util.Scanner;

public class Pracrica03_MVC_Biblioteca {

    public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
                 IBibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
                 BibliotecaVista bibliotecaVista = new BibliotecaVista();
                 ILibroDAO libroDAO = new LibroDAO();
                 LibroVista libroVista = new LibroVista();
                 IPrestamoDAO prestamoDAO = new PrestamoDAO();
                 PrestamoVista prestamoVista = new PrestamoVista();
                 IUsuarioDAO usuarioDAO = new UsuarioDAO();
                 UsuarioVista usuarioVista = new UsuarioVista();
                 
                 BibliotecaControlador bibliotecaControlador = new BibliotecaControlador(bibliotecaDAO, bibliotecaVista, usuarioDAO, usuarioVista, libroDAO, libroVista);
                 LibroControlador libroControlador = new LibroControlador(libroDAO, libroVista);
                 PrestamoControlador prestamoControlador = new PrestamoControlador(prestamoDAO, prestamoVista, usuarioDAO, usuarioVista, libroDAO, libroVista);
                 UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioDAO, usuarioVista, prestamoDAO, prestamoVista,libroDAO,libroVista);
                 
		 int opcion;
		 do {
			 	 System.out.println(" ");
                                 System.out.println("Bienvenido");
				 System.out.println("1. Biblioteca");
                                 System.out.println("2. Usuario");
                                 System.out.println("3. Libros");
                                 System.out.println("4. Salir");
                                 System.out.print("Ingrese su opción: ");

				 opcion = scanner.nextInt();
		 switch (opcion) {
		case 1:
                      // Menú de Biblioteca
                    boolean salirBiblioteca = false;
                    while (!salirBiblioteca) {
                        System.out.println(" ");
                        System.out.println("Biblioteca");
                        System.out.println("1. Crear Biblioteca");
                        System.out.println("2. buscar Biblioteca");
                        System.out.println("3. Actualizar Biblioteca");
                        System.out.println("4. Eliminar Biblioteca");
                        System.out.println("5. Agregar Libros a Biblioteca");
                        System.out.println("6. Agregar Usuarios a Biblioteca");
                        System.out.println("7. Listar Bibliotecas");
                        System.out.println("8. Regresar al Menú Principal");
                        System.out.print("Ingrese su opción: ");

                        int opcionBiblioteca = scanner.nextInt();

                        switch (opcionBiblioteca) {
                            case 1:
                                bibliotecaControlador.crearBiblioteca();
                                break;
                            case 2:
                                bibliotecaControlador.buscarBibliotecaPorNombre();
                                break;
                            case 3:
                                bibliotecaControlador.actualizarBiblioteca();
                                break;
                            case 4:
                                bibliotecaControlador.eliminarBiblioteca();
                                break;
                            case 5:
                                bibliotecaControlador.agregarLibros();
                                break;
                            case 6:
                                bibliotecaControlador.agregarUsuarios();
                                break;                                
                            case 7:
                                bibliotecaControlador.listarBibliotecas();
                                break;  
                            case 8:
                                salirBiblioteca = true;
                                break;                                 
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                        }
                    }
                    break;

		 case 2:
                     // Menú de Usuario
                    boolean salirUsuario = false;
                    while (!salirUsuario) {
                        System.out.println(" ");
                        System.out.println("Usuario");
                        System.out.println("1. Registrar Usuario");
                        System.out.println("2. Buscar Usuario");
                        System.out.println("3. Actualizar Usuario");
                        System.out.println("4. Eliminar Usuario");
                        System.out.println("5. Listar Usuarios");
                        System.out.println("6. Prestamo");
                        System.out.println("7. Regresar al Menú Principal");
                        System.out.print("Ingrese su opción: ");

                        int opcionUsuario = scanner.nextInt();

                        switch (opcionUsuario) {
                            case 1:
                                usuarioControlador.crearUsuario();
                                
                                break;
                            case 2:
                                usuarioControlador.buscarUsuarioPorNombre();
                                break;
                            case 3:
                                usuarioControlador.actualizarUsuario();
                                break;
                            case 4:
                                usuarioControlador.eliminarUsuario();
                                break;
                            case 5:
                                usuarioControlador.listarUsuarios();
                                break;
                            case 6:
                    boolean salirPrestamos = false;
                    while (!salirPrestamos) {
                        System.out.println(" ");
                        System.out.println("Préstamos");
                        System.out.println("1. Crear Préstamo");
                        System.out.println("2. Buscar Préstamo");                      
                        System.out.println("3. Actualizar Préstamo");
                        System.out.println("4. Eliminar Préstamo");
                        System.out.println("5. Listar Préstamos");
                        System.out.println("6. Devolver Préstamo");
                        System.out.println("7. Regresar al Menú Principal");
                        System.out.print("Ingrese su opción: ");

                        int opcionPrestamos = scanner.nextInt();

                        switch (opcionPrestamos) {
                            case 1:
                                usuarioControlador.agregarPrestamo();
                                break;
                            case 2:
                                prestamoControlador.obtenerPrestamosPorFechaPrestamo();
                                break;
                            case 3:
                                prestamoControlador.actualizarPrestamo();
                                break;
                            case 4:
                                prestamoControlador.eliminarPrestamo();
                                break;
                            case 5:
                                prestamoControlador.listarPrestamos();
                                break;
                            case 6:
                                usuarioControlador.devolverPrestamo();
                                break;
                            case 7:
                                salirPrestamos = true;
                                break;                                
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                        }
                    }
                            case 7:
                                salirUsuario = true;
                                break;                                
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                        }
                    }
                    break;

		 case 3:
                      // Menú de Libros
                    boolean salirLibros = false;
                    while (!salirLibros) {
                        System.out.println(" ");
                        System.out.println("Libros");
                        System.out.println("1. Crear Libro");
                        System.out.println("2. Buscar Libro por Título"); 
                        System.out.println("3. Buscar Libro por Autor"); 
                        System.out.println("4. Buscar Libro por Anio"); 
                        System.out.println("5. Actualizar Libro");
                        System.out.println("6. Eliminar Libro");
                        System.out.println("7. Listar Libros");
                        System.out.println("8. Regresar al Menú Principal");
                        System.out.print("Ingrese su opción: ");

                        int opcionLibros = scanner.nextInt();

                        switch (opcionLibros) {
                            case 1:
                                libroControlador.crearLibro();
                                break;
                            case 2:
                                libroControlador.buscarLibroPorTitulo();
                                break;                           
                            case 3:
                                libroControlador.buscarLibroPorAutor();
                                break;  
                            case 4:
                                libroControlador.buscarLibroPorAnio();
                                break;  
                            case 5:
                                libroControlador.actualizarLibro();
                                break;
                            case 6:
                                libroControlador.eliminarLibro();
                                break;
                            case 7:
                                libroControlador.listarLibros();
                                break;
                            case 8:
                                salirLibros = true;
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                        }
                    }
		 case 4:
                     System.out.println("Gracias por usar el programa, FELIZ NAVIDAD!");
                    break;                   

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    		 
		 }
		 } 
                 while (opcion != 4);
		 scanner.close();
	}
    
}
