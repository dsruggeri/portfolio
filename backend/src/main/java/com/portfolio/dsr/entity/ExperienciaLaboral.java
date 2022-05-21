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
public class ExperienciaLaboral {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotNull
    @Size(min = 1, max = 50, message = "Debe tener entre 1 y 50 caracteres")
    private String empresa;
    @NotNull
    private String periodo;
     @NotNull
    @Size(min = 1, max=300, message = "Debe tener entre 1 y 300 caracteres")
    private String descripcion;

}
