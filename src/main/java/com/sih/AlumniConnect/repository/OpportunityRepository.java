package com.sih.AlumniConnect.repository;

import com.sih.AlumniConnect.entity.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {
}
