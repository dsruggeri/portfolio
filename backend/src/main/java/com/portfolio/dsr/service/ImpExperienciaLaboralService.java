
package com.portfolio.dsr.service;

import com.portfolio.dsr.Interface.IExperienciaLaboralService;
import com.portfolio.dsr.entity.ExperienciaLaboral;
import com.portfolio.dsr.repository.IExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaLaboralService implements IExperienciaLaboralService {
    
    @Autowired
    private IExperienciaLaboralRepository expLabRepo;

    @Override
    public List<ExperienciaLaboral> listExpLaboral() {
        
        List<ExperienciaLaboral> lista = expLabRepo.findAll();
        return lista;
    }

    @Override
    public ExperienciaLaboral getExpLaboral(String id) {
        
        ExperienciaLaboral expLab = expLabRepo.findById(id).orElse(null);
        
        return expLab;

    }

    @Override
    public void saveExpLaboral(ExperienciaLaboral expLaboral) {
        
        expLabRepo.save(expLaboral);

    }

    @Override
    public void deleteExpLaboral(String id) {
        
        expLabRepo.deleteById(id);

    }
    
}
