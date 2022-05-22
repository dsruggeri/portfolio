
package com.portfolio.dsr.service;

import com.portfolio.dsr.Interface.IProyectoService;
import com.portfolio.dsr.entity.Proyecto;
import com.portfolio.dsr.repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectoService implements IProyectoService {
    
    @Autowired
    private IProyectoRepository proyRepo;

    @Override
    public List<Proyecto> listProyecto() {
        
        List<Proyecto> lista = proyRepo.findAll();
        
        return lista;
  
    }

    @Override
    public Proyecto getProyecto(String id) {

        Proyecto proyecto = proyRepo.findById(id).orElse(null);
        
        return proyecto;
        
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        
        proyRepo.save(proyecto);

    }

    @Override
    public void deleteProyecto(String id) {
        
        proyRepo.deleteById(id);        

    }
    

    
}
