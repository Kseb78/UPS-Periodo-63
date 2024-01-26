package ec.edu.ups.poo.practica05gui.dao;

import ec.edu.ups.poo.practica05gui.idao.IUsuarioDAO;
import ec.edu.ups.poo.practica05gui.modelo.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UsuarioDAO implements IUsuarioDAO{
    private List<Usuario> listaUsuarios;

    public UsuarioDAO() {
        listaUsuarios=new ArrayList<>();
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        File archivo = new File("DATOS\\Usuarios.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            String linea;
            while((linea = br.readLine()) != null)
            {
                String[] datos = linea.split("-");
                int identificacion = Integer.parseInt(datos[2]);
                String nombre = datos[1];
                String correo = datos[0];               
                Usuario usuario = new Usuario(correo, nombre, identificacion);
                listaUsuarios.add(usuario);
            }    
            br.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsuarios;
    }

    @Override
    public Usuario obtenerUsuario(int identificacion) {
        File archivo = new File("DATOS\\Usuarios.txt");
        Usuario usuario = null;
        if(archivo.exists())
        {
            try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            String linea;
            while((linea = br.readLine()) != null)
            {
                String[] datos = linea.split("-");
                int codiguito = Integer.parseInt(datos[2]);
                String nombre = datos[1];
                String correo = datos[0];                           
                if(codiguito==identificacion)
                {
                    usuario = new Usuario(correo, nombre, codiguito);
                    break;
                }
                
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Excepcion: "+e);
        }
        }

        return usuario;
    }

    @Override
    public Usuario obtenerUsuarioPorCorreo(String correo) {
for(Usuario usuario:listaUsuarios){
            if(usuario.getCorreo().equalsIgnoreCase(correo)){
                return usuario;
            }
        }
        return null;        
    }

    @Override
    public boolean crearUsuario(Usuario usuario) {
        try
        {
            File archivo = new File("DATOS\\Usuarios.txt");
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
    public boolean actualizarUsuario(int identificacion, Usuario usuario) {
        File archivo = new File("DATOS\\Usuarios.txt");
        try {
            File archivoNuevo = new File("DATOS\\UsuarioA.txt");
            BufferedReader br = new BufferedReader(new FileReader("DATOS\\Usuarios.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNuevo));
            
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                String[] datos = linea.split("-");
                
                int cod = Integer.parseInt(datos[2]);
                String nombre = usuario.getNombre();
                String correo = usuario.getCorreo();
                if(cod==identificacion)
                {
                    bw.write(correo);
                    bw.write("-");
                    bw.write(nombre);
                    bw.write("-");
                    bw.write(String.valueOf(identificacion)); 
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
    public boolean eliminarUsuario(int identificacion) {
        File archivoAnterior = new File("DATOS\\Usuarios.txt");
        try {
            File archivoNuevo = new File("DATOS\\UsuarioE.txt");
            BufferedReader br = new BufferedReader(new FileReader("DATOS\\Usuarios.txt")); 
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNuevo));
            
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                String datos[] = linea.split("-");
                int cod = Integer.parseInt(datos[2]);
                if(cod!=identificacion)
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
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
