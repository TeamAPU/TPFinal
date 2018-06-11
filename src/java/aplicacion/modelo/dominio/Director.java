package aplicacion.modelo.dominio;

import java.io.Serializable;

public class Director implements Serializable {

    private Integer dirCodigo;
    private String dirApellidos;
    private String dirNombres;
    private boolean dirEstado;

    public Director() {
    }

    public Director(Integer dirCodigo, String dirApellidos, String dirNombres, boolean dirEstado) {
        this.dirCodigo = dirCodigo;
        this.dirApellidos = dirApellidos;
        this.dirNombres = dirNombres;
        this.dirEstado = dirEstado;
    }

    /**
     * @return the dirCodigo
     */
    public Integer getDirCodigo() {
        return dirCodigo;
    }

    /**
     * @param dirCodigo the dirCodigo to set
     */
    public void setDirCodigo(Integer dirCodigo) {
        this.dirCodigo = dirCodigo;
    }

    /**
     * @return the dirApellidos
     */
    public String getDirApellidos() {
        return dirApellidos;
    }

    /**
     * @param dirApellidos the dirApellidos to set
     */
    public void setDirApellidos(String dirApellidos) {
        this.dirApellidos = dirApellidos;
    }

    /**
     * @return the dirNombres
     */
    public String getDirNombres() {
        return dirNombres;
    }

    /**
     * @param dirNombres the dirNombres to set
     */
    public void setDirNombres(String dirNombres) {
        this.dirNombres = dirNombres;
    }

    /**
     * @return the dirEstado
     */
    public boolean isDirEstado() {
        return dirEstado;
    }

    /**
     * @param dirEstado the dirEstado to set
     */
    public void setDirEstado(boolean dirEstado) {
        this.dirEstado = dirEstado;
    }

}
