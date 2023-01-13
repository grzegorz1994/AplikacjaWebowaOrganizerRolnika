package com.example.AplikacjaWebowaOrganizerRolnika.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.sql.Date;
import java.util.List;

@Getter
@Builder
public class ReadPoleDto {
    private long id;
    private String name;
    private String powierzchniaPola;
    private String rodzajUprawy;
    private Date created;
    private List<ReadNawozenieMineralneDto> nawozenieMineralne;
    private List<ReadNawozenieOrganiczneDto> nawozenieOrganiczne;
    private List<ReadZabiegOchronnyDto> zabiegOchronny;
}
