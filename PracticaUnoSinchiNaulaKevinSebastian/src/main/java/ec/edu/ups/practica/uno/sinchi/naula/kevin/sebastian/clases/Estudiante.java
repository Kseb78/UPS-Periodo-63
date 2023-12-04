package ec.edu.ups.practica.uno.sinchi.naula.kevin.sebastian.clases;

public class Estudiante 
{
	//Abstraemos los atributos y establecemos el tipo de dato requerido.
	//Definimos la visibilidad en privado para realizar un encapsulamiento.
	private String nombre;	
	private int edad;
	private String identificacion;
	
	//Iniciamos un constructor vacio
	public Estudiante() {}
	//Usamos los constructores para inicializar las variables de la clase
	//al momento de instanciar un objeto.
	public Estudiante(String nombre, int edad, String identificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.identificacion = identificacion;
	}
	//Para el proceso de Encapsulamiento usamos getters y setters.
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
	//Para mostrar los datos, hacemos uso de la object.class con el metodo toString.
	@Override
	public String toString()
	{
		//Retornamos los datos necesarios.
		return "Nombre del Estudiante: "+nombre+"\nEdad del Estudiante: "+edad+" años"+"\nIdentificacion del Estudiante: "+identificacion+"\n";
	}
}
