package ec.edu.ups.practica.dos.sinchi.naula.kevin.sebastian.clases;

public class Producto{
	//Abstraemos los atributos y establecemos el tipo de dato requerido.
	//Definimos la visibilidad en privado para realizar un encapsulamiento.
	private String marca;
	private int precio;
	private String nombre;
	
	//Iniciamos el constructor vacio.
	public Producto() {}

	//Usamos los constructores para inicializar las variables de la clase
	//al momento de instanciar un objeto.
	public Producto(String marca, int precio, String nombre) {
		this.marca = marca;
		this.precio = precio;
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	//Para mostrar los datos, hacemos uso de la object.class con el metodo toString.
	@Override
	public String toString() {
		//Hacemos uso del metodo StringBuilder, para una mejor claridad al momento 
		//de mostrar los datos por consola.
		StringBuilder sb = new StringBuilder();
		sb.append("\n Nombre: ");
		sb.append(nombre);
		sb.append("\n Marca: ");
		sb.append(marca);
		sb.append("\n Precio: ");
		sb.append(precio);
		return sb.toString();
		
	}
	
	
}
