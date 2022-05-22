
package com.portfolio.dsr.Interface;

import com.portfolio.dsr.entity.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    //lsitar proyectos
    public List<Proyecto> listProyecto();
    
    //traer un proyecto por id
    public Proyecto getProyecto(String id);
    
    //guardar proyecto
    public void saveProyecto(Proyecto proyecto);
    
    //eliminar proyecto
    public void deleteProyecto(String id);
    
}
