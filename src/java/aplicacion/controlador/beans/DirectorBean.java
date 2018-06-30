/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.IDirectorDAO;
import aplicacion.hibernate.dao.imp.DirectorDAOImp;
import aplicacion.modelo.dominio.Director;
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
public class DirectorBean implements Serializable{

    private Director director; 
    /**
     * Creates a new instance of DirectorBean
     */
    public DirectorBean() {
        director = new Director();
       
    }

    public void modificar() {
        IDirectorDAO directorDAO = new DirectorDAOImp();
        directorDAO.modificarDirector(director);
    }

     public List<Director> obtenerDirectores() {
        IDirectorDAO directorDAO = new DirectorDAOImp();
        return directorDAO.obtenerTodos();
    }
    
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
    
}
