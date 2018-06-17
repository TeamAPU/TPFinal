/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.controlador.beans.CarteleraBean;
import aplicacion.hibernate.dao.ICarteleraDAO;
import aplicacion.hibernate.dao.imp.CarteleraDAOImp;
import aplicacion.modelo.dominio.Cartelera;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ma Ry Youkai
 */
@ManagedBean
@ViewScoped
public class CarteleraFormBean implements Serializable {

    @ManagedProperty(value = "#{carteleraBean}")
    private CarteleraBean carteleraBean;

    /**
     * Creates a new instance of CarteleraFormBean
     */
    public CarteleraFormBean() {

        carteleraBean = new CarteleraBean();
    }

    public List<Cartelera> obtenerCarteleras() {
        ICarteleraDAO carteleraDAO = new CarteleraDAOImp();
        return carteleraDAO.obtenerTodos();
    }

    public CarteleraBean getCarteleraBean() {
        return carteleraBean;
    }

    public void setCarteleraBean(CarteleraBean carteleraBean) {
        this.carteleraBean = carteleraBean;
    }

}
