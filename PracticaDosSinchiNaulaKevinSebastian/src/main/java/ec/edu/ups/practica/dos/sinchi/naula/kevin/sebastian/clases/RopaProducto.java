package ec.edu.ups.practica.dos.sinchi.naula.kevin.sebastian.clases;

public class RopaProducto extends Producto
{
	private String talla;
	private String modelo;
	
	public RopaProducto () {}

	public RopaProducto(String talla, String modelo, String marca, int precio, String nombre) 
	{
		super(marca, precio, nombre);
		this.talla = talla;
		this.modelo = modelo;
	}
	
	public RopaProducto(String talla, String modelo) {
		this.talla = talla;
		this.modelo = modelo;
	}
	

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() 
	{
        return super.toString() + "\n" + "Ropa{" + "talla=" + talla + " modelo="+modelo+'}';
	}
	
}
