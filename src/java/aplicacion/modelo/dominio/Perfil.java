package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

public class Perfil implements Serializable{

    private Integer perCodigo;
    private Usuario usuario;
    private String perNombres;
    private String perApellidos;
    private String perDni;
    private Date perFechaNac;
    private String perEmail;
    private String perDireccion;
    private boolean perEstado;

    public Perfil() {
    }

    public Perfil(Integer perCodigo, Usuario usuarios, String perNombres, String perApellidos, String perDni, Date perFechaNac, String perEmail, String perDireccion, boolean perEstado) {
        this.perCodigo = perCodigo;
        this.usuario = usuarios;
        this.perNombres = perNombres;
        this.perApellidos = perApellidos;
        this.perDni = perDni;
        this.perFechaNac = perFechaNac;
        this.perEmail = perEmail;
        this.perDireccion = perDireccion;
        this.perEstado = perEstado;
    }

    /**
     * @return the perCodigo
     */
    public Integer getPerCodigo() {
        return perCodigo;
    }

    /**
     * @param perCodigo the perCodigo to set
     */
    public void setPerCodigo(Integer perCodigo) {
        this.perCodigo = perCodigo;
    }

    /**
     * @return the usuarios
     */
    public Usuario getUsuarios() {
        return usuario;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(Usuario usuarios) {
        this.usuario = usuarios;
    }

    /**
     * @return the perNombres
     */
    public String getPerNombres() {
        return perNombres;
    }

    /**
     * @param perNombres the perNombres to set
     */
    public void setPerNombres(String perNombres) {
        this.perNombres = perNombres;
    }

    /**
     * @return the perApellidos
     */
    public String getPerApellidos() {
        return perApellidos;
    }

    /**
     * @param perApellidos the perApellidos to set
     */
    public void setPerApellidos(String perApellidos) {
        this.perApellidos = perApellidos;
    }

    /**
     * @return the perDni
     */
    public String getPerDni() {
        return perDni;
    }

    /**
     * @param perDni the perDni to set
     */
    public void setPerDni(String perDni) {
        this.perDni = perDni;
    }

    /**
     * @return the perFechaNac
     */
    public Date getPerFechaNac() {
        return perFechaNac;
    }

    /**
     * @param perFechaNac the perFechaNac to set
     */
    public void setPerFechaNac(Date perFechaNac) {
        this.perFechaNac = perFechaNac;
    }

    /**
     * @return the perEmail
     */
    public String getPerEmail() {
        return perEmail;
    }

    /**
     * @param perEmail the perEmail to set
     */
    public void setPerEmail(String perEmail) {
        this.perEmail = perEmail;
    }

    /**
     * @return the perDireccion
     */
    public String getPerDireccion() {
        return perDireccion;
    }

    /**
     * @param perDireccion the perDireccion to set
     */
    public void setPerDireccion(String perDireccion) {
        this.perDireccion = perDireccion;
    }

    /**
     * @return the perEstado
     */
    public boolean isPerEstado() {
        return perEstado;
    }

    /**
     * @param perEstado the perEstado to set
     */
    public void setPerEstado(boolean perEstado) {
        this.perEstado = perEstado;
    }
    
    
}
