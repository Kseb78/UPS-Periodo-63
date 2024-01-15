package ec.edu.ups.poo.practica05gui.idao;

import ec.edu.ups.poo.practica05gui.modelo.Usuario;
import java.util.List;

public interface IUsuarioDAO {
    List<Usuario> obtenerUsuarios();   
    Usuario obtenerUsuario(String identificaion); 
    Usuario obtenerUsuarioPorCorreo(String correo); 
    void crearUsuario(Usuario usuario);
    boolean actualizarUsuario(String nombre, Usuario usuario);
    boolean eliminarUsuario(String nombre);
}
