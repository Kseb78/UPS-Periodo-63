package ec.edu.ups.practica.dos.sinchi.naula.kevin.sebastian.clases;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	//Abstraemos los atributos y establecemos el tipo de dato requerido.
	//Definimos la visibilidad en privado para realizar un encapsulamiento.
	private float precioTotal;
	private int cantidadProducto;
	private String carritoProductos;
    //atributo de la relación de Composición
    private List<Producto> productos;
	
    //Iniciamos el constructor instanciando la lista
	public Carrito() {
		this.productos = new ArrayList<>();
	}

	//Usamos los constructores para inicializar las variables de la clase
	//al momento de instanciar un objeto.
	//Igualmente instanciando la lista nuevamente.
	public Carrito(float precioTotal, int cantidadProducto, String carritoProductos) {
		this.precioTotal = precioTotal;
		this.cantidadProducto = cantidadProducto;
		this.carritoProductos = carritoProductos;
		this.productos = new ArrayList<>();
	}

	//Para el proceso de Encapsulamiento usamos getters y setters.
	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String getCarritoProductos() {
		return carritoProductos;
	}

	public void setCarritoProductos(String carritoProductos) {
		this.carritoProductos = carritoProductos;
	}
	
	
	//Aplicamos un metodo para poder agregar los productos que heredan de la clase padre
	//el metodo agregarProductoElectrodomestico de cierta forma es un set.
	public void agregarProductoElectrodomestico(String voltaje, String peso, String marca, int precio, String nombre)
	{
		productos.add(new ElectrodomesticoProducto (voltaje,peso,marca,precio,nombre));
	}

	public void agregarProductoRopa (String talla, String modelo, String marca, int precio, String nombre)
	{
		productos.add(new RopaProducto(talla,modelo,marca,precio,nombre));
	}
	
	//Devolvemos la lista con los productos ya agregados
	public List<Producto> getProductos()
	{
		return productos;	
	}
	
	//Para mostrar los datos, hacemos uso de la object.class con el metodo toString.
	@Override
	public String toString() {
		//Hacemos uso del metodo StringBuilder, para una mejor claridad al momento 
		//de mostrar los datos por consola.
		StringBuilder sb = new StringBuilder();
		sb.append("CARRITO");
		sb.append("\n Producto agregado recientemente: ");
		sb.append(carritoProductos);
		sb.append("\n Cantidad de Productos Totales: ");
		sb.append(cantidadProducto);
		sb.append("\nProductos");
		sb.append(productos);
		sb.append("\n\n TOTAL: ");
		sb.append(precioTotal+" $");
		
		return sb.toString();
	}
	
	
}
