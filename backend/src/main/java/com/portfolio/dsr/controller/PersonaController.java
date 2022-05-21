package com.portfolio.dsr.controller;

import com.portfolio.dsr.Interface.IPersonaService;
import com.portfolio.dsr.entity.Persona;
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
public class PersonaController {

    @Autowired
    private IPersonaService iPersonaService;

    @GetMapping("persona/listar")
    public List<Persona> listPersona() {
        return iPersonaService.listPersona();
    }

    @GetMapping("persona/traer")
    public Persona getPersona(@RequestParam Long id) {
        return iPersonaService.getPersona(id);
    }

    @PostMapping("persona/crear")
    public String createPersona(@RequestBody Persona persona) {
        iPersonaService.savePersona(persona);
        return "Persona creada con éxito";
    }

    @DeleteMapping("persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        iPersonaService.deletePersona(id);
        return "Persona eliminada con éxito";
    }

    @PutMapping("persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido) {

        Persona persona = iPersonaService.getPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);

        iPersonaService.savePersona(persona);
        return persona;
    }

}
