package ec.edu.ups.poo.practica05gui.dao;

import ec.edu.ups.poo.practica05gui.idao.IUsuarioDAO;
import ec.edu.ups.poo.practica05gui.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;



public class UsuarioDAO implements IUsuarioDAO{
    private List<Usuario> listaUsuarios;

    public UsuarioDAO() {
        listaUsuarios=new ArrayList<>();
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        return listaUsuarios;
    }

    @Override
    public Usuario obtenerUsuario(String identificacion) {
        for(Usuario usuario:listaUsuarios){
            if(usuario.getIdentificacion().equalsIgnoreCase(identificacion)){
                return usuario;
            }
        }
        return null;    
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
    public void crearUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    @Override
    public boolean actualizarUsuario(String identificacion, Usuario usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuarioEncontrado = listaUsuarios.get(i);
            if(usuarioEncontrado.getIdentificacion().equalsIgnoreCase(identificacion)){
                listaUsuarios.set(i, usuario);
                return true;
            }            
        }
        return false;    
    }

    @Override
    public boolean eliminarUsuario(String identificacion) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuarioEncontrado = listaUsuarios.get(i);
            if(usuarioEncontrado.getIdentificacion().equalsIgnoreCase(identificacion)){
                listaUsuarios.remove(i);
                return true;
            }            
        }
        return false;        
    }
}
