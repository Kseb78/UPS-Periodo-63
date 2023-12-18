
package ec.edu.ups.est.dao.idao;

import ec.edu.ups.est.dao.modelo.Prestamo;
import ec.edu.ups.est.dao.modelo.Usuario;
import java.util.List;

public interface IUsuarioDAO {
    List<Usuario> obtenerUsuarios();   
    Usuario obtenerUsuario(String nombre); 
    Usuario obtenerUsuarioPorCorreo(String correo); 
    void crearUsuario(Usuario usuario);
    boolean actualizarUsuario(String nombre, Usuario usuario);
    boolean eliminarUsuario(String nombre);
}
