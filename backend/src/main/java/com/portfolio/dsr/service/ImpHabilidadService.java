
package com.portfolio.dsr.service;

import com.portfolio.dsr.Interface.IHabilidadService;
import com.portfolio.dsr.entity.Habilidad;
import com.portfolio.dsr.repository.IHabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHabilidadService implements IHabilidadService {
    
    @Autowired
    private IHabilidadRepository habRepo;

    @Override
    public List<Habilidad> listHabilidad() {
        List<Habilidad> lista = habRepo.findAll();
        return lista;
    }

    @Override
    public Habilidad getHabilidad(String id) {
        Habilidad habilidad = habRepo.findById(id).orElse(null);
        return habilidad;
    }

    @Override
    public void saveHabilidad(Habilidad habilidad) {
        habRepo.save(habilidad);
    }

    @Override
    public void deleteHabilidad(String id) {
        habRepo.deleteById(id);
    }
    
}
