package com.example.AplikacjaWebowaOrganizerRolnika.controller.mapper;

import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.CreateNawozOrganicznyDto;
import com.example.AplikacjaWebowaOrganizerRolnika.model.NawozenieOrganiczne;

public class CreateNawozOrganicznyMapper {

    public static NawozenieOrganiczne mapToNawozOrganiczny(Long poleId, CreateNawozOrganicznyDto createNawozOrganicznyDto) {
        return NawozenieOrganiczne.builder()
                .poleId(poleId)
                .nawozOrganiczny(createNawozOrganicznyDto.getNawozOrganiczny())
                .build();
    }
}
