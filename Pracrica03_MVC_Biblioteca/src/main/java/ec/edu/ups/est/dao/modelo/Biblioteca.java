
package ec.edu.ups.est.dao.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Biblioteca {
    private String nombre;
    private String direccion;
	//Atributos de agregacion
    private List<Libro> listaLibros;
    private List<Usuario> listaUsuarios;

    public Biblioteca() {
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

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    public void agregarLibro(Libro libro){
        listaLibros.add(libro);
    }
    public void registrarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);       
    }
    public void prestarLibro(Libro libro, Usuario usuario)
	{		
		Prestamo prestamo = new Prestamo();
		boolean prestado = true;
		Scanner sc = new Scanner(System.in);
		
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
	

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.direccion);
        hash = 59 * hash + Objects.hashCode(this.listaLibros);
        hash = 59 * hash + Objects.hashCode(this.listaUsuarios);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Biblioteca other = (Biblioteca) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.listaLibros, other.listaLibros)) {
            return false;
        }
        return Objects.equals(this.listaUsuarios, other.listaUsuarios);
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", direccion=" + direccion + ", listaLibros=" + listaLibros + ", listaUsuarios=" + listaUsuarios + '}';
    }
    
    
    
    
}
