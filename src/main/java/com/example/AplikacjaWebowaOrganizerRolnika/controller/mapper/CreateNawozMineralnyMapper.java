package com.example.AplikacjaWebowaOrganizerRolnika.controller.mapper;

import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.CreateNawozMineralnyDto;
import com.example.AplikacjaWebowaOrganizerRolnika.model.NawozenieMineralne;

public class CreateNawozMineralnyMapper {

    public static NawozenieMineralne mapToNawozMineralny(Long poleId, CreateNawozMineralnyDto createNawozMineralnyDto) {
        return NawozenieMineralne.builder()
                .poleId(poleId)
                .nawozMineralny(createNawozMineralnyDto.getNawozMineralny())
                .build();
    }
}
