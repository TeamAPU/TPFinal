package aplicacion.modelo.dominio;

import java.io.Serializable;

public class Clasificacion implements Serializable {

    private Integer claCodigo;
    private String claDescripcion;
    private boolean claEstado;

    public Clasificacion() {
    }

    public Clasificacion(Integer claCodigo, String claDescripcion, boolean claEstado) {
        this.claCodigo = claCodigo;
        this.claDescripcion = claDescripcion;
        this.claEstado = claEstado;
    }

    /**
     * @return the claCodigo
     */
    public Integer getClaCodigo() {
        return claCodigo;
    }

    /**
     * @param claCodigo the claCodigo to set
     */
    public void setClaCodigo(Integer claCodigo) {
        this.claCodigo = claCodigo;
    }

    /**
     * @return the claDescripcion
     */
    public String getClaDescripcion() {
        return claDescripcion;
    }

    /**
     * @param claDescripcion the claDescripcion to set
     */
    public void setClaDescripcion(String claDescripcion) {
        this.claDescripcion = claDescripcion;
    }

    /**
     * @return the claEstado
     */
    public boolean isClaEstado() {
        return claEstado;
    }

    /**
     * @param claEstado the claEstado to set
     */
    public void setClaEstado(boolean claEstado) {
        this.claEstado = claEstado;
    }

}
