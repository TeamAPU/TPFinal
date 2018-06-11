package aplicacion.modelo.dominio;

import java.io.Serializable;


public class PelCla implements Serializable{

    private Integer pcCodigo;
    private Clasificacion clasificaciones;
    private Pelicula peliculas;
    private boolean pcEstado;

    public PelCla() {
    }

    public PelCla(Integer pcCodigo, Clasificacion clasificaciones, Pelicula peliculas, boolean pcEstado) {
        this.pcCodigo = pcCodigo;
        this.clasificaciones = clasificaciones;
        this.peliculas = peliculas;
        this.pcEstado = pcEstado;
    }

    /**
     * @return the pcCodigo
     */
    public Integer getPcCodigo() {
        return pcCodigo;
    }

    /**
     * @param pcCodigo the pcCodigo to set
     */
    public void setPcCodigo(Integer pcCodigo) {
        this.pcCodigo = pcCodigo;
    }

    /**
     * @return the clasificaciones
     */
    public Clasificacion getClasificaciones() {
        return clasificaciones;
    }

    /**
     * @param clasificaciones the clasificaciones to set
     */
    public void setClasificaciones(Clasificacion clasificaciones) {
        this.clasificaciones = clasificaciones;
    }

    /**
     * @return the peliculas
     */
    public Pelicula getPeliculas() {
        return peliculas;
    }

    /**
     * @param peliculas the peliculas to set
     */
    public void setPeliculas(Pelicula peliculas) {
        this.peliculas = peliculas;
    }

    /**
     * @return the pcEstado
     */
    public boolean isPcEstado() {
        return pcEstado;
    }

    /**
     * @param pcEstado the pcEstado to set
     */
    public void setPcEstado(boolean pcEstado) {
        this.pcEstado = pcEstado;
    }

    
}
