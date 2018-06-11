package aplicacion.modelo.dominio;

import java.io.Serializable;

public class Sala implements Serializable {

    private Integer salCodigo;
    private String salNombre;
    private String salDescripcion;
    private boolean salEstado;

    public Sala() {
    }

    public Sala(Integer salCodigo, String salNombre, String salDescripcion, boolean salEstado) {
        this.salCodigo = salCodigo;
        this.salNombre = salNombre;
        this.salDescripcion = salDescripcion;
        this.salEstado = salEstado;
    }

    /**
     * @return the salCodigo
     */
    public Integer getSalCodigo() {
        return salCodigo;
    }

    /**
     * @param salCodigo the salCodigo to set
     */
    public void setSalCodigo(Integer salCodigo) {
        this.salCodigo = salCodigo;
    }

    /**
     * @return the salNombre
     */
    public String getSalNombre() {
        return salNombre;
    }

    /**
     * @param salNombre the salNombre to set
     */
    public void setSalNombre(String salNombre) {
        this.salNombre = salNombre;
    }

    /**
     * @return the salDescripcion
     */
    public String getSalDescripcion() {
        return salDescripcion;
    }

    /**
     * @param salDescripcion the salDescripcion to set
     */
    public void setSalDescripcion(String salDescripcion) {
        this.salDescripcion = salDescripcion;
    }

    /**
     * @return the salEstado
     */
    public boolean isSalEstado() {
        return salEstado;
    }

    /**
     * @param salEstado the salEstado to set
     */
    public void setSalEstado(boolean salEstado) {
        this.salEstado = salEstado;
    }

}
