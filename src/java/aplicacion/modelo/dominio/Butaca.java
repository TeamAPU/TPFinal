package aplicacion.modelo.dominio;

import java.io.Serializable;

public class Butaca implements Serializable {

    private Integer butCodigo;
    private String butIdentificador;
    private boolean butEstado;
    private Sala salas;

    public Butaca() {
    }

    public Butaca(Integer butCodigo, String butIdentificador, boolean butEstado, Sala salas) {
        this.butCodigo = butCodigo;
        this.butIdentificador = butIdentificador;
        this.butEstado = butEstado;
        this.salas = salas;
    }

    /**
     * @return the butCodigo
     */
    public Integer getButCodigo() {
        return butCodigo;
    }

    /**
     * @param butCodigo the butCodigo to set
     */
    public void setButCodigo(Integer butCodigo) {
        this.butCodigo = butCodigo;
    }

    /**
     * @return the butIdentificador
     */
    public String getButIdentificador() {
        return butIdentificador;
    }

    /**
     * @param butIdentificador the butIdentificador to set
     */
    public void setButIdentificador(String butIdentificador) {
        this.butIdentificador = butIdentificador;
    }

    /**
     * @return the butEstado
     */
    public boolean isButEstado() {
        return butEstado;
    }

    /**
     * @param butEstado the butEstado to set
     */
    public void setButEstado(boolean butEstado) {
        this.butEstado = butEstado;
    }

    /**
     * @return the salas
     */
    public Sala getSalas() {
        return salas;
    }

    /**
     * @param salas the salas to set
     */
    public void setSalas(Sala salas) {
        this.salas = salas;
    }

}
