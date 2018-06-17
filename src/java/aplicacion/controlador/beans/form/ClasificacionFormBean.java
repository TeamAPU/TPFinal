/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.controlador.beans.ClasificacionBean;
import aplicacion.hibernate.dao.IClasificacionDAO;
import aplicacion.hibernate.dao.imp.ClasificacionDAOImp;
import aplicacion.modelo.dominio.Clasificacion;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Ma Ry Youkai
 */
@ManagedBean
@ViewScoped
public class ClasificacionFormBean implements Serializable{

    @ManagedProperty(value = "#{clasificacionBean}")
    private ClasificacionBean clasificacionBean;
   

    /**
     * Creates a new instance of ClasificacionFormBean
     */
    public ClasificacionFormBean() {
        clasificacionBean = new ClasificacionBean();
        
    }

    public void agregarClasificacion() {
        try {

            clasificacionBean.getClasificacion().setClaCodigo(0);
            clasificacionBean.getClasificacion().setClaEstado(true);

            IClasificacionDAO clasificacionDAO = new ClasificacionDAOImp();
            clasificacionDAO.agregar(clasificacionBean.getClasificacion());
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Clasificacion Agregada", "Clasificacion Agregada");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            System.out.println("agregado");
        } catch (Exception e) {
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Clasificacion existente", "Clasificacion existente");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            System.out.println("No agregado");
        }
    }

    public void modificarClasificacion() {
        clasificacionBean.getClasificacion().setClaEstado(true);
        IClasificacionDAO clasificacionDAO = new ClasificacionDAOImp();
        clasificacionDAO.modificar(clasificacionBean.getClasificacion());
        FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos actualizados", "Datos Actualizados");
        FacesContext.getCurrentInstance().addMessage(null, facesmessage);
    }

    public ClasificacionBean getClasificacionBean() {
        return clasificacionBean;
    }

    public void setClasificacionBean(ClasificacionBean clasificacionBean) {
        this.clasificacionBean = clasificacionBean;
    }

   
    

}
