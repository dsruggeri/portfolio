
package com.portfolio.dsr.service;

import com.portfolio.dsr.Interface.IEducacionService;
import com.portfolio.dsr.entity.Educacion;
import com.portfolio.dsr.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEducacionService implements IEducacionService {
    
    @Autowired
    private IEducacionRepository educacionRepo;

    @Override
    public List<Educacion> listEducacion() {
        List<Educacion> listaEducacion = educacionRepo.findAll();
        
        return listaEducacion;
    }

    @Override
    public Educacion getEducacion(String id) {
        Educacion educacion = educacionRepo.findById(id).orElse(null);
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        educacionRepo.save(educacion);
    }

    @Override
    public void deleteEducacion(String id) {
        educacionRepo.deleteById(id);
    }
    
}
