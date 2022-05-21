
package com.portfolio.dsr.Interface;

import com.portfolio.dsr.entity.ExperienciaLaboral;
import java.util.List;


public interface IExperienciaLaboralService {
    
    //traer experiencia laboral
    public List<ExperienciaLaboral> listExpLaboral();
    
    //traer 1 experiencia laboral por ID
    public ExperienciaLaboral getExpLaboral(String id);
    
    //guardar nueva experiencia laboral
    public void saveExpLaboral(ExperienciaLaboral expLaboral);
    
    
    //eliminar experiencia laboral por id
    public void deleteExpLaboral(String id);
    
}
