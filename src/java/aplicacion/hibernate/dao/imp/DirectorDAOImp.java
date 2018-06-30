/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.datos.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IDirectorDAO;
import aplicacion.modelo.dominio.Director;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Ma Ry Youkai
 */
public class DirectorDAOImp implements IDirectorDAO {

    @Override
    public void agregar(Director director) {
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        session.beginTransaction();
        session.save(director);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Director> obtenerTodos() {
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        Criteria criteria = session.createCriteria(Director.class);
        criteria.add(Restrictions.eq("dirEstado", true));
        List directores = criteria.list();
        return directores;
    }

    @Override
    public void modificarDirector(Director director) {
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        session.beginTransaction();
        session.update(director);
        session.getTransaction().commit();
        session.close();
    }

}
