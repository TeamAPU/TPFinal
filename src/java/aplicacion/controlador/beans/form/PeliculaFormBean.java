/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.controlador.beans.PeliculaBean;
import aplicacion.hibernate.dao.IPeliculaDAO;
import aplicacion.hibernate.dao.imp.PeliculaDAOImp;
import aplicacion.modelo.dominio.Pelicula;
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
public class PeliculaFormBean implements Serializable {

    @ManagedProperty(value = "#{peliculaBean}")
    private PeliculaBean peliculaBean;
    private List<Pelicula> peliculas;

    /**
     * Creates a new instance of PeliculaFormBean
     */
    public PeliculaFormBean() {
        peliculaBean = new PeliculaBean();
       
    }
    @PostConstruct
    public void init(){
        generarPeliculas();
    }

    public void agregarPelicula() {
        try {

            peliculaBean.getPelicula().setPelCodigo(0);
            peliculaBean.getPelicula().setPelEstado(true);

            IPeliculaDAO peliculaDAO = new PeliculaDAOImp();
            peliculaDAO.agregar(peliculaBean.getPelicula());
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Pelicula Agregada", "Pelicula Agregada");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            System.out.println("agregado");
        } catch (Exception e) {
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "pelicula existente", "pelicula existente");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            System.out.println("No agregado");
        }
        generarPeliculas();
    }

    public void asignarPelicula(Pelicula pelicula){
        peliculaBean.setPelicula(pelicula);
    }
    
    public void modificarPelicula() {
        try {
           
            peliculaBean.modificar();
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Pelicula Modificada", "Pelicula Modificada");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);

        } catch (Exception e) {

            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar", "Error al modificar");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);

        }
        generarPeliculas();

    }

    public void generarPeliculas(){
        
        peliculas = peliculaBean.obtenerPeliculas();
    }
   

    public PeliculaBean getPeliculaBean() {
        return peliculaBean;
    }

    public void setPeliculaBean(PeliculaBean peliculaBean) {
        this.peliculaBean = peliculaBean;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

   

    
}
