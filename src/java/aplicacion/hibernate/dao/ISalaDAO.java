/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Sala;
import java.util.List;

/**
 *
 * @author Ma Ry Youkai
 */
public interface ISalaDAO {
    
     List<Sala> obtenerTodos();
}
