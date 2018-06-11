package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.IUsuarioDAO;
import aplicacion.hibernate.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author win7
 */
@ManagedBean
@RequestScoped
public class UsuarioBean {

    private Usuario usuario;

    public UsuarioBean() {
        Usuario usuarioSesion = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado");
        if (usuarioSesion != null) {
            String nombreUsuario = usuarioSesion.getNombreUsuario();
            IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
            usuario = usuarioDAO.obtenerUsuario(nombreUsuario);
//            if (usuario.getNombreUsuario() == null) {
//                usuario.setPersona(new Persona());
//            }
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
