package com.sih.AlumniConnect.controller;

import com.sih.AlumniConnect.entity.Alumni;
import com.sih.AlumniConnect.service.AlumniService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alumni")
@CrossOrigin(origins = "*")
public class AlumniController {
    private final AlumniService service;

    public AlumniController(AlumniService service) { this.service = service; }

    @PostMapping
    public Alumni save(@RequestBody Alumni a) { return service.save(a); }

    @GetMapping
    public List<Alumni> getAll() { return service.findAll(); }
}
