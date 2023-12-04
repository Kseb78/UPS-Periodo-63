package ec.edu.ups.practica.uno.sinchi.naula.kevin.sebastian.principal;
//Importamos el paquete clases y las librerias necesarias.
import ec.edu.ups.practica.uno.sinchi.naula.kevin.sebastian.clases.*;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) 
	{
		//Uso de la clase escaner, con nombre 'sc'.
		//Instanciamos como un objeto e inicializamos con el uso de un constructor.		
		Scanner sc = new Scanner(System.in);
		
		//Iniciamos un bucle para pedir al usuario lo que necesita.
		while (true)
		{
				//Pedimos al usuario lo que desea agregar.
	   System.out.println("╔════════════════════════════════════════════════════════════════════════════════╗\r\n"
						+ "║--------------------------Bienvenido al menu de opciones------------------------║\r\n"
						+ "║--------------------------------------------------------------------------------║\r\n"
						+ "║------------------------Ingrese 1 para agregar Estudiantes----------------------║\r\n"
						+ "║------------------------Ingrese 2 para agregar Profesores-----------------------║\r\n"
						+ "║------------------------Ingrese 3 para agregar Asignaturas----------------------║\r\n"
						+ "║--------------------------------------------------------------------------------║\r\n"
						+ "╚════════════════════════════════════════════════════════════════════════════════╝");
				//Emparejamos la opcion ingresada con el escaner.
				int opcionAgregar = sc.nextInt();
				
				if (opcionAgregar==1)
				{
					//Pedimos al usuario la cantidad de estudiantes con el uso del escaner.
					System.out.println("Ingresa el numero de estudiantes: ");
					int numeroEstudiantes = sc.nextInt();
					
					//Creamos un arraylist con la cantidad de estudiantes ingresada.
					Estudiante[] estudiante = new Estudiante[numeroEstudiantes];
					
					//Mediante el uso de un bucle pedimos los datos al usuario.
					for  (int i = 0; i < estudiante.length; i++)
					{
						//Instanciamos la nueva persona 'i'.
						estudiante[i] = new Estudiante();
						//Pedimos la informacion y la asociamos con el escaner.
						System.out.println("Ingrese el nombre del Estudiante "+(i+1));
						String escanerNombres = sc.next();
						System.out.println("Ingrese la edad del Estudiante "+(i+1));
						int escanerEdad = sc.nextInt();
						System.out.println("Ingrese la identificacion del Estudiante "+(i+1));
						String escanerIdentificacion = sc.next();
						//Establecemos los datos con la informacion ingresada.
						estudiante[i].setNombre(escanerNombres);
						estudiante[i].setEdad(escanerEdad);
						estudiante[i].setIdentificacion(escanerIdentificacion);
					}
						//Mostramos los datos usando un bucle para la cantidad de estudiantes.
						//Hacemos uso del toString.	
						for (int i = 0; i < estudiante.length ; i++)
						{
							System.out.println(estudiante[i].toString());
						}
					
				}
				else if (opcionAgregar == 2)
				{
					System.out.println("Ingresa el numero de profesores: ");
					int numeroProfesores = sc.nextInt();
					Profesor[] profesor = new Profesor[numeroProfesores];

					for  (int i = 0; i < profesor.length; i++)
					{
						profesor[i] = new Profesor();
						
						System.out.println("Ingrese el nombre del Profesor "+(i+1));
						String escanerNombres = sc.next();
						System.out.println("Ingrese la edad del Profesor "+(i+1));
						int escanerEdad = sc.nextInt();
						System.out.println("Ingrese la identificacion del Profesor "+(i+1));
						String escanerIdentificacion = sc.next();
						System.out.println("Ingrese los conocimientos del Profesor "+(i+1));
						String escanerConocimientos = sc.next();
						System.out.println("Ingrese las especialidades del Profesor "+(i+1));
						String escanerEspecialidades = sc.next();

						profesor[i].setNombre(escanerNombres);
						profesor[i].setEdad(escanerEdad);
						profesor[i].setIdentificacion(escanerIdentificacion);
						profesor[i].setConocimientos(escanerConocimientos);
						profesor[i].setEspecialidades(escanerEspecialidades);
					}
						for (int i = 0; i < profesor.length ; i++)
						{
							System.out.println(profesor[i].toString());
						}
				}
				else if (opcionAgregar == 3)
				{
					System.out.println("Ingresa el numero de asignaturas: ");
					int numeroAsignaturas = sc.nextInt();
					Asignatura[] asignatura = new Asignatura[numeroAsignaturas];
					
					for  (int i = 0; i < asignatura.length; i++)
					{
						asignatura[i] = new Asignatura();
						
						System.out.println("Ingrese el nombre de la Asignatura "+(i+1));
						String escanerNombres = sc.next();
						System.out.println("Ingrese el codigo de la Asignatura "+(i+1));
						String escanerCodigo = sc.next();
						System.out.println("Ingrese una Historia de la Asignatura "+(i+1));
						String escanerHistorias = sc.next();

						asignatura[i].setNombre(escanerNombres);
						asignatura[i].setCodigo(escanerCodigo);
						asignatura[i].setHistorias(escanerHistorias);
					}
						for (int i = 0; i < asignatura.length ; i++)
						{
							System.out.println(asignatura[i].toString());
						}
			
				}
					else 
					{System.out.println("Opcion Incorrecta. Volviendo al menu...");}
		}
	}
}
