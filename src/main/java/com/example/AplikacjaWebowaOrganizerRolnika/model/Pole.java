package com.example.AplikacjaWebowaOrganizerRolnika.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
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
}
