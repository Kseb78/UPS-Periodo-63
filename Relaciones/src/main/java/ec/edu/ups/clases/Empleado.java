package ec.edu.ups.clases;
import java.util.*;

public class Empleado 
{
	
	String cedula;
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private String telefono;
	private String direccion;
	protected String cargo;

	public Empleado() {}
	
	public Empleado(String cedula, String nombre, String apellido, Date fechaDeNacimiento, String telefono,
			String direccion, String cargo) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.telefono = telefono;
		this.direccion = direccion;
		this.cargo = cargo;
	}

	//Sobrecarga porque ya hay otro metodo igual con diferentes parametros
	public double calcularSalario()
	{
		return 0.00;
	}
	public double calcularSalario(double valorExtra)
	{
		return 0.00;
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 50 * hash +Objects.hashCode(this.cedula);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(cedula, other.cedula);
	}

	@Override
	public String toString() {
		return "Empleado [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento="
				+ fechaDeNacimiento + ", telefono=" + telefono + ", direccion=" + direccion + ", cargo=" + cargo + "]";
	}
	
	
	
}
