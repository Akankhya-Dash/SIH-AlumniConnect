package com.sih.AlumniConnect.controller;

import com.sih.AlumniConnect.entity.Opportunity;
import com.sih.AlumniConnect.service.OpportunityService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/opportunities")
@CrossOrigin(origins = "*")
public class OpportunityController {
    private final OpportunityService service;

    public OpportunityController(OpportunityService service) { this.service = service; }

    @PostMapping
    public Opportunity post(@RequestBody Opportunity o) { return service.post(o); }

    @GetMapping
    public List<Opportunity> getAll() { return service.getAll(); }
}
