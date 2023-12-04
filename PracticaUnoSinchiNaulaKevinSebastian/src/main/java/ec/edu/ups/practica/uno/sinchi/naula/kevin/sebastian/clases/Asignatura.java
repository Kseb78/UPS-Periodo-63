package ec.edu.ups.practica.uno.sinchi.naula.kevin.sebastian.clases;

public class Asignatura 
{
	//Definimos la visibilidad en privado para realizar un encapsulamiento.
	private String nombre;
	private String codigo;
	private String historias;
	
	public Asignatura() {}

	public Asignatura(String nombre, String codigo, String historias) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.historias=historias;
	}
	public String getHistorias() {
		return historias;
	}
	public void setHistorias (String historias) {
		this.historias=historias;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString()
	{
		return "Nombre de la Asignatura: "+nombre+"\nCodigo de la Asignatura: "+codigo+"\nHistorias: "+historias;
	}
	
}
