package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Usuario;

public interface IUsuarioDAO {

    /**
     * Valida la existencia de un usuario
     *
     * @param nombreUsuario
     * @param password
     * @return null si no existe
     */
    Usuario validarUsuario(String nombreUsuario, String password);

    void modificar(Usuario unUsuario);

    Usuario obtenerUsuario(String nombreUsuario);
    
    void agregar(Usuario usuario);
    
}
