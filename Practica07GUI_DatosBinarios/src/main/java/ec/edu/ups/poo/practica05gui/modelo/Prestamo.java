/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.practica05gui.modelo;


import java.util.Date;
import java.util.Objects;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private int codigo;
    
    public Prestamo() {
        
    }
    
    public Prestamo(int codigo,Libro libro, Usuario usuario,Date fechaPrestamo, Date fechaDevolucion) {
        this.codigo=codigo;
	this.libro = libro;
	this.usuario = usuario;
	this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.libro);
        hash = 17 * hash + Objects.hashCode(this.usuario);
        hash = 17 * hash + Objects.hashCode(this.fechaPrestamo);
        hash = 17 * hash + Objects.hashCode(this.fechaDevolucion);
        return hash;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "libro=" + libro + ", usuario=" + usuario + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", codigo=" + codigo + '}';
    }
}
