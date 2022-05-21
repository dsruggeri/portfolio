
package com.portfolio.dsr.controller;

import com.portfolio.dsr.Interface.IExperienciaLaboralService;
import com.portfolio.dsr.entity.ExperienciaLaboral;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaLaboralController {
    
    @Autowired
    private IExperienciaLaboralService expLabService;
    
    
    @GetMapping("experiencia/listar")
    public List<ExperienciaLaboral> listExpLaboral(){
        return expLabService.listExpLaboral();
    }

    @GetMapping("experiencia/traer")
    public ExperienciaLaboral getExpLaboral(@RequestParam String id){
        return expLabService.getExpLaboral(id);
    }

    @PostMapping("experiencia/crear")
    public String createExpLaboral(@RequestBody ExperienciaLaboral expLaboral){
        expLabService.saveExpLaboral(expLaboral);
        return "Experiencia Laboral creada con éxito";
    }
    
    @DeleteMapping("experiencia/borrar")
    public String deleteExpLab(@PathVariable String id){
        expLabService.deleteExpLaboral(id);
        return "Experiencia laboral eliminada con éxito";
    }
    
    @PutMapping("expriencia/editar/{id}")
    public ExperienciaLaboral editExpLab(@PathVariable String id,
                                         @RequestParam String nuevaEmpresa,
                                         @RequestParam String nuevoPeriodo,
                                         @RequestParam String nuevaDescripcion){
        
        ExperienciaLaboral expLab = expLabService.getExpLaboral(id);
        expLab.setEmpresa(nuevaEmpresa);
        expLab.setPeriodo(nuevoPeriodo);
        expLab.setDescripcion(nuevaDescripcion);
        
        expLabService.saveExpLaboral(expLab);
        
        return expLab;
        
    }

    
}
