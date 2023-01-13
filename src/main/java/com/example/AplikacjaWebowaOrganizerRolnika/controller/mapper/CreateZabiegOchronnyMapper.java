package com.example.AplikacjaWebowaOrganizerRolnika.controller.mapper;

import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.CreateZabiegOchronnyDto;
import com.example.AplikacjaWebowaOrganizerRolnika.model.ZabiegOchronny;

public class CreateZabiegOchronnyMapper {

    public static ZabiegOchronny mapToZabiegOchronny(Long poleId, CreateZabiegOchronnyDto createZabiegOchronnyDto) {
        return ZabiegOchronny.builder()
                .poleId(poleId)
                .rodzajZabiegu(createZabiegOchronnyDto.getRodzajZabiegu())
                .dataZabiegu(createZabiegOchronnyDto.getDataZabiegu())
                .build();
    }
}
