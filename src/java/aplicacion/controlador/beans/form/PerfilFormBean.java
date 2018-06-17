package aplicacion.controlador.beans.form;

import aplicacion.controlador.beans.PerfilBean;
import aplicacion.controlador.beans.UsuarioBean;
import aplicacion.hibernate.dao.IPerfilDAO;
import aplicacion.hibernate.dao.IUsuarioDAO;
import aplicacion.hibernate.dao.imp.PerfilDAOImp;
import aplicacion.hibernate.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Perfil;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PerfilFormBean implements Serializable {

    @ManagedProperty(value = "#{perfilBean}")
    private PerfilBean perfilBean;
    private UsuarioBean usuarioBean;

    public PerfilFormBean() {
        perfilBean = new PerfilBean();
        usuarioBean = new UsuarioBean();
    }

    public void agregarPerfil(Perfil perfil) {
        try {
            usuarioBean.getUsuario().setCodigo(0);
            usuarioBean.getUsuario().setEstado(true);
            usuarioBean.getUsuario().setTipoUsuario("FINAL");
            IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
            usuarioDAO.agregar(usuarioBean.getUsuario());
            perfilBean.getPerfil().setCodigo(0);
            perfilBean.getPerfil().setEstado(true);
            perfilBean.getPerfil().setUsuario(usuarioBean.getUsuario());
            IPerfilDAO perfilDAO = new PerfilDAOImp();
            perfilDAO.agregar(perfilBean.getPerfil());
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Agregado", "Usuario Agregado");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            System.out.println("agregado");
        } catch (Exception e) {
            FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario existente", "Usuario existente");
            FacesContext.getCurrentInstance().addMessage(null, facesmessage);
            System.out.println("No agregado");
        }
    }

    public List<Perfil> obtenerPerfiles() {
        IPerfilDAO perfilDAO = new PerfilDAOImp();
        return perfilDAO.obtenerTodos();
    }

    public PerfilBean getPerfilBean() {
        return perfilBean;
    }

    public void setPerfilBean(PerfilBean perfilBean) {
        this.perfilBean = perfilBean;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

}
