package com.example.AplikacjaWebowaOrganizerRolnika.controller.mapper;

import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.ReadNawozenieMineralneDto;
import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.ReadNawozenieOrganiczneDto;
import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.ReadPoleDto;
import com.example.AplikacjaWebowaOrganizerRolnika.model.Pole;

import java.util.List;
import java.util.stream.Collectors;

public class ReadPoleListMapper {

    public static List<ReadPoleDto> mapPoleToReadPoleDtoList(List<Pole> poleList) {
        return poleList.stream()
                .map(pole -> ReadPoleDto.builder()
                        .id(pole.getId())
                        .name(pole.getName())
                        .powierzchniaPola(pole.getPowierzchniaPola())
                        .rodzajUprawy(pole.getRodzajUprawy())
                        .created(pole.getCreated())
                        .nawozenieMineralne(pole.getNawozenieMineralne().stream()
                                .map(nawozenieMineralne -> ReadNawozenieMineralneDto.builder()
                                        .nawozMineralny(nawozenieMineralne.getNawozMineralny())
                                        .build()
                                        ).collect(Collectors.toList())
                        ).nawozenieOrganiczne(pole.getNawozenieOrganiczne().stream()
                                .map(nawozenieOrganiczne -> ReadNawozenieOrganiczneDto.builder()
                                        .nawozOrganiczny(nawozenieOrganiczne.getNawozOrganiczny())
                                        .build()
                                ).collect(Collectors.toList())
                        )
                        .build()
                ).collect(Collectors.toList());
    }
}
