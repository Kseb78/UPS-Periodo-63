package ec.edu.ups.poo.practica05gui.modelo;

import java.util.*;

public class Biblioteca {
    
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    //Atributos de agregacion
    private List<Libro> listaLibros;
    private List<Usuario> listaUsuarios;

    public Biblioteca() {
        this.listaLibros= new ArrayList<>();
	this.listaUsuarios= new ArrayList<>();
    }

    public Biblioteca(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaLibros= new ArrayList<>();
	this.listaUsuarios= new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void agregarLibros(Libro libro)
    {
        listaLibros.add(libro);
    }
    
    public List<Libro> getListaLibros() {
        return listaLibros;
    }
    public List<Usuario> getListaUsuarios() {
	return listaUsuarios;
}

    @Override
    public String toString() {
        return "Biblioteca{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", listaLibros=" + listaLibros + ", listaUsuarios=" + listaUsuarios + '}';
    }
    
    
}
