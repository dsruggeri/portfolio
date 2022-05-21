
package com.portfolio.dsr.Interface;

import com.portfolio.dsr.entity.Educacion;
import java.util.List;


public interface IEducacionService {
    
    //listar educacion
    public List<Educacion> listEducacion();
    
    //traer 1 educacion por ID
    public Educacion getEducacion(String id);

    //guardar nueva Educacion
    public void saveEducacion(Educacion educacion);
    
    //eliminar educacion por id
    public void deleteEducacion(String id);

    
}
