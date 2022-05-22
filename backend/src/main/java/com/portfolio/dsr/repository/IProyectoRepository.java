
package com.portfolio.dsr.repository;

import com.portfolio.dsr.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, String>{
    
}
