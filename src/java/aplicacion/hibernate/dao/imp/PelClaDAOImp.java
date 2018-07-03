/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.datos.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IPelClaDAO;
import aplicacion.modelo.dominio.PelCla;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Ma Ry Youkai
 */
public class PelClaDAOImp implements IPelClaDAO{

    @Override
    public PelCla obtenerClasificacion(String nomPelicula) {
        PelCla pelCla = null;
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        Criteria criteria = session.createCriteria(PelCla.class, "p");
        criteria.createAlias("p.pelNombre", "nombre");
        criteria.add(Restrictions.eq("nombre", nomPelicula));
        if (!criteria.list().isEmpty()) {
            pelCla = (PelCla) criteria.list().get(0);
        }
        return pelCla;
    }
    
    
}
