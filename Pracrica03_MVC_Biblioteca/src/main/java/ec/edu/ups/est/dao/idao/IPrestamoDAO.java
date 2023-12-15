
package ec.edu.ups.est.dao.idao;

import ec.edu.ups.est.dao.modelo.Prestamo;
import java.util.Date;
import java.util.List;

public interface IPrestamoDAO {
    List<Prestamo> obtenerPrestamos();   
    Prestamo obtenerPrestamosPorFechaPrestamo(Date fechaPrestamo);   
    Prestamo obtenerPrestamosPorFechaDevolucion(Date fechaDevolucion);
    void crearPrestamo(Prestamo prestamo);
    boolean actualizarPrestamo(Date fechaPrestamo, Prestamo prestamo);
    boolean eliminarPrestamo(Date fechaPrestamo);
    
}
