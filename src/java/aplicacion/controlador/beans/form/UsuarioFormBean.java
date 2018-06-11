package aplicacion.controlador.beans.form;

import aplicacion.controlador.beans.UsuarioBean;
import aplicacion.hibernate.dao.IUsuarioDAO;
import aplicacion.hibernate.dao.imp.UsuarioDAOImp;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author win7
 */
@ManagedBean
@RequestScoped
public class UsuarioFormBean {

    @ManagedProperty(value = "#{usuarioBean}")
    private UsuarioBean usuarioBean;

    public UsuarioFormBean() {
    }

    public void actualizarDatos() {
        usuarioBean.getUsuario().setEstado(true);
        IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
        usuarioDAO.modificar(usuarioBean.getUsuario());
        FacesMessage facesmessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos actualizados", "Datos Actualizados");
        FacesContext.getCurrentInstance().addMessage(null, facesmessage);
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }
}
