/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Pelicula;
import java.util.List;

/**
 *
 * @author Ma Ry Youkai
 */
public interface IPeliculaDAO {
    
    List<Pelicula> obtenerPeliculas();

    void agregar(Pelicula pelicula);
    
    void modificarPelicula (Pelicula pelicula);
}
