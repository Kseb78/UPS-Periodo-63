package ec.edu.ups.poo.practica05gui.idao;

import ec.edu.ups.poo.practica05gui.modelo.Prestamo;
import java.util.List;

public interface IPrestamoDAO 
{
    List<Prestamo> obtenerPrestamos();   
    Prestamo obtenerPrestamo(int codigo);   
    void crearPrestamo(Prestamo prestamo);
    boolean actualizarPrestamo(int codigo, Prestamo prestamo);
    boolean eliminarPrestamo(int codigo);    
}
