
package com.portfolio.dsr.controller;

import com.portfolio.dsr.Interface.IHabilidadService;
import com.portfolio.dsr.entity.Habilidad;
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
public class HabilidadController {
    
    @Autowired
    private IHabilidadService habService;
    
    @GetMapping("habilidad/listar")
    public List<Habilidad> listHabilidad(){
        List<Habilidad> lista = habService.listHabilidad();
        return lista;
    }
    
    @GetMapping("habilidad/traer")
    public Habilidad getHabilidad(@RequestParam("id") String id){
        Habilidad habilidad = habService.getHabilidad(id);
        return habilidad;
    }
    
    @PostMapping("habilidad/crear")
    public String createHabilidad(@RequestBody Habilidad habilidad){
        habService.saveHabilidad(habilidad);
        return "Habilidad guardada con éxito";
    }
    
    @DeleteMapping("habilidad/eliminar/{id}")
    public String deleteHabilidad(@PathVariable String id){
        habService.deleteHabilidad(id);
        return "Habilidad eliminada con éxito";
    }




    @PutMapping("habilidad/editar/{id}")
    public Habilidad editHabilidad(@PathVariable String id,
                                   @RequestParam("porcentaje") Integer nuevoPorcentaje,
                                   @RequestParam("nombre") String nuevoNombre,
                                   @RequestParam("imgSrc") String nuevoImgSrc){
        Habilidad habilidad = habService.getHabilidad(id);
        
        habilidad.setNombre(nuevoNombre);
        habilidad.setPorcentaje(nuevoPorcentaje);
        habilidad.setImageSrc(nuevoImgSrc);
        
        habService.saveHabilidad(habilidad);

        return habilidad;        
        
    }
    
}
