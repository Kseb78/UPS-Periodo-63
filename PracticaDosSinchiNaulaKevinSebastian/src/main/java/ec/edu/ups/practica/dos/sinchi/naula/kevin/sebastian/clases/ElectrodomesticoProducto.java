package ec.edu.ups.practica.dos.sinchi.naula.kevin.sebastian.clases;

import java.util.List;

//Definimos a la clase hija con extends.
public class ElectrodomesticoProducto extends Producto
{
	//Abstraemos los atributos y establecemos el tipo de dato requerido.
	//Definimos la visibilidad en privado para realizar un encapsulamiento.
	private String voltaje;
	private String peso;
	
	//Iniciamos el constructor vacio.
	public ElectrodomesticoProducto() {}

	//Iniciamos un constructor con los atributos de la clase padre, usando la palabra reservada 'super'.
	public ElectrodomesticoProducto(String voltaje, String peso, String marca, int precio, String nombre) {
		super(marca, precio, nombre);
		this.voltaje = voltaje;
		this.peso = peso;
	}

	//Iniciamos un constructor con solo los atributos de la clase hija.
	public ElectrodomesticoProducto(String voltaje, String peso) {
		this.voltaje = voltaje;
		this.peso = peso;
	}

	public String getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(String voltaje) {
		this.voltaje = voltaje;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	
	//Para mostrar los datos, hacemos uso de la object.class con el metodo toString.
	@Override
	public String toString() 
	{
		//Para mostrar los datos de la clase padre e hija, usamos un super.toString()
        return super.toString() + "\n" + "Electrodomestico{" + "voltaje=" + voltaje + " peso="+peso+'}';
	}	
	
	
}
