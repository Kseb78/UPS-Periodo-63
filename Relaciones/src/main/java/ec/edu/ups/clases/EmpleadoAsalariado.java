package ec.edu.ups.clases;
import java.util.*;

public class EmpleadoAsalariado extends Empleado
{
	private int aniosAntiguedad;
	private int salario;
	private int cargasFamiliares;
	
	public EmpleadoAsalariado() {}

	public EmpleadoAsalariado(int aniosAntiguedad, int salario, int cargasFamiliares, String cedula, String nombre, String apellido, Date fechaDeNacimiento, String telefono,String direccion,String cargo) {
		super(cedula,nombre,apellido,fechaDeNacimiento,telefono,direccion,cargo);
		this.aniosAntiguedad = aniosAntiguedad;
		this.salario = salario;
		this.cargasFamiliares = cargasFamiliares;
	}
	
	public EmpleadoAsalariado(int aniosAntiguedad, int salario, int cargasFamiliares) {
		this.aniosAntiguedad = aniosAntiguedad;
		this.salario = salario;
		this.cargasFamiliares = cargasFamiliares;
	}
	
	//Sobreescritura del metodo de la clase empleado
	@Override
	public double calcularSalario()
	{
		double pagoAntiguedad = 0.00;
		double pagoCargasFamiliares = 0.00;
		
		if (aniosAntiguedad>= 2 && aniosAntiguedad<=5){
		pagoAntiguedad = 80;
		}else if (aniosAntiguedad>=6 && aniosAntiguedad<=8) {
		pagoAntiguedad = 120;
		}else if (aniosAntiguedad>=9 && aniosAntiguedad<=14) {
		pagoAntiguedad = 130;
		}else if (aniosAntiguedad>=15){
		pagoAntiguedad = 200;
		}
		
		if (cargasFamiliares==1){
			pagoCargasFamiliares = 30;
		}else if (cargasFamiliares==2){
			pagoCargasFamiliares = 70;
		}else if (cargasFamiliares==3){
			pagoCargasFamiliares = 100;
		}
		
		return (salario+pagoAntiguedad+pagoCargasFamiliares);
		}
	
		//Sobrecarga
		public double calcularSalario(double valorExtra)
		{
			return this.calcularSalario()+valorExtra;
		}
	
	public int getAniosAntiguedad() {
		return aniosAntiguedad;
	}

	public void setAniosAntiguedad(int aniosAntiguedad) {
		this.aniosAntiguedad = aniosAntiguedad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getCargasFamiliares() {
		return cargasFamiliares;
	}

	public void setCargasFamiliares(int cargasFamiliares) {
		this.cargasFamiliares = cargasFamiliares;
	}
	
	@Override
	public String toString() 
	{
        return super.toString() + "\n" +"Empleado{" + "años de Antiguedad=" + aniosAntiguedad + " salario="+salario+" Cargas Familiares="+cargasFamiliares+'}';
	}
	
}
