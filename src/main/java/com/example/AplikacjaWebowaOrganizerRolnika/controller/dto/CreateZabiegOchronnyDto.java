package com.example.AplikacjaWebowaOrganizerRolnika.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.sql.Date;

@Getter
@Builder
public class CreateZabiegOchronnyDto {
    private long poleId;
    private String rodzajZabiegu;
    private Date dataZabiegu;
}
