
package com.portfolio.dsr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Proyecto {
    
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private String id;
    
    @NotNull
    private String nombre;
    @NotNull
    private String descripcion;
    
    private String url;
    private String imagen;
    
    
}
