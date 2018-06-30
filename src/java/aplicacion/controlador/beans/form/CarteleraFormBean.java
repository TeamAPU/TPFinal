/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.controlador.beans.CarteleraBean;
import aplicacion.controlador.beans.PeliculaBean;
import aplicacion.controlador.beans.SalaBean;
import aplicacion.hibernate.dao.ICarteleraDAO;
import aplicacion.hibernate.dao.imp.CarteleraDAOImp;
import aplicacion.modelo.dominio.Cartelera;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class CarteleraFormBean implements Serializable {

    @ManagedProperty(value = "#{carteleraBean}")
    private CarteleraBean carteleraBean;
    private List<Cartelera> carteleras;
    private List<Cartelera> filtro;
    private PeliculaBean peliculaBean;
    private SalaBean salaBean;
    private int horario1;
    private int horario2;
    private Date filtroFecha;
    private String fechita;
    private String fechita2;
    

    /**
     * Creates a new instance of CarteleraFormBean
     */
    public CarteleraFormBean() {

        carteleraBean = new CarteleraBean();
        carteleras = new ArrayList<>();
        filtro = new ArrayList<>();
        peliculaBean = new PeliculaBean();
        salaBean = new SalaBean();
    }
    @PostConstruct
   public void init() {
        llenarCartelera();
    }

   public void llenarCartelera(){
       carteleras = carteleraBean.obtenerCarteleras();
   }
   
   public void filtroSala1(){
      llenarCartelera();
       filtro.clear();
       for (Cartelera c : carteleras) {
           if(c.getSalas().getSalNombre().equals("Sala1")){
              filtro.add(c);
           }
       }
       carteleras.clear();
       carteleras = filtro;
   }
   public void filtroSala2(){
      llenarCartelera();
       filtro.clear();
       for (Cartelera c : carteleras) {
           if(c.getSalas().getSalNombre().equals("Sala2")){
              filtro.add(c);
           }
       }
       carteleras.clear();
       carteleras = filtro;
   }
   public void filtroSala3(){
      llenarCartelera();
       filtro.clear();
       for (Cartelera c : carteleras) {
           if(c.getSalas().getSalNombre().equals("Sala3")){
              filtro.add(c);
           }
       }
       carteleras.clear();
       carteleras = filtro;
   }
   
   public void filtroHorario(){
       llenarCartelera();
       filtro.clear();
       for (Cartelera c : carteleras) {
           if(Integer.parseInt(c.getCarHorario())>=horario1 && Integer.parseInt(c.getCarHorario())<=horario2 ){
              filtro.add(c);  
           }
       }
       carteleras.clear();
       carteleras = filtro;
 
   }
   
   public void filtroporFecha() throws ParseException{
       SimpleDateFormat fecha = new SimpleDateFormat("yyyy-mm-dd");
       fechita= fecha.format(filtroFecha);
       fechita2=fecha.format(carteleras.get(0).getCarFecha());
       llenarCartelera();
       filtro.clear();
       for (Cartelera c : carteleras) {
           if(c.getCarFecha()==(fecha.parse(fechita))){
              filtro.add(c);
           }
       }
       carteleras.clear();
       carteleras = filtro;
       
   }
   
public void agregar (){
    
     try {
            salaBean.setSala(salaBean.obtenerSalas().get(0));
            carteleraBean.getCartelera().setCarCodigo(0);
            carteleraBean.getCartelera().setCarEstado(true);
            carteleraBean.getCartelera().setSalas(salaBean.getSala());
            ICarteleraDAO carteleraDAO = new CarteleraDAOImp();
            carteleraDAO.agregar(carteleraBean.getCartelera());
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Agregado", "Usuario Agregado");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            System.out.println("agregado");
        } catch (Exception e) {
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario existente", "Usuario existente");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            System.out.println("No agregado");
        }
}

    public CarteleraBean getCarteleraBean() {
        return carteleraBean;
    }

    public void setCarteleraBean(CarteleraBean carteleraBean) {
        this.carteleraBean = carteleraBean;
    }

    public List<Cartelera> getCarteleras() {
        return carteleras;
    }

    public void setCarteleras(List<Cartelera> carteleras) {
        this.carteleras = carteleras;
    }

    public List<Cartelera> getFiltro() {
        return filtro;
    }

    public void setFiltro(List<Cartelera> filtro) {
        this.filtro = filtro;
    }

    public int getHorario1() {
        return horario1;
    }

    public void setHorario1(int horario1) {
        this.horario1 = horario1;
    }

    public int getHorario2() {
        return horario2;
    }

    public void setHorario2(int horario2) {
        this.horario2 = horario2;
    }

    public Date getFiltroFecha() {
        return filtroFecha;
    }

    public void setFiltroFecha(Date filtroFecha) {
        this.filtroFecha = filtroFecha;
    }

    public String getFechita() {
        return fechita;
    }

    public void setFechita(String fechita) {
        this.fechita = fechita;
    }

    public String getFechita2() {
        return fechita2;
    }

    public void setFechita2(String fechita2) {
        this.fechita2 = fechita2;
    }

    
    
}
