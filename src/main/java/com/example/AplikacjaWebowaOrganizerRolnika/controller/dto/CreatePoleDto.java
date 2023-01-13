package com.example.AplikacjaWebowaOrganizerRolnika.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.sql.Date;

@Getter
@Builder
public class CreatePoleDto {

    private String name;
    private String powierzchniaPola;
    private String rodzajUprawy;
    private Date created;
}
