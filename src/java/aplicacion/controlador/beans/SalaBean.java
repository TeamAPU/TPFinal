/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.ISalaDAO;
import aplicacion.hibernate.dao.imp.SalaDAOImp;
import aplicacion.modelo.dominio.Sala;
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
public class SalaBean  implements Serializable{

    private Sala sala;
    /**
     * Creates a new instance of SalaBean
     */
    public SalaBean() {
        sala = new Sala();
    }
     public List<Sala> obtenerSalas() {
        ISalaDAO salaDAO = new SalaDAOImp();
        return salaDAO.obtenerTodos();
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    
}
