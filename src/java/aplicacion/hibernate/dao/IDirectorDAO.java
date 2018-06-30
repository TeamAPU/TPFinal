/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Director;
import java.util.List;

/**
 *
 * @author Ma Ry Youkai
 */
public interface IDirectorDAO {
    
    void agregar (Director director);
    
    List<Director> obtenerTodos();
    
    void modificarDirector(Director director);
    
}
