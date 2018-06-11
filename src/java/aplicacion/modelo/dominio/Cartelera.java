package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

public class Cartelera implements Serializable {

    private Integer carCodigo;
    private Pelicula peliculas;
    private Sala salas;
    private Date carFecha;
    private String carHorario;
    private double carPrecio;
    private boolean carEstado;

    public Cartelera() {
    }

    public Cartelera(Integer carCodigo, Pelicula peliculas, Sala salas, Date carFecha, String carHorario, double carPrecio, boolean carEstado) {
        this.carCodigo = carCodigo;
        this.peliculas = peliculas;
        this.salas = salas;
        this.carFecha = carFecha;
        this.carHorario = carHorario;
        this.carPrecio = carPrecio;
        this.carEstado = carEstado;
    }

    /**
     * @return the carCodigo
     */
    public Integer getCarCodigo() {
        return carCodigo;
    }

    /**
     * @param carCodigo the carCodigo to set
     */
    public void setCarCodigo(Integer carCodigo) {
        this.carCodigo = carCodigo;
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

    /**
     * @return the carFecha
     */
    public Date getCarFecha() {
        return carFecha;
    }

    /**
     * @param carFecha the carFecha to set
     */
    public void setCarFecha(Date carFecha) {
        this.carFecha = carFecha;
    }

    /**
     * @return the carHorario
     */
    public String getCarHorario() {
        return carHorario;
    }

    /**
     * @param carHorario the carHorario to set
     */
    public void setCarHorario(String carHorario) {
        this.carHorario = carHorario;
    }

    /**
     * @return the carPrecio
     */
    public double getCarPrecio() {
        return carPrecio;
    }

    /**
     * @param carPrecio the carPrecio to set
     */
    public void setCarPrecio(double carPrecio) {
        this.carPrecio = carPrecio;
    }

    /**
     * @return the carEstado
     */
    public boolean isCarEstado() {
        return carEstado;
    }

    /**
     * @param carEstado the carEstado to set
     */
    public void setCarEstado(boolean carEstado) {
        this.carEstado = carEstado;
    }

}
