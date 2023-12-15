
package ec.edu.ups.est.dao.dao;

import ec.edu.ups.est.dao.idao.IUsuarioDAO;
import ec.edu.ups.est.dao.modelo.Usuario;
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
    public Usuario obtenerUsuario(String nombre) {
        for(Usuario usuario:listaUsuarios){
            if(usuario.getNombre().equalsIgnoreCase(nombre)){
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
    public boolean actualizarUsuario(String nombre, Usuario usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuarioEncontrado = listaUsuarios.get(i);
            if(usuarioEncontrado.getNombre().equalsIgnoreCase(nombre)){
                listaUsuarios.set(i, usuario);
                return true;
            }            
        }
        return false;    
    }

    @Override
    public boolean eliminarUsuario(String nombre) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuarioEncontrado = listaUsuarios.get(i);
            if(usuarioEncontrado.getNombre().equalsIgnoreCase(nombre)){
                listaUsuarios.remove(i);
                return true;
            }            
        }
        return false;        
    }
    
}
