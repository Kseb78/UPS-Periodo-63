package ec.edu.ups.clases;

import java.util.Date;

public class EmpleadoPorComision extends Empleado
{
	private double totalDeVentas;
	private double porcentajeComision;
	private double salario;
	
	public EmpleadoPorComision() {}

	public EmpleadoPorComision(double totalDeVentas, double porcentajeComision, double salario, String cedula, String nombre, String apellido, Date fechaDeNacimiento, String telefono,String direccion,String cargo) {
		super(cedula,nombre,apellido,fechaDeNacimiento,telefono,direccion,cargo);
		this.totalDeVentas = totalDeVentas;
		this.porcentajeComision = porcentajeComision;
		this.salario = salario;
	}

	public EmpleadoPorComision(double totalDeVentas, double porcentajeComision, double salario) {
		this.totalDeVentas = totalDeVentas;
		this.porcentajeComision = porcentajeComision;
		this.salario = salario;
	}

	public double getTotalDeVentas() {
		return totalDeVentas;
	}

	public void setTotalDeVentas(double totalDeVentas) {
		this.totalDeVentas = totalDeVentas;
	}

	public double getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public double calcularSalario()
	{
		salario = totalDeVentas*porcentajeComision/100+salario;
		return salario;
	}
	
	//Sobrecarga
	public double calcularSalario(double valorExtra)
	{
		return this.calcularSalario()+valorExtra;
	}
	
	@Override
	public String toString() 
	{
        return super.toString() + "\n" + "Empleado{" + "Total de Ventas=" + totalDeVentas + " Porcentaje Comision="+porcentajeComision+" salario"+salario+'}';
	}
	
	
}
