package ec.edu.ups.clases;

import java.util.*;

public class Prestamo 
{
	private Libro libro;
	private Usuario usuario;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	
	public Prestamo() {}

	public Prestamo(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
		this.libro = libro;
		this.usuario = usuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}
	public Prestamo(Libro libro, Date fechaPrestamo, Date fechaDevolucion) {
		this.libro = libro;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}	
	public Prestamo(Libro libro, Usuario usuario, Date fechaPrestamo) {
		this.libro = libro;
		this.usuario = usuario;
		this.fechaPrestamo = fechaPrestamo;
	}	
	public int calcularDiasPrestamo(int diaPrestamo)
	{
		int fechaMaxima = diaPrestamo+4;
		return fechaMaxima;
	}
	
	public void esPrestamoVigente(int diaPrestamo)
	{
		int fechaLimite = calcularDiasPrestamo(diaPrestamo);
		
		if (fechaLimite>diaPrestamo)
		{
			System.out.println("La fecha de devolucion es correcta");
		}
		else
		{
			System.out.println("La fecha de devolucion fue "+fechaLimite+" se aplicara una multa de 5$");
		}
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	@Override
	public String toString() {
		return "Prestamo [libro=" + libro + ", usuario=" + usuario + ", fechaPrestamo=" + fechaPrestamo
				+ ", fechaDevolucion=" + fechaDevolucion + "]";
	}
	
	
	
}
