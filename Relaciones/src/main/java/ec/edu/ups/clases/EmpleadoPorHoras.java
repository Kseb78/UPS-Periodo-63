package ec.edu.ups.clases;

import java.util.Date;

public class EmpleadoPorHoras extends Empleado
{
	private int numeroDeHorasTrabajadas;
	private double valorHoraTrabajada;
	private double salario;
	
	public EmpleadoPorHoras() {}

	public EmpleadoPorHoras(int numeroDeHorasTrabajadas, double valorHoraTrabajada,double salario, String cedula, String nombre, String apellido, Date fechaDeNacimiento, String telefono,String direccion,String cargo) {
		super(cedula,nombre,apellido,fechaDeNacimiento,telefono,direccion,cargo);
		this.numeroDeHorasTrabajadas = numeroDeHorasTrabajadas;
		this.valorHoraTrabajada = valorHoraTrabajada;
		this.salario=salario;
	}

	public EmpleadoPorHoras(int numeroDeHorasTrabajadas, double valorHoraTrabajada,double salario) {
		this.numeroDeHorasTrabajadas = numeroDeHorasTrabajadas;
		this.valorHoraTrabajada = valorHoraTrabajada;
		this.salario = salario;
	}

	public int getNumeroDeHorasTrabajadas() {
		return numeroDeHorasTrabajadas;
	}

	public void setNumeroDeHorasTrabajadas(int numeroDeHorasTrabajadas) {
		this.numeroDeHorasTrabajadas = numeroDeHorasTrabajadas;
	}

	public double getValorHoraTrabajada() {
		return valorHoraTrabajada;
	}

	public void setValorHoraTrabajada(double valorHoraTrabajada) {
		this.valorHoraTrabajada = valorHoraTrabajada;
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
		salario = numeroDeHorasTrabajadas*valorHoraTrabajada+salario;
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
        return super.toString() + "\n" + "Empleado{" + "Numero de Horas Trabajadas=" + numeroDeHorasTrabajadas + "Valor Hora Trabajada="+valorHoraTrabajada+" salario="+salario+'}';
	}
	
}
