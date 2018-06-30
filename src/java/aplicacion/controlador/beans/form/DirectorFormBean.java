/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.controlador.beans.DirectorBean;
import aplicacion.hibernate.dao.IDirectorDAO;
import aplicacion.hibernate.dao.imp.DirectorDAOImp;
import aplicacion.modelo.dominio.Director;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
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
public class DirectorFormBean implements Serializable {
    
    @ManagedProperty(value = "#{directorBean}")
    private DirectorBean directorBean;
    private List<Director> directores;

    /**
     * Creates a new instance of DirectorFormBean
     */
    public DirectorFormBean() {
        directorBean = new DirectorBean();
    }
    
    @PostConstruct
    public void init() {
        generarDirectores();
    }
    
    public void agregarDirector(Director director) {
        try {
            
            directorBean.getDirector().setDirCodigo(0);
            directorBean.getDirector().setDirEstado(true);
            IDirectorDAO directorDAO = new DirectorDAOImp();
            directorDAO.agregar(directorBean.getDirector());
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Agregado", "Usuario Agregado");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            System.out.println("agregado");
        } catch (Exception e) {
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario existente", "Usuario existente");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            System.out.println("No agregado");
        }
        generarDirectores();
    }
    
    public void asignarDirector(Director director) {
        directorBean.setDirector(director);
    }
    
    public void modificarDirector() {
        try {
            
            directorBean.modificar();
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Pelicula Modificada", "Pelicula Modificada");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            
        } catch (Exception e) {
            
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar", "Error al modificar");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            
        }
        generarDirectores();
        
    }
    
    public void generarDirectores() {
        
        directores = directorBean.obtenerDirectores();
    }
    
    public DirectorBean getDirectorBean() {
        return directorBean;
    }
    
    public void setDirectorBean(DirectorBean directorBean) {
        this.directorBean = directorBean;
    }
    
    public List<Director> getDirectores() {
        return directores;
    }
    
    public void setDirectores(List<Director> directores) {
        this.directores = directores;
    }
    
}
