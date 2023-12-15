
package ec.edu.ups.est.dao.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Usuario extends Persona {
    private String correo;
	//Atributo de composicion
    private List<Prestamo> listaPrestamos;
    
    public Usuario(){
		this.listaPrestamos = new ArrayList<>();
	}

	public Usuario(String correo) {
		this.correo = correo;
		this.listaPrestamos= new ArrayList<>();
	}
	public Usuario(String correo,String nombre,String identificacion) {
		super(nombre, identificacion);
		this.correo = correo;
	}
	public Usuario(String correo,String nombre,String identificacion,Prestamo prestamo) {
		super(nombre, identificacion);
		this.correo = correo;
		this.listaPrestamos= new ArrayList<>();
		listaPrestamos.add(prestamo);
	}

	public Usuario(String nombre, String identificacion) {
		super(nombre, identificacion);
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public List<Prestamo> getListaPrestamos() {
		return listaPrestamos;
        }
        public void agregarPrestamo(Prestamo prestamo)
	{
		listaPrestamos.add(prestamo);
	}

	
	public void devolverLibro(Libro libro,Usuario usuario)
	{
		libro.setDisponible(true);
		Date fecha = new Date();
		Prestamo prestamo = new Prestamo(libro, usuario,fecha,new Date(fecha.getYear(), fecha.getMonth(), fecha.getDate()+9));
		Usuario usuario1 = new Usuario ();
		usuario1.agregarPrestamo(prestamo);
		for (Prestamo prestamo1 : usuario1.getListaPrestamos())
		{
			if (prestamo1.getLibro().equals(libro))
			{
				int fechaDevolucion = prestamo1.getFechaPrestamo().getDate();
				prestamo1.esPrestamoVigente(fechaDevolucion);
				System.out.println("Ahora el libro "+prestamo1.getLibro().getTitulo()+" esta disponible");
				libro.devolver();
			}
		}
	}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.correo);
        hash = 71 * hash + Objects.hashCode(this.listaPrestamos);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        return Objects.equals(this.listaPrestamos, other.listaPrestamos);
    }
        
    
    
    @Override
    public void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public String toString() {
	return super.toString()+"Usuario [correo=" + correo + ", listaPrestamos=" + listaPrestamos + "]";
    }
    
}
