package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Perfil;
import java.util.List;

public interface IPerfilDAO {

    void agregar(Perfil perfil);

    List<Perfil> obtenerTodos();
}
