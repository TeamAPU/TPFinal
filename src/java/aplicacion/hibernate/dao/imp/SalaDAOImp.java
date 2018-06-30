/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.datos.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.ISalaDAO;
import aplicacion.modelo.dominio.Sala;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Ma Ry Youkai
 */
public class SalaDAOImp implements ISalaDAO{

    @Override
    public List<Sala> obtenerTodos() {
        Session session = HibernateUtil.getSESSION_FACTORY().openSession();
        Criteria criteria = session.createCriteria(Sala.class);
        criteria.add(Restrictions.eq("salEstado", true));
        List salas = criteria.list();
        return salas;
    }
    
}
