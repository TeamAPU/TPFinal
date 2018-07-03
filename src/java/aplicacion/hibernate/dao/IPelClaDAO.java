/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.PelCla;

/**
 *
 * @author Ma Ry Youkai
 */
public interface IPelClaDAO {
    
    PelCla obtenerClasificacion(String nomPelicula);
}
