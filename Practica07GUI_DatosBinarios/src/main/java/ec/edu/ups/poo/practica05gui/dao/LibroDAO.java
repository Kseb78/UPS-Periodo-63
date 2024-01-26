package ec.edu.ups.poo.practica05gui.dao;

import ec.edu.ups.poo.practica05gui.idao.ILibroDAO;
import java.util.List;
import ec.edu.ups.poo.practica05gui.modelo.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LibroDAO implements ILibroDAO{
    private List<Libro> listaLibros;
    
    public LibroDAO() {
        listaLibros=new ArrayList<>();
    }

    @Override
    public List<Libro> obtenerLibros() {
        File archivo = new File("DATOS\\Libros.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            String linea;
            while((linea = br.readLine()) != null)
            {
                String[] datos = linea.split("-");
                int codigo = Integer.valueOf(datos[0]);
                String titulo = datos[1];
                String autor = datos[2];
                int anio = Integer.valueOf(datos[3]);
                boolean disponibilidad = Boolean.parseBoolean(datos[4]);
                Libro libro = new Libro(codigo, titulo, autor, anio, disponibilidad);
                listaLibros.add(libro);
            } 
            br.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaLibros;

    }

    @Override
    public Libro obtenerLibro(String titulo) {
        for(Libro libro:listaLibros){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                return libro;
            }
        }
        return null;    
    }

    @Override
    public Libro obtenerLibro2(String autor) {
        for(Libro libro:listaLibros){
            if(libro.getAutor().equalsIgnoreCase(autor)){
                return libro;
            }
        }
        return null;
    }
    
    @Override
    public Libro obtenerLibro2(int codigo) {
        File archivo = new File("DATOS\\Libros.txt");
        Libro libro = null;
        if(archivo.exists())
        {
                    try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            String linea;
            while((linea = br.readLine()) != null)
            {
                String[] datos = linea.split("-");
                int codiguito = Integer.parseInt(datos[0]);
                String titulo = datos[1];
                String autor = datos[2];
                int anio = Integer.valueOf(datos[3]);
                boolean disponibilidad = Boolean.parseBoolean(datos[4]);               
                if(codiguito==codigo)
                {
                    libro = new Libro(codiguito, titulo, autor, anio, disponibilidad);
                    break;
                }
                
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Excepcion: "+e);
            }
        }
        return libro;
    }

    @Override
    public Libro obtenerLibro(int anio) {
        for(Libro libro:listaLibros){
            if(libro.getAnio()==anio){
                return libro;
            }
        }
        return null;
    }

    @Override
    public boolean crearLibro(Libro libro) {
        try
        {
            File archivo = new File("DATOS//Libros.txt");
            if(archivo.createNewFile())
            {                
                return true;
            }else
            {
                return true;
            }
        }
        catch(FileNotFoundException e1){
        System.out.println("Ruta de archivo no encontrada");
        } catch(IOException e2) {
        System.out.println("Error de escritura");
        } catch(Exception e3) {
        System.out.println("Error General");
        }     
        return false;
    }

    @Override
    public boolean actualizarLibro(int codigo, Libro libro) {
        File archivo = new File("DATOS\\Libros.txt");
        try {
            File archivoNuevo = new File("DATOS\\LibroA.txt");
            BufferedReader br = new BufferedReader(new FileReader("DATOS\\Libros.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNuevo));
            
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                String[] datos = linea.split("-");
                
                int cod = Integer.parseInt(datos[2]);
                String titulo = libro.getTitulo();
                String autor = libro.getAutor();
                int anio = libro.getAnio();
                boolean disponibilidad = libro.isDisponible();               
                if(cod==codigo)
                {
                    bw.write(String.valueOf(cod));
                    bw.write("-");
                    bw.write(titulo);
                    bw.write("-");
                    bw.write(autor);
                    bw.write("-");
                    bw.write(String.valueOf(anio));  
                    bw.write("-");
                    bw.write(String.valueOf(disponibilidad)); 
                    bw.write("\n");
                }else
                {   
                    bw.write(linea);
                    bw.write("\n");
                }
            }
                  bw.close();
                  br.close();

                  if(!archivo.delete())
                  {   System.out.println("No eliminado");
                      return false;}

                  if(!archivoNuevo.renameTo(archivo))
                      return false;

              } catch (Exception e) {
                  System.out.println("Excepcion: "+e);
              }
        return true;  
    }

    @Override
    public boolean eliminarLibro(int codigo) {
        File archivoAnterior = new File("DATOS\\Libros.txt");
        try {
            File archivoNuevo = new File("DATOS\\LibroE.txt");
            BufferedReader br = new BufferedReader(new FileReader("DATOS\\Libros.txt")); 
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNuevo));
            
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                String datos[] = linea.split("-");
                int cod = Integer.parseInt(datos[0]);
                if(cod!=codigo)
                {            
                    bw.write(linea); 
                }else
                {
                    bw.write("\n");
                }
                
            }
            bw.close();
            br.close();            
            
            if(!archivoAnterior.delete())
            {
                System.out.println("No eliminado");
            }

        archivoNuevo.renameTo(archivoAnterior);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}


