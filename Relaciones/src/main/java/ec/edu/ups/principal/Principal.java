package ec.edu.ups.principal;
import java.util.*;
import ec.edu.ups.clases.*;
import ec.edu.ups.clases.*;
public class Principal 
{
	public static void main(String[] args) 
	{
		List<Empleado> empleados = new ArrayList<>();
		
		Empleado empleadoUno = new EmpleadoAsalariado(2,450,3,"0164356345","Pepito","Perez",new Date (1999,2,25),"2345678","Cuenca","Cobrador");
		System.out.println(empleadoUno);
		System.out.println("El salario de " +empleadoUno.getNombre()+" es de: " +empleadoUno.calcularSalario()+" $");
		double salariototale1 = empleadoUno.calcularSalario(105.55);
		System.out.println("Y mas su bono es de: "+salariototale1);
		System.out.println(empleadoUno.hashCode());
		
		
		Empleado empleadoDos = new EmpleadoPorComision(15,7,450,"0164356305","Pepito","Perez",new Date (2000,5,20),"2345678","Cuenca","Cobrador");
		System.out.println(empleadoDos);
		System.out.println(empleadoDos.hashCode());
		
		System.out.println(empleadoUno.equals(empleadoDos));
		
		Empleado empleadoTres = new EmpleadoPorHoras(40,3.5,500,"0164356305","Pepito","Perez",new Date (1989,9,15),"2345678","Cuenca","Cobrador");
		
		
		empleados.add(empleadoUno);
		empleados.add(empleadoDos);
		empleados.add(empleadoTres);
		
		/*
		//Casting Implicito
		int num1 = 100;
		long num2 = num1;
		
		//Casting  explicito
		long num3 = 100;
		int num4 = (int) num3;
		
		char c = '0';
		double c1 = (int) c;
		
		System.out.print(num2);
		System.out.print(" "+num4+" ");	
		System.out.print(c+" ");
		System.out.print(c1);*/
		
		for (Empleado empleado : empleados)
		{
			System.out.println(empleado.toString());
			System.out.println(empleado.calcularSalario());
		}
		
	}
}
