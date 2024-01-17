package ec.edu.ups.poo.ficheropoo.clases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class FileControlador {

    public FileControlador(){}
    //Con el uso de la libreria File siempre debe haber un try y catch.
    //Dentro del try se ejectuta el codigo que va a ser evualuado
    //Buscar el archivo con un path absoluto, con try and catch si ocurren errores
    
    public ArrayList listarDirectorios(String ruta)
    {
        ArrayList<String> directorios = new ArrayList<>();
        try{
        File raiz = new File(ruta);
        File [] elementos = raiz.listFiles();
        for (File elemento :elementos)
        {
            if (elemento.isDirectory())
            {
                if(elemento.isHidden()!=true)
                {
                    directorios.add(elemento.getName());
                }
                
            }
        }
        }catch(NullPointerException ex)
        {
            return null;
        }
        return directorios;
    }
    
    public ArrayList listarArchivos(String ruta)
    {
        ArrayList<String> archivos = new ArrayList<>();
        try{
            File raiz = new File(ruta);
            File [] elementos = raiz.listFiles();
            for (File elemento : elementos)
            {
                if(elemento.isFile())
                {
                    if(elemento.isHidden()!=true)
                    {
                        archivos.add(elemento.getName());
                    }
                    
                }
            }        
        }catch (NullPointerException ex)
        {
            return null;
        }
        return archivos;
    }

    public ArrayList listarDirectoriosOcultos(String ruta)
    {
        ArrayList<String> directoriosO = new ArrayList<>();
        try
        {
            File raiz = new File(ruta);
            File [] elementos = raiz.listFiles();
            for (File elemento :elementos)
            {
                if (elemento.isDirectory())
                {
                    if(elemento.isHidden())
                    {
                        directoriosO.add(elemento.getName());
                    }

                }
            }            
        }catch (NullPointerException ex)
        {
            return null;
        }
        return directoriosO;
    }
    
    public ArrayList listarArchivosOcultos(String ruta)
    {
        ArrayList<String> archivosO = new ArrayList<>();
        try{
            File raiz = new File(ruta);
            File [] elementos = raiz.listFiles();
            for (File elemento : elementos)
            {
                if(elemento.isFile())
                {
                    if(elemento.isHidden())
                    {
                        archivosO.add(elemento.getName());
                    }
                    
                }
            }        
        }catch (NullPointerException ex)
        {
            return null;
        }
        return archivosO;        
        
    }
    
    public ArrayList mostrarInformacion(String ruta)
    {
        ArrayList<String> informacion = new ArrayList<>();
        File raiz = new File(ruta);
        String tipoDato = null;
        String nombreTipo = null;
        if(raiz.exists())
        {
            if(raiz.isFile())
            {   
                tipoDato = "Archivo";
                nombreTipo = "Nombre del Archivo: ";
            }
            if(raiz.isDirectory())
            {
                tipoDato = "Directorio";
                nombreTipo = "Nombre del Directorio: ";
            }
                String lecturaDato;
                String escrituraDato;
                String ocultoDato;
                SimpleDateFormat formato = new SimpleDateFormat("MMMM dd, yyyy HH:mm:ss");
                
                informacion.add("Tipo: "+tipoDato);
                informacion.add(nombreTipo+raiz.getName());
                    try{
                        informacion.add("Ruta: "+raiz.getCanonicalPath());

                        informacion.add("Directorio Padre: "+raiz.getParent());
                        informacion.add("Tamaño del archivo: "+raiz.length()+" bytes");
                        if(raiz.canRead())
                            lecturaDato = "Habilitada";
                        else
                            lecturaDato = "Desabilitada";
                        informacion.add("Lectura: "+lecturaDato);
                        if(raiz.canWrite())
                            escrituraDato = "Habilitada";
                        else
                            escrituraDato = "Desabilitada";
                        informacion.add("Escritura: "+escrituraDato);
                        if(raiz.isHidden())
                            ocultoDato = "Habilitado";
                        else
                            ocultoDato = "Desabilitado";
                        informacion.add("Oculto: "+ocultoDato);
                        informacion.add("Modificado: "+formato.format(raiz.lastModified()));
                
                } catch (IOException ex) {
                    System.err.println("Exepcion");
                    ex.printStackTrace(System.out);
                } catch (NullPointerException ex)
                {
                    return null;
                }
               
        }else
            {
                return null;
            }
        return informacion;
    }
    
    
    //Create, update and delete
    
    public boolean crearArchivo(String ruta)
    {
        File elemento = new File(ruta);
        if(elemento.exists())
            return false;
        else
            try {
                elemento.createNewFile();
        } catch (IOException ex) {
            System.err.println("Excepcion");
            ex.printStackTrace(System.out);
        }
        return true;
    }

    public boolean crearDirectorio(String ruta)
    {
        File elemento = new File(ruta);
        if(elemento.exists())
            return false;
        else
          elemento.mkdirs();        
        return true;
    }

    public boolean renombrarElemento(File archivoViejo,File archivoNuevo)
    {
        if(archivoViejo.renameTo(archivoNuevo))
        {
            archivoViejo.renameTo(archivoNuevo);
            return true;
        }else
            return false;              
    }
    
    public boolean eliminarElemento(File directorio)
    {
        try {
            File[] listaElementos = directorio.listFiles();
            //Itera en la los subElementos de la ruta ingresada
            //Y verifica si existe otra carpeta dentro de la principal
            //Si es asi, se vuelve a llamar al metodo esta vez con los datos 
            //De los subElementos, creando un bucle, hasta que no existan mas sub
            //carpetas o archivos, finalmente eliminando desde el final, hacia atras.
            for (File listaElemento : listaElementos) {
                if (listaElemento.isDirectory()) {
                    eliminarElemento(listaElemento);
                }
                listaElemento.delete();
            }   
        directorio.delete(); //Sirve para eliminar la carpeta deseada una vez esta vacia             
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public void eliminarArchivo(File archivo)
    {
        try {
            if (archivo.isFile())
                archivo.delete();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
