
package com.portfolio.dsr.Interface;

import com.portfolio.dsr.entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //traer personas
    public List<Persona> listPersona();
    
    //traer 1 persona por ID
    public Persona getPersona(Long id);
    
    //guardar persona
    public void savePersona(Persona persona);
    
    //eliminar persona por id
    public void deletePersona(Long id);
    
    
}
