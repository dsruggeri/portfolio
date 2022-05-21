
package com.portfolio.dsr.service;

import com.portfolio.dsr.Interface.IPersonaService;
import com.portfolio.dsr.entity.Persona;
import com.portfolio.dsr.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
    
    @Autowired
    private IPersonaRepository iPersonaRepository;
    

    @Override
    public List<Persona> listPersona() {
        
        List<Persona> listaPersona = iPersonaRepository.findAll();
        
        return listaPersona;
    }

    @Override
    public Persona getPersona(Long id) {
        
        Persona persona = iPersonaRepository.findById(id).orElse(null);
        
        return persona;

    }

    @Override
    public void savePersona(Persona persona) {
        
        iPersonaRepository.save(persona);

    }

    @Override
    public void deletePersona(Long id) {
        
        iPersonaRepository.deleteById(id);

    }
    
    
    
}
