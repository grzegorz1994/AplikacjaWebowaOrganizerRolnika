package com.example.AplikacjaWebowaOrganizerRolnika.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateNawozOrganicznyDto {
    private long poleId;
    private String nawozOrganiczny;
}
