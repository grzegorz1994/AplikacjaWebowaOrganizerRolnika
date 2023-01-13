package com.example.AplikacjaWebowaOrganizerRolnika.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String powierzchniaPola;
    private String rodzajUprawy;
    private Date created;
    @OneToMany
    @JoinColumn(name = "poleId")
    private List<NawozenieMineralne> nawozenieMineralne;
    @OneToMany
    @JoinColumn(name = "poleId")
    private List<NawozenieOrganiczne> nawozenieOrganiczne;
}
