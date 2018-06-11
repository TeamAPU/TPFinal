package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Usuario;

/**
 *
 * @author win7
 */
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
}
