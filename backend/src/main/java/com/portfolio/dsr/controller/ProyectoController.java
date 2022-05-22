package com.portfolio.dsr.controller;

import com.portfolio.dsr.Interface.IProyectoService;
import com.portfolio.dsr.entity.Proyecto;
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
public class ProyectoController {

    @Autowired
    private IProyectoService proyService;

    @GetMapping("proyecto/listar")
    public List<Proyecto> listProyecto() {
        return proyService.listProyecto();
    }

    @GetMapping("proyecto/traer")
    public Proyecto getProyecto(@RequestParam String id) {
        return proyService.getProyecto(id);
    }

    @PostMapping("proyecto/Crear")
    public String createProyecto(@RequestBody Proyecto proyecto) {
        proyService.saveProyecto(proyecto);
        return "Proyecto guardado con éxito";
    }

    @DeleteMapping("proyecto/borrar/{id}")
    public String deleteProyecto(@PathVariable String id) {
        proyService.deleteProyecto(id);
        return "Proyecto eliminado con éxito";
    }

    @PutMapping("proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable String id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("descripcion") String nuevaDescripcion,
            @RequestParam("url") String nuevaUrl,
            @RequestParam("imagen") String nuevaImagen) {

        Proyecto proyecto = proyService.getProyecto(id);

        proyecto.setNombre(nuevoNombre);
        proyecto.setDescripcion(nuevaDescripcion);
        proyecto.setUrl(nuevaUrl);
        proyecto.setImagen(nuevaImagen);

        proyService.saveProyecto(proyecto);

        return proyecto;
    }

}
