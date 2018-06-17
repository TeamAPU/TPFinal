/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Clasificacion;

/**
 *
 * @author Ma Ry Youkai
 */
public interface IClasificacionDAO {

    Clasificacion validarClasificacion(String claDescripcion);

    void modificar(Clasificacion clasificacion);

    Clasificacion obtenerClasificacion(String nombreClasificacion);

    void agregar(Clasificacion clasificacion);

}
