
package com.portfolio.dsr.controller;

import com.portfolio.dsr.Interface.IEducacionService;
import com.portfolio.dsr.entity.Educacion;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService eduService;
    
    @GetMapping("educacion/listar")
    public List<Educacion> listEducacion(){
        return eduService.listEducacion();
    }
    

    @GetMapping("educacion/traer")
    public Educacion getEducacion(@RequestParam String id){
        return eduService.getEducacion(id);
    }
    
    @PostMapping("educacion/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        eduService.saveEducacion(educacion);
        return "Educación agregada con éxito";
    }

    @DeleteMapping("educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable String id){
        eduService.deleteEducacion(id);
        return "Educación eliminada con éxito";
    }
    
    @PutMapping("educacion/editar/{id}")
    public Educacion editEducacion (@PathVariable String id,
                                 @RequestParam String nuevaInstitucion,
                                 @RequestParam String nuevoTitulo,
                                 @RequestParam String nuevaDescripcion){
        Educacion educacion = eduService.getEducacion(id);
        educacion.setInstitucion(nuevaInstitucion);
        educacion.setTitulo(nuevoTitulo);
        educacion.setDescripcion(nuevaDescripcion);
        
        eduService.saveEducacion(educacion);
        return educacion;
        
    }


    
}
