
package com.portfolio.dsr.repository;

import com.portfolio.dsr.entity.ExperienciaLaboral;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.portfolio.dsr.Interface.IExperienciaLaboralService;

@Repository
public interface IExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral, String> {

}