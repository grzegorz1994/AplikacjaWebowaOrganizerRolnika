package com.example.AplikacjaWebowaOrganizerRolnika.controller.mapper;

import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.CreatePoleDto;
import com.example.AplikacjaWebowaOrganizerRolnika.model.Pole;

public class CreatePoleMapper {
    public static Pole mapToPole(CreatePoleDto createPoleDto) {
        return Pole.builder()
                .name(createPoleDto.getName())
                .powierzchniaPola(createPoleDto.getPowierzchniaPola())
                .rodzajUprawy(createPoleDto.getRodzajUprawy())
                .created(createPoleDto.getCreated())
                .build();
    }
}
