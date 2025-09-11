package com.sih.AlumniConnect.service;

import com.sih.AlumniConnect.entity.Opportunity;
import com.sih.AlumniConnect.repository.OpportunityRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OpportunityService {
    private final OpportunityRepository repo;

    public OpportunityService(OpportunityRepository repo) { this.repo = repo; }

    public Opportunity post(Opportunity o) { return repo.save(o); }
    public List<Opportunity> getAll() { return repo.findAll(); }
}
