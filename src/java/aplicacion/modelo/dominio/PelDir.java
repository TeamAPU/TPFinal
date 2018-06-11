package aplicacion.modelo.dominio;

import java.io.Serializable;

public class PelDir implements Serializable {
    private Integer pdCodigo;
    private Director directores;
    private Pelicula peliculas;
    private boolean pdEstado;

    public PelDir() {
    }

    public PelDir(Integer pdCodigo, Director directores, Pelicula peliculas, boolean pdEstado) {
        this.pdCodigo = pdCodigo;
        this.directores = directores;
        this.peliculas = peliculas;
        this.pdEstado = pdEstado;
    }

    /**
     * @return the pdCodigo
     */
    public Integer getPdCodigo() {
        return pdCodigo;
    }

    /**
     * @param pdCodigo the pdCodigo to set
     */
    public void setPdCodigo(Integer pdCodigo) {
        this.pdCodigo = pdCodigo;
    }

    /**
     * @return the directores
     */
    public Director getDirectores() {
        return directores;
    }

    /**
     * @param directores the directores to set
     */
    public void setDirectores(Director directores) {
        this.directores = directores;
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
     * @return the pdEstado
     */
    public boolean isPdEstado() {
        return pdEstado;
    }

    /**
     * @param pdEstado the pdEstado to set
     */
    public void setPdEstado(boolean pdEstado) {
        this.pdEstado = pdEstado;
    }

}
