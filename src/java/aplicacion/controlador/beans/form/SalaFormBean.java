/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.controlador.beans.SalaBean;
import aplicacion.modelo.dominio.Sala;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ma Ry Youkai
 */
@ManagedBean
@ViewScoped
public class SalaFormBean implements Serializable{

    
    @ManagedProperty(value = "#{salaBean}")
    private SalaBean salaBean;
    private List<Sala> salas;
    
    /**
     * Creates a new instance of SalaFormBean
     */
    public SalaFormBean() {
        salaBean = new SalaBean();
        salas = new ArrayList<>();
    }

     @PostConstruct
    public void init() {
        llenarSalas();
    }
    
    public void llenarSalas(){
        salas=salaBean.obtenerSalas();
    }
    public SalaBean getSalaBean() {
        return salaBean;
    }

    public void setSalaBean(SalaBean salaBean) {
        this.salaBean = salaBean;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

   
    
}
