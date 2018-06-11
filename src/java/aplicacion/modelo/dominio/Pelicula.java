package aplicacion.modelo.dominio;

public class Pelicula {

    private Integer pelCodigo;
    private String pelNombre;
    private String pelDescripcion;
    private boolean pelEstado;

    public Pelicula() {
    }

    public Pelicula(Integer pelCodigo, String pelNombre, String pelDescripcion, boolean pelEstado) {
        this.pelCodigo = pelCodigo;
        this.pelNombre = pelNombre;
        this.pelDescripcion = pelDescripcion;
        this.pelEstado = pelEstado;
    }

    /**
     * @return the pelCodigo
     */
    public Integer getPelCodigo() {
        return pelCodigo;
    }

    /**
     * @param pelCodigo the pelCodigo to set
     */
    public void setPelCodigo(Integer pelCodigo) {
        this.pelCodigo = pelCodigo;
    }

    /**
     * @return the pelNombre
     */
    public String getPelNombre() {
        return pelNombre;
    }

    /**
     * @param pelNombre the pelNombre to set
     */
    public void setPelNombre(String pelNombre) {
        this.pelNombre = pelNombre;
    }

    /**
     * @return the pelDescripcion
     */
    public String getPelDescripcion() {
        return pelDescripcion;
    }

    /**
     * @param pelDescripcion the pelDescripcion to set
     */
    public void setPelDescripcion(String pelDescripcion) {
        this.pelDescripcion = pelDescripcion;
    }

    /**
     * @return the pelEstado
     */
    public boolean isPelEstado() {
        return pelEstado;
    }

    /**
     * @param pelEstado the pelEstado to set
     */
    public void setPelEstado(boolean pelEstado) {
        this.pelEstado = pelEstado;
    }

}
