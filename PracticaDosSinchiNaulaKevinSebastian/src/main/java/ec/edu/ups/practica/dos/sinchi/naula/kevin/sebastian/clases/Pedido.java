package ec.edu.ups.practica.dos.sinchi.naula.kevin.sebastian.clases;

public class Pedido {
	private String metodoPago;
	private String domicilio;
	private String codigoPedido;
	private Usuario usuario;
	
	public Pedido() {}
	
	public Pedido(String metodoPago, String domicilio, String codigoPedido) {
		this.metodoPago = metodoPago;
		this.domicilio = domicilio;
		this.codigoPedido = codigoPedido;
		
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}	
	public Usuario getUsuario()
	{
		return usuario;
	}
	public void setUsuario(Usuario usuario)
	{
		this.usuario= usuario;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\nMetodo de Pago: ");
		sb.append(metodoPago);
		sb.append("\nDomicilio: ");
		sb.append(domicilio);
		sb.append("\nCodigo del Pedido: ");
		sb.append(codigoPedido);
		
		return sb.toString();
	}
	
	
}
