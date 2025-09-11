package com.sih.AlumniConnect.service;

import com.sih.AlumniConnect.entity.MentorshipRequest;
import com.sih.AlumniConnect.repository.MentorshipRequestRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MentorshipRequestService {
    private final MentorshipRequestRepository repo;

    public MentorshipRequestService(MentorshipRequestRepository repo) {
        this.repo = repo;
    }

    public MentorshipRequest send(MentorshipRequest req) { return repo.save(req); }
    public List<MentorshipRequest> findAll() { return repo.findAll(); }
}
