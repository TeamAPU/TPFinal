/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.ICarteleraDAO;
import aplicacion.hibernate.dao.imp.CarteleraDAOImp;
import aplicacion.modelo.dominio.Cartelera;
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
public class CarteleraBean implements Serializable{
    
    private Cartelera cartelera;
    
    
    /**
     * Creates a new instance of CarteleraBean
     */
    public CarteleraBean() {
        cartelera = new Cartelera();
    }

   public List<Cartelera> obtenerCarteleras() {
        ICarteleraDAO carteleraDAO = new CarteleraDAOImp();
        return carteleraDAO.obtenerTodos();
    }

    public Cartelera getCartelera() {
        return cartelera;
    }

    public void setCartelera(Cartelera cartelera) {
        this.cartelera = cartelera;
    }
    
    
}
