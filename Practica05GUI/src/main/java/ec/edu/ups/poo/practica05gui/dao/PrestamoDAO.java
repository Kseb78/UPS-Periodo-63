package ec.edu.ups.poo.practica05gui.dao;

import ec.edu.ups.poo.practica05gui.idao.IPrestamoDAO;
import ec.edu.ups.poo.practica05gui.modelo.Prestamo;
import java.util.*;


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
    public Prestamo obtenerPrestamo(int codigo) {        
        for(Prestamo prestamo:listaPrestamos){
            if(prestamo.getCodigo()==codigo){
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
    public boolean actualizarPrestamo(int codigo, Prestamo prestamo) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamoEncontrado = listaPrestamos.get(i);
           if(prestamoEncontrado.getCodigo()==codigo)
                {
                    listaPrestamos.set(i, prestamo);
                    return true;
                }
            }  
        return false;
        }

    @Override
    public boolean eliminarPrestamo(int codigo) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamoEncontrado = listaPrestamos.get(i);
            if(prestamoEncontrado.getCodigo()==codigo){
                listaPrestamos.remove(i);
                return true;
            }            
        }
        return false;
    }     
}
