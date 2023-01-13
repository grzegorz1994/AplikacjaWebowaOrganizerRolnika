package com.example.AplikacjaWebowaOrganizerRolnika.controller.dto;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class CreateNawozMineralnyDto {
    private long poleId;
    private String nawozMineralny;
}
