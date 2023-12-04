package ec.edu.ups.clases;

import java.util.*;
import ec.edu.ups.interfaces.*;
import ec.edu.ups.clases.*;

public class Libro extends Persona implements IPrestable 
{
	private String titulo;
	private String autor;
	private int anio;
	private boolean disponible;
	
	Scanner sc = new Scanner(System.in);
	
	public Libro() {}
	
	
	public Libro(String titulo, String autor, int anio, boolean disponible) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
		this.disponible = disponible;
	}

	@Override
	public void prestar() 
	{
		System.out.println("El libro se ha prestado correctamente");
	}
	
	@Override
	public void devolver() {
		System.out.println("El libro se ha devuelto correctamente");
	}
	
	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + ", disponible=" + disponible + "]";
	}
}
