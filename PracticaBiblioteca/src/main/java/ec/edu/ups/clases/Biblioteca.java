package ec.edu.ups.clases;

import java.util.*;
import ec.edu.ups.clases.*;

public class Biblioteca 
{
	private String nombre;
	private String direccion;
	//Atributos de agregacion
	private List<Libro> listaLibros;
	private List<Usuario> listaUsuarios;
	
	Scanner sc = new Scanner (System.in);
	
	public Biblioteca(){
		this.listaLibros= new ArrayList<>();
		this.listaUsuarios= new ArrayList<>();
	}
	
	public Biblioteca(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaLibros= new ArrayList<>();
		this.listaUsuarios= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	public void agregarLibro(Libro libro)
	{
		System.out.println("Ingrese el titulo del libro");
		String titulo = sc.next();
		System.out.println("Ingrese el autor del libro");
		String autor = sc.next();
		System.out.println("Ingrese el anio del libro");
		int anio = sc.nextInt();
		boolean disponible = true;
		
		listaLibros.add(new Libro(titulo,autor,anio,disponible));
		System.out.println("El libro se ha agregado correctamente");
	}
	
	public void registrarUsuario(Usuario usuario)
	{
		System.out.println("Ingrese el nombre del usuario");
		String nombre = sc.next();
		System.out.println("Ingrese el correo del usuario");
		String correo = sc.next();
		System.out.println("Ingrese la identificacion del usuario");
		String identificacion = sc.next();
		
		listaUsuarios.add(new Usuario(correo,nombre,identificacion));
		System.out.println("El usuario se ha registrado correctamente");
	}
	
	public ArrayList<Libro> buscarLibro(String titulo)
	{	
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;  
	}
	
	public ArrayList<Libro> buscarLibroPorAutor(String autor) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();

        for (Libro libro : listaLibros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
            librosEncontrados.add(libro);
            }
        }
    return librosEncontrados;
    }
	public ArrayList<Libro> buscarLibro(int anio)
	{
		ArrayList<Libro> librosEncontrados = new ArrayList<>();
		
		for (Libro libro :listaLibros)
		{
			if (libro.getAnio()==anio)
			{
				librosEncontrados.add(libro);
			}
		}
		
		return librosEncontrados;
	}
	
	public void prestarLibro(Libro libro, Usuario usuario)
	{		
		Prestamo prestamo = new Prestamo();
		boolean prestado = true;
		
		
		System.out.println("Ingrese el titulo del libro: ");
		String prestarLibroL = sc.next();
		for (Libro libro1 :listaLibros)
		{
			if (libro1.getTitulo().equalsIgnoreCase(prestarLibroL) && libro1.isDisponible())
			{
				prestamo.setLibro(libro1);
				libro1.setDisponible(false);
				System.out.println("Libro "+libro1.getTitulo()+" con autor "+libro1.getAutor()+" encontrado");
			}
			else
			{
				System.out.println("El libro no se encuentra disponible");
				prestado = false;
				break;
			}
		}
		if(prestado == true)
		{
			System.out.println("Ingrese la identificacion del usuario: ");
			String prestarLibroU = sc.next();
			
			for (Usuario usuario1 : listaUsuarios)
			{
				if (usuario1.getIdentificacion().equalsIgnoreCase(prestarLibroU))
				{
					prestamo.setUsuario(usuario1);
					System.out.println("Usuario "+usuario1.getNombre()+" encontrado");
					break;
				}
				else
				{
					System.out.println("El libro no se encuentra disponible");
					prestado = false;
					break;
				}			
			}	
		}
		if (prestado == true)
		{
			prestamo.getLibro().prestar();
			Date fecha = new Date();
			prestamo.setFechaPrestamo(fecha);
			int dia = fecha.getDate();
			int mes = fecha.getMonth()+1;
			System.out.println("El libro se ha prestado el dia "+dia+" en el mes "+mes);
			int fechaE = prestamo.calcularDiasPrestamo(dia);
			
			Date fechaD = new Date(fecha.getYear(),dia+fechaE,mes);
			System.out.println("Tiene hasta el dia "+fechaD.getDate()+" para la devolucion del libro");
			prestamo.setFechaDevolucion(fechaD);

			Usuario usuarioP = new Usuario();
			usuarioP.agregarPrestamo(prestamo);
		}
		else
		{
			System.out.println("El libro no se ha prestado");
		}
		

	}

    public List<Libro> getListaLibros() {
		return listaLibros;
	}
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	@Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", direccion=" + direccion + ", listaLibros=" + listaLibros + ", listaUsuarios=" + listaUsuarios + '}';
    }

	
}
