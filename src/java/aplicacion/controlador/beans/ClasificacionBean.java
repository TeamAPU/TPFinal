/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.IClasificacionDAO;
import aplicacion.hibernate.dao.imp.ClasificacionDAOImp;
import aplicacion.modelo.dominio.Clasificacion;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ma Ry Youkai
 */
@ManagedBean
@ViewScoped
public class ClasificacionBean implements Serializable {

    private Clasificacion clasificacion;

    /**
     * Creates a new instance of ClasificacionBean
     */
    public ClasificacionBean() {
        clasificacion = new Clasificacion();
    }

    
     public void modificar() {
        IClasificacionDAO directorDAO = new ClasificacionDAOImp();
        directorDAO.modificar(clasificacion);
    }
    
    public List<Clasificacion> obtenerClasificacion() {
        IClasificacionDAO clasificacionDAO = new ClasificacionDAOImp();
        return clasificacionDAO.obtenerTodos();
    }
    
    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

}
