package com.sih.AlumniConnect.repository;

import com.sih.AlumniConnect.entity.Alumni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumniRepository extends JpaRepository<Alumni, Long> {
}
