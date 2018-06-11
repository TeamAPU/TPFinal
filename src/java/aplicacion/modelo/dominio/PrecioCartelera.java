package aplicacion.modelo.dominio;

import java.io.Serializable;

public class PrecioCartelera implements Serializable {

    private Integer preCodigo;
    private Cartelera carteleras;
    private String preDescripcion;
    private double prePrecio;

    public PrecioCartelera() {
    }

    public PrecioCartelera(Integer preCodigo, Cartelera carteleras, String preDescripcion, double prePrecio) {
        this.preCodigo = preCodigo;
        this.carteleras = carteleras;
        this.preDescripcion = preDescripcion;
        this.prePrecio = prePrecio;
    }

    /**
     * @return the preCodigo
     */
    public Integer getPreCodigo() {
        return preCodigo;
    }

    /**
     * @param preCodigo the preCodigo to set
     */
    public void setPreCodigo(Integer preCodigo) {
        this.preCodigo = preCodigo;
    }

    /**
     * @return the carteleras
     */
    public Cartelera getCarteleras() {
        return carteleras;
    }

    /**
     * @param carteleras the carteleras to set
     */
    public void setCarteleras(Cartelera carteleras) {
        this.carteleras = carteleras;
    }

    /**
     * @return the preDescripcion
     */
    public String getPreDescripcion() {
        return preDescripcion;
    }

    /**
     * @param preDescripcion the preDescripcion to set
     */
    public void setPreDescripcion(String preDescripcion) {
        this.preDescripcion = preDescripcion;
    }

    /**
     * @return the prePrecio
     */
    public double getPrePrecio() {
        return prePrecio;
    }

    /**
     * @param prePrecio the prePrecio to set
     */
    public void setPrePrecio(double prePrecio) {
        this.prePrecio = prePrecio;
    }

}
