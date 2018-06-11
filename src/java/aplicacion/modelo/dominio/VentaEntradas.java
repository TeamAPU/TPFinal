package aplicacion.modelo.dominio;

import java.io.Serializable;

public class VentaEntradas implements Serializable {

    private Integer venCodigo;
    private ButacaCartelera butacasCarteleras;
    private Perfil perfiles;
    private String venPrecio;
    private String venDescripcion;
    private boolean venEstado;

    public VentaEntradas() {
    }

    public VentaEntradas(Integer venCodigo, ButacaCartelera butacasCarteleras, Perfil perfiles, String venPrecio, String venDescripcion, boolean venEstado) {
        this.venCodigo = venCodigo;
        this.butacasCarteleras = butacasCarteleras;
        this.perfiles = perfiles;
        this.venPrecio = venPrecio;
        this.venDescripcion = venDescripcion;
        this.venEstado = venEstado;
    }

    /**
     * @return the venCodigo
     */
    public Integer getVenCodigo() {
        return venCodigo;
    }

    /**
     * @param venCodigo the venCodigo to set
     */
    public void setVenCodigo(Integer venCodigo) {
        this.venCodigo = venCodigo;
    }

    /**
     * @return the butacasCarteleras
     */
    public ButacaCartelera getButacasCarteleras() {
        return butacasCarteleras;
    }

    /**
     * @param butacasCarteleras the butacasCarteleras to set
     */
    public void setButacasCarteleras(ButacaCartelera butacasCarteleras) {
        this.butacasCarteleras = butacasCarteleras;
    }

    /**
     * @return the perfiles
     */
    public Perfil getPerfiles() {
        return perfiles;
    }

    /**
     * @param perfiles the perfiles to set
     */
    public void setPerfiles(Perfil perfiles) {
        this.perfiles = perfiles;
    }

    /**
     * @return the venPrecio
     */
    public String getVenPrecio() {
        return venPrecio;
    }

    /**
     * @param venPrecio the venPrecio to set
     */
    public void setVenPrecio(String venPrecio) {
        this.venPrecio = venPrecio;
    }

    /**
     * @return the venDescripcion
     */
    public String getVenDescripcion() {
        return venDescripcion;
    }

    /**
     * @param venDescripcion the venDescripcion to set
     */
    public void setVenDescripcion(String venDescripcion) {
        this.venDescripcion = venDescripcion;
    }

    /**
     * @return the venEstado
     */
    public boolean isVenEstado() {
        return venEstado;
    }

    /**
     * @param venEstado the venEstado to set
     */
    public void setVenEstado(boolean venEstado) {
        this.venEstado = venEstado;
    }

}
