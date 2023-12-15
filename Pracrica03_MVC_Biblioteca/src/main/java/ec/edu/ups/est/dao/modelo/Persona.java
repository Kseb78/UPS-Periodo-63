
package ec.edu.ups.est.dao.modelo;

import java.util.Objects;

public abstract class Persona {
    private String nombre;
    private String identificacion;
    
    public Persona() {}
	
    public Persona(String nombre, String identificacion) {
	this.nombre = nombre;
	this.identificacion = identificacion;
    }	

    public String getNombre() {
	return nombre;
    }
    public void setNombre(String nombre) {
	this.nombre = nombre;
    }
	
    public String getIdentificacion() {
	return identificacion;
    }
    public void setIdentificacion(String identificacion) {
	this.identificacion = identificacion;
    }

	//Metodo abstracto
    abstract public void mostrarDatos();

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.identificacion);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.identificacion, other.identificacion);
    }
    

    @Override
    public String toString() {
	return "Persona [nombre=" + nombre + ", identificacion=" + identificacion + "]";
    }
}
