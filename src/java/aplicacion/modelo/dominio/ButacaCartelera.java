package aplicacion.modelo.dominio;

import java.io.Serializable;

public class ButacaCartelera implements Serializable {

    private Integer bcCodigo;
    private Cartelera carteleras;
    private String bcIdentificadorButaca;
    private boolean bcDisponible;
    private boolean bcEstado;

    public ButacaCartelera() {
    }

    public ButacaCartelera(Integer bcCodigo, Cartelera carteleras, String bcIdentificadorButaca, boolean bcDisponible, boolean bcEstado) {
        this.bcCodigo = bcCodigo;
        this.carteleras = carteleras;
        this.bcIdentificadorButaca = bcIdentificadorButaca;
        this.bcDisponible = bcDisponible;
        this.bcEstado = bcEstado;
    }

    /**
     * @return the bcCodigo
     */
    public Integer getBcCodigo() {
        return bcCodigo;
    }

    /**
     * @param bcCodigo the bcCodigo to set
     */
    public void setBcCodigo(Integer bcCodigo) {
        this.bcCodigo = bcCodigo;
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
     * @return the bcIdentificadorButaca
     */
    public String getBcIdentificadorButaca() {
        return bcIdentificadorButaca;
    }

    /**
     * @param bcIdentificadorButaca the bcIdentificadorButaca to set
     */
    public void setBcIdentificadorButaca(String bcIdentificadorButaca) {
        this.bcIdentificadorButaca = bcIdentificadorButaca;
    }

    /**
     * @return the bcDisponible
     */
    public boolean isBcDisponible() {
        return bcDisponible;
    }

    /**
     * @param bcDisponible the bcDisponible to set
     */
    public void setBcDisponible(boolean bcDisponible) {
        this.bcDisponible = bcDisponible;
    }

    /**
     * @return the bcEstado
     */
    public boolean isBcEstado() {
        return bcEstado;
    }

    /**
     * @param bcEstado the bcEstado to set
     */
    public void setBcEstado(boolean bcEstado) {
        this.bcEstado = bcEstado;
    }

}
