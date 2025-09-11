package com.sih.AlumniConnect.service;

import com.sih.AlumniConnect.entity.Job;
import com.sih.AlumniConnect.repository.JobRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobService {
    private final JobRepository repo;

    public JobService(JobRepository repo) { this.repo = repo; }

    public Job postJob(Job job) { return repo.save(job); }
    public List<Job> getAllJobs() { return repo.findAll(); }
}
