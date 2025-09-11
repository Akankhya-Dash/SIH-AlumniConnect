package com.sih.AlumniConnect.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mentorship_requests")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MentorshipRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String email;
    private String message;
    private String status; // pending / accepted / declined
}
