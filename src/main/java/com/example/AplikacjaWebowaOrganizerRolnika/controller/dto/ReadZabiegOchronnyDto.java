package com.example.AplikacjaWebowaOrganizerRolnika.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.sql.Date;

@Getter
@Builder
public class ReadZabiegOchronnyDto {
    private String rodzajZabiegu;
    private Date dataZabiegu;
}
