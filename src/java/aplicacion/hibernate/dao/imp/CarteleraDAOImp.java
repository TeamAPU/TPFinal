/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.datos.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.ICarteleraDAO;
import aplicacion.modelo.dominio.Cartelera;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Ma Ry Youkai
 */
public class CarteleraDAOImp implements ICarteleraDAO, Serializable {

    @Override
    public List<Cartelera> obtenerTodos() {
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        Criteria criteria = session.createCriteria(Cartelera.class);
        criteria.add(Restrictions.eq("carEstado", true));
        List carteleras = criteria.list();
        return carteleras;
    }

}
