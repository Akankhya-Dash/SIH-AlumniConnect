package com.sih.AlumniConnect.controller;

import com.sih.AlumniConnect.entity.MentorshipRequest;
import com.sih.AlumniConnect.service.MentorshipRequestService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mentorship")
@CrossOrigin(origins = "*")
public class MentorshipRequestController {
    private final MentorshipRequestService service;

    public MentorshipRequestController(MentorshipRequestService service) {
        this.service = service;
    }

    @PostMapping
    public MentorshipRequest send(@RequestBody MentorshipRequest req) {
        return service.send(req);
    }

    @GetMapping
    public List<MentorshipRequest> getAll() { return service.findAll(); }
}
