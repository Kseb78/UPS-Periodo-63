
package ec.edu.ups.est.dao.dao;

import ec.edu.ups.est.dao.idao.IPrestamoDAO;
import ec.edu.ups.est.dao.modelo.Prestamo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrestamoDAO implements IPrestamoDAO{
    private List<Prestamo> listaPrestamos;

    public PrestamoDAO() {
        listaPrestamos=new ArrayList<>();
    }

    @Override
    public List<Prestamo> obtenerPrestamos() {
        return listaPrestamos;
    }

    @Override
    public Prestamo obtenerPrestamosPorFechaPrestamo(Date fechaPrestamo) {        
        for (Prestamo prestamo : listaPrestamos) {
            if(prestamo.getFechaPrestamo().equals(fechaPrestamo)){
                return prestamo;
            }
        }
        return null;
    }

    @Override
    public Prestamo obtenerPrestamosPorFechaDevolucion(Date fechaDevolucion) {
        for (Prestamo prestamo : listaPrestamos) {
            if(prestamo.getFechaDevolucion().equals(fechaDevolucion)){
                return prestamo;
            }
        }
        return null;    
    }

    @Override
    public void crearPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }

    @Override
    public boolean actualizarPrestamo(Date fechaPrestamo, Prestamo prestamo) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamoEncontrado = listaPrestamos.get(i);
            if(prestamoEncontrado.getFechaPrestamo().equals(fechaPrestamo)){
                listaPrestamos.set(i, prestamo);
                return true;
            }            
        }
        return false;
    }

    @Override
    public boolean eliminarPrestamo(Date fechaPrestamo) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamoEncontrado = listaPrestamos.get(i);
            if(prestamoEncontrado.getFechaPrestamo().equals(fechaPrestamo)){
                listaPrestamos.remove(i);
                return true;
            }            
        }
        return false;
    }  
    

    
}
