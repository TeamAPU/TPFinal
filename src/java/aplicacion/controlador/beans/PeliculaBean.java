/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.IPeliculaDAO;
import aplicacion.hibernate.dao.imp.PeliculaDAOImp;
import aplicacion.modelo.dominio.Pelicula;
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
public class PeliculaBean implements Serializable {

    private Pelicula pelicula;

    /**
     * Creates a new instance of PeliculaBean
     */
    public PeliculaBean() {
        pelicula = new Pelicula();
    }

    public void modificar() {
        IPeliculaDAO peliculaDAO = new PeliculaDAOImp();
        peliculaDAO.modificarPelicula(pelicula);
    }

     public List<Pelicula> obtenerPeliculas() {
        IPeliculaDAO peliculaDAO = new PeliculaDAOImp();
        return peliculaDAO.obtenerPeliculas();
    }
    
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

}
