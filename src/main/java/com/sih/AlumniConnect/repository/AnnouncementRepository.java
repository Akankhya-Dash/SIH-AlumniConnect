package com.sih.AlumniConnect.repository;

import com.sih.AlumniConnect.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
}
