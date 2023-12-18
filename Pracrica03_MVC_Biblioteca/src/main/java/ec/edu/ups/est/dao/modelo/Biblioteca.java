
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

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void agregarLibro(Libro libro){
        listaLibros.add(libro);
    }
    public void registrarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);       
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
