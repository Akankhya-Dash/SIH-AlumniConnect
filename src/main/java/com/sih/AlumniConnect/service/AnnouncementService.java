package com.sih.AlumniConnect.service;

import com.sih.AlumniConnect.entity.Announcement;
import com.sih.AlumniConnect.repository.AnnouncementRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnnouncementService {
    private final AnnouncementRepository repo;

    public AnnouncementService(AnnouncementRepository repo) { this.repo = repo; }

    public Announcement post(Announcement a) { return repo.save(a); }
    public List<Announcement> getAll() { return repo.findAll(); }
}
