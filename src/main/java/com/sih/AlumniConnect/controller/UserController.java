package com.sih.AlumniConnect.controller;

import com.sih.AlumniConnect.entity.User;
import com.sih.AlumniConnect.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {
    private final UserService service;

    public UserController(UserService service) { this.service = service; }

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> body) {
        return service.login(body.get("username"), body.get("password"))
                .map(u -> Map.of("success", true, "role", u.getRole()))
                .orElse(Map.of("success", false));
    }
}
