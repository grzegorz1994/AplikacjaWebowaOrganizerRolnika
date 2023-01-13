package com.example.AplikacjaWebowaOrganizerRolnika.controller;

import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.CreateNawozMineralnyDto;
import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.CreatePoleDto;
import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.ReadPoleDto;
import com.example.AplikacjaWebowaOrganizerRolnika.model.NawozenieMineralne;
import com.example.AplikacjaWebowaOrganizerRolnika.model.Pole;
import com.example.AplikacjaWebowaOrganizerRolnika.service.PoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.AplikacjaWebowaOrganizerRolnika.controller.mapper.CreateNawozMineralnyMapper.mapToNawozMineralny;
import static com.example.AplikacjaWebowaOrganizerRolnika.controller.mapper.CreatePoleMapper.mapToPole;
import static com.example.AplikacjaWebowaOrganizerRolnika.controller.mapper.ReadPoleMapper.mapPoleToReadPoleDtoList;

@RestController
@RequiredArgsConstructor
public class PoleController {

    private final PoleService poleService;

    @PostMapping("/poles")
    public Pole createPole(@RequestBody CreatePoleDto createPoleDto){
        return poleService.createPole(mapToPole(createPoleDto));
    }

    @PostMapping("/poles/{poleId}")
    public NawozenieMineralne createNawozMineralny(@PathVariable Long poleId, @RequestBody CreateNawozMineralnyDto createNawozMineralnyDto){
        return poleService.createNawozMineralny(mapToNawozMineralny(poleId, createNawozMineralnyDto));
    }

    @GetMapping("/poles")
    public List<ReadPoleDto> getPoleList(){
        return mapPoleToReadPoleDtoList(poleService.getPoleList());
    }


}
