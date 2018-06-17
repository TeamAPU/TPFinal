package aplicacion.hibernate.dao.imp;

import aplicacion.datos.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IPerfilDAO;
import aplicacion.modelo.dominio.Perfil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class PerfilDAOImp implements IPerfilDAO {

    @Override
    public void agregar(Perfil perfil) {
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        session.beginTransaction();
        session.save(perfil);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Perfil> obtenerTodos() {
       Session session = HibernateUtil.getSESSION_FACTORY().openSession();
       Criteria criteria = session.createCriteria(Perfil.class);
       criteria.add(Restrictions.eq("estado", true));
       List perfiles = criteria.list();
       return perfiles;
    }
}
