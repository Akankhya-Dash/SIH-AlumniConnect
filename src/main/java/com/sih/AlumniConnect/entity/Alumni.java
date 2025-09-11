package com.sih.AlumniConnect.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "alumni")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Alumni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int batch;
    private String skills;
    private boolean available; // mentorship availability
}
