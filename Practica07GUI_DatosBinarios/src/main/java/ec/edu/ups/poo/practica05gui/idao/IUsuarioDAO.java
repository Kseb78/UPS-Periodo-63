package ec.edu.ups.poo.practica05gui.idao;

import ec.edu.ups.poo.practica05gui.modelo.Usuario;
import java.util.List;

public interface IUsuarioDAO {
    List<Usuario> obtenerUsuarios();   
    Usuario obtenerUsuario(int identificaion); 
    Usuario obtenerUsuarioPorCorreo(String correo); 
    boolean crearUsuario(Usuario usuario);
    boolean actualizarUsuario(int identificaion, Usuario usuario);
    boolean eliminarUsuario(int identificaion);
}
