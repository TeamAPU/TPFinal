/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.datos.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IClasificacionDAO;
import aplicacion.modelo.dominio.Clasificacion;
import java.io.Serializable;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Ma Ry Youkai
 */
public class ClasificacionDAOImp implements IClasificacionDAO,Serializable{

    @Override
    public void modificar(Clasificacion clasificacion) {
       Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        session.beginTransaction();
        session.update(clasificacion);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Clasificacion obtenerClasificacion(String nombreClasificacion) {
       Clasificacion clasificacion = null;
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        Criteria criteria = session.createCriteria(Clasificacion.class);
        criteria.add(Restrictions.eq("claDescripcion", nombreClasificacion));
        if (!criteria.list().isEmpty()) {
            clasificacion = (Clasificacion) criteria.list().get(0);
        }
        return clasificacion;
    }

    @Override
    public void agregar(Clasificacion clasificacion) {
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        session.beginTransaction();
        session.save(clasificacion);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Clasificacion validarClasificacion(String claDescripcion) {
         Clasificacion clasificacion = null;
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        Criteria criteria = session.createCriteria(Clasificacion.class);
        criteria.add(Restrictions.eq("claDescripcion", claDescripcion));
        criteria.add(Restrictions.eq("claEstado", true));
        if (!criteria.list().isEmpty()) {
            clasificacion = (Clasificacion) criteria.list().get(0);
        }
        return clasificacion;
    }
    
}
