
package ec.edu.ups.est.dao.vista;

import ec.edu.ups.est.dao.modelo.Prestamo;
import java.util.Date;
import java.util.Scanner;

public class PrestamoVista {
    private Scanner entrada;
    
    
    public PrestamoVista(){
        entrada = new Scanner(System.in);
    }
    public Prestamo ingresarDatosPrestamo(){
        System.out.println("------Ingreso de Nuevo Prestamo------");
        System.out.println("ingresa la fecha del prestamo");        
        Date fechaPrestamo;
        Date fechaDevolucion;
        
            System.out.println("Ingresa el dia: ");
            int dia = entrada.nextInt();
            System.out.println("Ingresa el mes: ");
            int mes = entrada.nextInt();
            System.out.println("Ingresa el año: ");
            int anio = entrada.nextInt();
            fechaPrestamo = new Date(anio, (mes-1), dia);    
            fechaDevolucion = new Date(anio,(mes-1),(dia+4));
        
        return new Prestamo(fechaPrestamo, fechaDevolucion);
    }
    public Prestamo actualizarDatosPrestamo(){
        System.out.println("------Actualizar prestamo------");      
        System.out.println("ingresa la fecha del prestamo");        
        Date fechaPrestamo;
        Date fechaDevolucion;
        
            System.out.println("Ingresa el dia: ");
            int dia = entrada.nextInt();
            System.out.println("Ingresa el mes: ");
            int mes = entrada.nextInt();
            System.out.println("Ingresa el año: ");
            int anio = entrada.nextInt();
            fechaPrestamo = new Date(anio, (mes-1), dia);    
            fechaDevolucion = new Date(anio,(mes-1),(dia+4));
        
        return new Prestamo(fechaPrestamo, fechaDevolucion);
    }
     public Date eliminarDatosPrestamo(){
        System.out.println("eliminar prestamo");
            System.out.println("Ingresa el dia: ");
            int dia = entrada.nextInt();
            System.out.println("Ingresa el mes: ");
            int mes = entrada.nextInt();
            System.out.println("Ingresa el año: ");
            int anio = entrada.nextInt();
            Date fechaPrestamo = new Date(anio, (mes-1), dia); 
        return fechaPrestamo;
    }

    public Date buscarDatosPrestamo(){
        System.out.println("------Buscar Prestamo------");
        System.out.println("Ingresa el dia: ");
        int dia = entrada.nextInt();
        System.out.println("Ingresa el mes: ");
        int mes = entrada.nextInt();
        System.out.println("Ingresa el año: ");
        int anio = entrada.nextInt();
        Date fechaPrestamo = new Date(anio, (mes-1), dia); 
        return fechaPrestamo;

    } 
       
    public void mostrarInformacionPrestamo(Prestamo prestamo){
        System.out.println(prestamo.toString());
    }
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
}
