
package ec.edu.ups.est.dao.modelo;

import interfaces.Prestable;
import java.util.Objects;

public class Libro extends Persona implements Prestable{
    private String titulo;
    private String autor;
    private int anio;
    private boolean disponible;

    public Libro() {
    }
    public Libro(String titulo, String autor, int anio, boolean disponible) {
	super();
	this.titulo = titulo;
	this.autor = autor;
	this.anio = anio;
	this.disponible = disponible;
    }

    @Override
    public void mostrarDatos() {
        // TODO Auto-generated method stub
    }

    @Override
    public void prestar() {
        System.out.println("El libro se ha prestado correctamente");
    }

    @Override
    public void devolver() {
        System.out.println("El libro se ha devuelto correctamente");
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
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.titulo);
        hash = 41 * hash + Objects.hashCode(this.autor);
        hash = 41 * hash + this.anio;
        hash = 41 * hash + (this.disponible ? 1 : 0);
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
        final Libro other = (Libro) obj;
        if (this.anio != other.anio) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    


    @Override
    public String toString() {
	return "Libro [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + ", disponible=" + disponible + "]";
    }
    
    
}
