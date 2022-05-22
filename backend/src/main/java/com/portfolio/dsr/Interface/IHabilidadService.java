
package com.portfolio.dsr.Interface;

import com.portfolio.dsr.entity.Habilidad;
import java.util.List;


public interface IHabilidadService {
    
    //listar habilidades
    public List<Habilidad> listHabilidad();

    //traer una habildiad por ID
    public Habilidad getHabilidad(String id);
    
    //guardad habilidad
    public void saveHabilidad(Habilidad habilidad);
    
    //eliminar habilidad
    public void deleteHabilidad(String id);

}
