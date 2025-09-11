package com.sih.AlumniConnect.controller;

import com.sih.AlumniConnect.entity.Job;
import com.sih.AlumniConnect.service.JobService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "*")
public class JobController {
    private final JobService service;

    public JobController(JobService service) { this.service = service; }

    @PostMapping
    public Job post(@RequestBody Job job) { return service.postJob(job); }

    @GetMapping
    public List<Job> getJobs() { return service.getAllJobs(); }
}
