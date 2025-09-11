package com.sih.AlumniConnect.controller;

import com.sih.AlumniConnect.entity.Announcement;
import com.sih.AlumniConnect.service.AnnouncementService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/announcements")
@CrossOrigin(origins = "*")
public class AnnouncementController {
    private final AnnouncementService service;

    public AnnouncementController(AnnouncementService service) { this.service = service; }

    @PostMapping
    public Announcement post(@RequestBody Announcement a) { return service.post(a); }

    @GetMapping
    public List<Announcement> getAll() { return service.getAll(); }
}
