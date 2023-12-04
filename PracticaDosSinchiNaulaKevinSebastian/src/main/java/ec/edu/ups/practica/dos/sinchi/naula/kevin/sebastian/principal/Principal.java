package ec.edu.ups.practica.dos.sinchi.naula.kevin.sebastian.principal;
//Importamos el paquete clases y las librerias necesarias.
import java.util.*;
import ec.edu.ups.practica.dos.sinchi.naula.kevin.sebastian.clases.*;

public class Principal { 
			
	public static void main(String[] args) {
	//Uso de la clase escaner, con nombre 'sc'.
	//Instanciamos como un objeto e inicializamos con el uso de un constructor.	
	Scanner sc = new Scanner(System.in);
	
	//Iniciamos contadores e instancias para los objetos.
	int contadorU = 1;
	int a=1;
	float preciototal = 0;
	int cantidadproducto = 0;
	Carrito carrito = new Carrito();
	Usuario us = new Usuario();
	Pedido pd = new Pedido();
	boolean usuarioconf = false;
	//Iniciamos un bucle para que mediante un menu solicitar los datos.
		while (a==1)
		{
				//Pedimos al usuario lo que desea realizar.
	   System.out.println("╔════════════════════════════════════════════════════════════════════════════════╗\r\n"
						+ "║--------------------------Bienvenido al menu de opciones------------------------║\r\n"
						+ "║--------------------------------------------------------------------------------║\r\n"
						+ "║---------------------------1. Ingresar nuevo usuario----------------------------║\r\n"
						+ "║--------------------------2. Ver productos disponibles--------------------------║\r\n"
						+ "║--------------------------3. Ver productos del CARRITO--------------------------║\r\n"
						+ "║------------------------------4. Realizar pedido--------------------------------║\r\n"
						+ "║--------------------------------------------------------------------------------║\r\n"
						+ "║                                   0. SALIR                                     ║\r\n"
						+ "╚════════════════════════════════════════════════════════════════════════════════╝");
	   		//Definimos una variable con la opcion ingresada.
	   		int opmenu1=sc.nextInt();
	   		switch(opmenu1)
	   		{
	   		case 0:
	   			a=0;
	   			break;
	   		case 1:
	   		{	
	   			if (usuarioconf==false)
	   			{
		   		//Pedimos que se ingresen los datos del usuario.
	   			//Para poder establecer los datos ingresados con el objeto.
		   		System.out.println("USUARIO "+contadorU+"\n");
		   	   	System.out.println("Ingrese el nombre del usuario: ");
		   	 	String escanerNombre = sc.next();
	  			us.setNombre(escanerNombre);
			   	System.out.println("Ingrese el correo del usuario: ");
	   		   	String escanerCorreo = sc.next();
		   	   	us.setCorreo(escanerCorreo);
		   	   	System.out.println("Ingrese la cedula del usuario: ");
			   	String escanerCedula = sc.next();
	  		   	us.setCedula(escanerCedula);
	   		   	us.setContadorUsuarios(contadorU);
	   		   	usuarioconf = true;
	   		   	contadorU= contadorU+1;	
	   		   	
	   			//Mostramos los datos con el uso de los getters.
	   		   	System.out.println("Bienvenido "+us.getNombre()+"\nDatos ingresados\n"+us.getCorreo()+"\n"+us.getCedula());
	   			}
	   			else
	   			{
	   				System.out.println("Ya se ha registrado un usuario...");
	   			}
	   			break;
	   		}
	   		case 2:
	   		{
	   			//Si aun no se ha registrado un usuario no se podra acceder a la opcion 2.
	   			if (usuarioconf==false)
	   			{	
	   				System.out.println("Aun no se ha registrado ningun usuario...");
	   			}
	   			else
	   			{	
	   				System.out.println("PRODUCTOS DISPONIBLES POR EL MOMENTO\n1. Electrodomesticos \n2. Ropa");
	   				int opcionmenu2=sc.nextInt();
	   				
	   				switch(opcionmenu2)
	   				{
	   				
	   				case 1:
	   				{
	   					//Para agregar un poco de dinamismo al algoritmo, se empleo el uso del metodo random.
	   					//Para establecer un rango de precio que varia.
	   					int precio_electrodomestico  = (int) (Math.random()*200)+50;
	   					System.out.println("Se ha agregado un electrodomestico al carrito con precio de "+precio_electrodomestico+"$");
	   					//Se establecen los datos del objeto de la clase padre e hija.
	   					String voltaje = "110 V";
	   					String peso = "6,1 Kg";
	   					String marca = "Oster";
	   					String productos ="Licuadora";
	   					
	   					//Variables para poder mostrar los datos.
	   					preciototal = preciototal+precio_electrodomestico;
	   					cantidadproducto = cantidadproducto +1;
	   					
	   					//Relacionamos los datos para realizar la composicion.
	   					carrito.setPrecioTotal(preciototal);
	   					carrito.setCantidadProducto(cantidadproducto);
	   					carrito.setCarritoProductos(productos);
	   					//Con el uso del constructor para agregar un producto heredado
	   					//Establecemos el objeto dentro del carrito.
	   					carrito.agregarProductoElectrodomestico(voltaje,peso,marca,precio_electrodomestico,productos);
	   					break;
	   				}
	   				case 2:
	   				{
	   					int precio_ropa  = (int) (Math.random()*100)+20;
	   					System.out.println("Se ha agregado ropa al carrito con precio de "+precio_ropa+"$");
	   					String talla = "M";
	   					String modelo = "Bp200";
	   					String marca = "Adidas";
	   					String productos ="Camiseta";
	   					preciototal = preciototal+precio_ropa;
	   					cantidadproducto = cantidadproducto +1;
	   					carrito.setPrecioTotal(preciototal);
	   					carrito.setCantidadProducto(cantidadproducto);
	   					carrito.setCarritoProductos(productos);
	   					carrito.agregarProductoRopa(talla,modelo,marca,precio_ropa,productos);
	   					break;
	   				}
	   				
	   				default:
	   				{
	   					System.out.println("Ha ingresado una opcion no valida. Volviendo al menu...\n");
	   					break;
	   				}
	   				}
	   			}
	   			us.agregarCarrito(carrito);
	   			break;
	   		}
	   		case 3:
	   		{
	   			
	   			if (usuarioconf==false)
	   			{
	   				System.out.println("Aun no se ha registrado ningun usuario...");
	   				break;
	   			}
	   			else 
	   			{
	   				//Mostramos los datos del carrito.
	   				System.out.println(carrito);
	   				break;
	   			}
	   		}
	   		case 4:
	   		{
	   			//Pedimos al usuario el metodo de pago.
	   			System.out.println("Ingrese el metodo de pago: \n1. VISA\n2 Paypal");
	   			int metodoPago=sc.nextInt();
	   			if (metodoPago==1)
	   			{
	   				//Establecemos los datos ingresados con el pedido.
	   				String pago = "VISA";
	   				pd.setMetodoPago(pago);
	   				System.out.println("Ingrese su domicilio");
	   				String domicilio = sc.next();
	   				pd.setDomicilio(domicilio);
	   				pd.setCodigoPedido("CD001");
	   				
	   				//Relacionamos el objeto del pedido con el usuario para realizar la agregacion.
	   				pd.setUsuario(us);
	   				
	   				//Mostramos un resumen de todas las interraciones con el programa.
	   				System.out.println("RESUMEN DEL PEDIDO");
	   				System.out.println("Nombre: "+pd.getUsuario().getNombre()+"\nCorreo: "+pd.getUsuario().getCorreo()+"\nCedula: "+pd.getUsuario().getCedula());
	   				System.out.println(carrito);
	   				System.out.println(pd.toString());
	   				break;
	
	   			}
	   			else if (metodoPago==2)
	   			{
	   				String pago = "Paypal";
	   				pd.setMetodoPago(pago);
	   				System.out.println("Ingrese su domicilio");
	   				String domicilio = sc.next();
	   				pd.setDomicilio(domicilio);
	   				pd.setCodigoPedido("CD002");
	   				
	   				pd.setUsuario(us);
	   				
	   				System.out.println("RESUMEN DEL PEDIDO");
	   				System.out.println("Nombre: "+pd.getUsuario().getNombre()+"\nCorreo: "+pd.getUsuario().getCorreo()+"\nCedula: "+pd.getUsuario().getCedula());
	   				System.out.println(carrito);
	   				System.out.println(pd.toString());
	   				break;
	   			}
	   			else
	   			{
	   				System.out.println("Ha ingresado una opcion no valida. Volviendo al menu...\n");
	   				break;
	   			}
	   		}
	   		default:
	   		{
	   			System.out.println("Ha ingresado una opcion no valida. Volviendo al menu...\n");
	   			break;
	   		}
	   		}
		}
	}
}

