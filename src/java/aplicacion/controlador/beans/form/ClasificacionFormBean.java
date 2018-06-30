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
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Ma Ry Youkai
 */
@ManagedBean
@ViewScoped
public class ClasificacionFormBean implements Serializable{

    @ManagedProperty(value = "#{clasificacionBean}")
    private ClasificacionBean clasificacionBean;
    private List<Clasificacion> clasificaciones;
    private String descrip;
   

    /**
     * Creates a new instance of ClasificacionFormBean
     */
    public ClasificacionFormBean() {
        clasificacionBean = new ClasificacionBean();
        
    }
    
    @PostConstruct
    public void init() {
        generarClasificaciones();
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
        generarClasificaciones();
    }
    
    public void asignarClasificacion(Clasificacion clasificacion) {
       clasificacionBean.setClasificacion(clasificacion);
       clasificacionBean.getClasificacion().setClaDescripcion(descrip);
       modificarClasificacion();
    }

    public void modificarClasificacion() {
         try {
            
            clasificacionBean.modificar();
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Pelicula Modificada", "Pelicula Modificada");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            
        } catch (Exception e) {
            
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar", "Error al modificar");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            
        }
        generarClasificaciones();
    }

    public void generarClasificaciones() {
        
        clasificaciones = clasificacionBean.obtenerClasificacion();
    }
    
  
    
    public ClasificacionBean getClasificacionBean() {
        return clasificacionBean;
    }

    public void setClasificacionBean(ClasificacionBean clasificacionBean) {
        this.clasificacionBean = clasificacionBean;
    }

    public List<Clasificacion> getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(List<Clasificacion> clasificaciones) {
        this.clasificaciones = clasificaciones;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

   
    

}
