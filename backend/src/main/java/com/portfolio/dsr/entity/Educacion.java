
package com.portfolio.dsr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    
    @NotNull
    private String institucion;
    @NotNull
    private String titulo;
    @NotNull
    private String descripcion;
    
}
