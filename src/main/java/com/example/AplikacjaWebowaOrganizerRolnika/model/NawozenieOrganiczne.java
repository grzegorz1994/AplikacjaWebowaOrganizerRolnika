package com.example.AplikacjaWebowaOrganizerRolnika.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NawozenieOrganiczne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long poleId;
    private String nawozOrganiczny;
}
