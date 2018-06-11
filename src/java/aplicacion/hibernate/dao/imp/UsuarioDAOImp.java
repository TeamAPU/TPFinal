package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.dao.IUsuarioDAO;
import aplicacion.datos.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Usuario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author win7
 */
public class UsuarioDAOImp implements IUsuarioDAO {

    @Override
    public Usuario validarUsuario(String nombreUsuario, String password) {
        Usuario usuario = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("nombreUsuario", nombreUsuario));
        criteria.add(Restrictions.eq("password", password));
        criteria.add(Restrictions.eq("estado", true));
        if (!criteria.list().isEmpty()) {
            usuario = (Usuario) criteria.list().get(0);
        }
        return usuario;
    }

    @Override
    public void modificar(Usuario unUsuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(unUsuario);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Usuario obtenerUsuario(String nombreUsuario) {
        Usuario usuario = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("nombreUsuario", nombreUsuario));
        if (!criteria.list().isEmpty()) {
            usuario = (Usuario) criteria.list().get(0);
        }
        return usuario;
    }

}
