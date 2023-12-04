package ec.edu.ups.practica.dos.sinchi.naula.kevin.sebastian.clases;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	//Abstraemos los atributos y establecemos el tipo de dato requerido.
	//Definimos la visibilidad en privado para realizar un encapsulamiento.
	private String nombre;
	private String correo;
	private String cedula;
	private int contadorUsuarios;
	//atributo de la relación de Agregación
	private List<Carrito> carritos;
	
	//Iniciamos el constructor instanciando la lista
	public Usuario() {
		this.carritos = new ArrayList <>();
	}

	//Usamos los constructores para inicializar las variables de la clase
	//al momento de instanciar un objeto.
	//Igualmente instanciando la lista nuevamente.
	public Usuario(String nombre, String correo, String cedula, int contadorUsuarios) {
		this.nombre = nombre;
		this.correo = correo;
		this.cedula = cedula;
		this.contadorUsuarios = contadorUsuarios;
		this.carritos = new ArrayList <>();
	}

	//Para el proceso de Encapsulamiento usamos getters y setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getContadorUsuarios() {
		return contadorUsuarios;
	}

	public void setContadorUsuarios(int contadorUsuarios) {
		this.contadorUsuarios = contadorUsuarios;
	}
	
	public void agregarCarrito (Carrito car)
	{
		carritos.add(car);
	}

	//Para mostrar los datos, hacemos uso de la object.class con el metodo toString.
	@Override
	public String toString() {
		//Hacemos uso del metodo StringBuilder, para una mejor claridad al momento 
		//de mostrar los datos por consola.
		StringBuilder sb = new StringBuilder();  
		sb.append("\nUSUARIO "+contadorUsuarios);
		sb.append("\n Nombre: ");
		sb.append(nombre);
		sb.append("\n Correo: ");
		sb.append(correo);
		sb.append("\n Cedula: ");
		sb.append(cedula);
		sb.append("\nCarrito");
		sb.append(carritos);
		
		return sb.toString();
		
	}
}
