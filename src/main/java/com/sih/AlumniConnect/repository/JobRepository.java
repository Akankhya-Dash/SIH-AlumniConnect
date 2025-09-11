package com.sih.AlumniConnect.repository;

import com.sih.AlumniConnect.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
