package ec.edu.ups.poo.practica05gui.dao;

import ec.edu.ups.poo.practica05gui.idao.IBibliotecaDAO;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.poo.practica05gui.modelo.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BibliotecaDAO implements IBibliotecaDAO{
    private List<Biblioteca> listaBibliotecas;
    private List<Libro> listaLibros;
    
    public BibliotecaDAO() {
        listaBibliotecas=new ArrayList<>();
        listaLibros = new ArrayList<>();
    }
    

    @Override
    public List<Biblioteca> obtenerBibliotecas() {
        File archivo = new File("DATOS\\Bibliotecas.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            String linea;
            while((linea = br.readLine()) != null)
            {
                String[] datos = linea.split("-");
                int codigo = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String direccion = datos[2];
                String telefono = datos[3];
                Biblioteca biblioteca = new Biblioteca(codigo, nombre, direccion, telefono);
                listaBibliotecas.add(biblioteca);
            }         
            br.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BibliotecaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaBibliotecas;
    }

    @Override
    public Biblioteca obtenerBiblioteca(int codigo) {
        File archivo = new File("DATOS\\Bibliotecas.txt");
        Biblioteca biblioteca = null;
        if (archivo.exists())
        {
            try {
                BufferedReader br = new BufferedReader(new FileReader(archivo));

                String linea;
                while((linea = br.readLine()) != null)
                {
                    String[] datos = linea.split("-");
                    int codiguito = Integer.parseInt(datos[0]);
                    String nombre = datos[1];
                    String direccion = datos[2];
                    String telefono = datos[3];               
                    if(codiguito==codigo)
                    {
                        biblioteca = new Biblioteca(codiguito, nombre, direccion, telefono);
                        break;
                    }
                }
                br.close();
            } catch (IOException | NumberFormatException e) {
                System.out.println("Excepcion: "+e);
            }        
        }

        return biblioteca;
    }

    @Override
    public boolean crearBiblioteca(Biblioteca biblioteca) { 
        try
        {
            File archivo = new File("DATOS//Bibliotecas.txt");
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
    public boolean actualizarBiblioteca(int codigo, Biblioteca biblioteca) {
        File archivo = new File("DATOS\\Bibliotecas.txt");
        try {
            File archivoNuevo = new File("DATOS\\BibliotecaA.txt");
            BufferedReader br = new BufferedReader(new FileReader("DATOS\\Bibliotecas.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNuevo));
            
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                String[] datos = linea.split("-");
                
                int cod = Integer.parseInt(datos[0]);
                String nombre = biblioteca.getNombre();
                String direccion = biblioteca.getDireccion();
                String telefono = biblioteca.getTelefono();                
                if(cod==codigo)
                {
                    bw.write(String.valueOf(cod));
                    bw.write("-");
                    bw.write(nombre);
                    bw.write("-");
                    bw.write(direccion);
                    bw.write("-");
                    bw.write(telefono);  
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
    public boolean eliminarBiblioteca(int codigo) {
        File archivoAnterior = new File("DATOS\\Bibliotecas.txt");
        try {
            File archivoNuevo = new File("DATOS\\BibliotecaE.txt");
            BufferedReader br = new BufferedReader(new FileReader("DATOS\\Bibliotecas.txt")); 
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
            br.close();
            bw.close();
            
            if(!archivoAnterior.delete())
            {
                System.out.println("No eliminado");
            }
                
            archivoNuevo.renameTo(archivoAnterior);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BibliotecaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return true;
    }    
    
    @Override
    public void agregarLibro(Libro libro)
    {
        listaLibros.add(libro);
    }
    
    @Override
    public List<Libro> obtenerLibros()
    {
        return listaLibros;
    }
    
    
        public void encontrarMetodo()
    {
        String methodName = new Object() {}
                                .getClass()
                                .getEnclosingMethod()
                                .getName();

        System.out.println("Current Method is " + methodName);
    }
}
