/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.datos.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IPeliculaDAO;
import aplicacion.modelo.dominio.Pelicula;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Ma Ry Youkai
 */
public class PeliculaDAOImp implements IPeliculaDAO {

    @Override
    public List<Pelicula> obtenerPeliculas() {
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        Criteria criteria = session.createCriteria(Pelicula.class);
        criteria.add(Restrictions.eq("pelEstado", true));
        List peliculas = criteria.list();
        return peliculas;
    }

    @Override
    public void agregar(Pelicula pelicula) {
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        session.beginTransaction();
        session.save(pelicula);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarPelicula(Pelicula pelicula) {
       Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        session.beginTransaction();
        session.update(pelicula);
        session.getTransaction().commit();
        session.close();
    }

}
