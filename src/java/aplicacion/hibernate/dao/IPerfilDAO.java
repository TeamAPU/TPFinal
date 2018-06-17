package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Perfil;
import java.util.List;

public interface IPerfilDAO {

    public void agregar(Perfil perfil);

    public List<Perfil> obtenerTodos();
}
