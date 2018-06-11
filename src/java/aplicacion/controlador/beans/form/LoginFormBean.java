package aplicacion.controlador.beans.form;

import aplicacion.hibernate.dao.IUsuarioDAO;
import aplicacion.hibernate.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author win7
 */
@ManagedBean
@RequestScoped
public class LoginFormBean {

    private String nombreUsuario;
    private String password;

    public LoginFormBean() {
    }

    public String validarUsuario() {
        String resultado = null;
        IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
        Usuario usuario = usuarioDAO.validarUsuario(nombreUsuario, password);
        if (usuario != null) {
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario valido", "Usuario valido");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);

            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioValidado", usuario);
            resultado = "menu?faces-redirect=true";
        } else {
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Credenciales Invalidas", "Credenciales invalidas");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        }
        return resultado;
    }

    public String getNombreUsuarioValidado() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado");
        return usuario.getNombreUsuario();
    }

    public boolean verificarSesion() {
        boolean sesionValida = false;
        if (FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado") != null) {
            sesionValida = true;
        }
        return sesionValida;
    }

    public String cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sesion Cerrada", "Sesion Cerrada");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);

        String resultado = "/index?faces-redirect=true";
        return resultado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
