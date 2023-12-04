package ec.edu.ups.practica.uno.sinchi.naula.kevin.sebastian.clases;

public class Profesor 
{
	//Definimos la visibilidad en privado para realizar un encapsulamiento.
	private String nombre;
	private int edad;
	private String identificacion;
	private String conocimientos;
	private String especialidades;
	
	public Profesor() {}

	public Profesor(String nombre, int edad, String identificacion, String conocimientos, String especialidades) {
		this.nombre = nombre;
		this.edad = edad;
		this.identificacion = identificacion;
		this.conocimientos = conocimientos;
		this.especialidades = especialidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getConocimientos() {
		return conocimientos;
	}

	public void setConocimientos(String conocimientos) {
		this.conocimientos = conocimientos;
	}

	public String getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}
	@Override
	public String toString()
	{
		return "Nombre del Profesor: "+nombre+"\nEdad del profesor: "+edad+" años"+"\nIdentificacion del Profesor: "
			+identificacion+"\nConocimientos del Profesor: "+conocimientos+"\nEspecialidad del Profesor: "+especialidades+"\n";
	}
}
