package com.sih.AlumniConnect.service;

import com.sih.AlumniConnect.entity.Alumni;
import com.sih.AlumniConnect.repository.AlumniRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlumniService {
    private final AlumniRepository repo;

    public AlumniService(AlumniRepository repo) { this.repo = repo; }

    public Alumni save(Alumni a) { return repo.save(a); }
    public List<Alumni> findAll() { return repo.findAll(); }
}
