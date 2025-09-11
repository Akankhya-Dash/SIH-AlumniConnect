package com.sih.AlumniConnect.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "opportunities")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Opportunity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String type; // Internship, Job, Mentorship
    private String postedBy;
}
