
package com.portfolio.dsr.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;


@Entity
@Data
public class Persona {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max=50, message = "Debe tener entre 1 y 50 caracteres")
    private String nombre;
    @NotNull
    @Size(min = 1, max=50, message = "Debe tener entre 1 y 50 caracteres")
    private String apellido;
    
  
    //@Size(min = 1, max=50, message = "Debe tener entre 1 y 50 caracteres")
    //private String fotoPerfil;
    
    
}
