package com.example.AplikacjaWebowaOrganizerRolnika.controller;

import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.CreateNawozMineralnyDto;
import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.ReadNawozenieMineralneDto;
import com.example.AplikacjaWebowaOrganizerRolnika.controller.dto.ReadPoleDto;
import com.example.AplikacjaWebowaOrganizerRolnika.model.NawozenieMineralne;
import com.example.AplikacjaWebowaOrganizerRolnika.model.Pole;
import com.example.AplikacjaWebowaOrganizerRolnika.service.PoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class PoleController {

    private final PoleService poleService;

    @PostMapping("/poles")
    public Pole createPole(@RequestBody Pole pole){
        return poleService.createPole(pole);
    }

    @PostMapping("/poles/{poleId}")
    public NawozenieMineralne createNawozMineralny(@PathVariable Long poleId, @RequestBody CreateNawozMineralnyDto createNawozMineralnyDto){
        NawozenieMineralne nawozenieMineralne = new NawozenieMineralne();
        nawozenieMineralne.setPoleId(poleId);
        nawozenieMineralne.setNawozMineralny(createNawozMineralnyDto.getNawozMineralny());
        return poleService.createNawozMineralny(nawozenieMineralne);
    }

    @GetMapping("/poles")
    public List<ReadPoleDto> getPoleLIst(){
        return poleService.getPoleList().stream()
                .map(pole -> ReadPoleDto.builder()
                        .name(pole.getName())
                        .powierzchniaPola(pole.getPowierzchniaPola())
                        .rodzajUprawy(pole.getRodzajUprawy())
                        .created(pole.getCreated())
                        .nawozenieMineralne(pole.getNawozenieMineralne().stream()
                                .map(nawozenieMineralne -> ReadNawozenieMineralneDto.builder()
                                        .nawozMineralny(nawozenieMineralne.getNawozMineralny())
                                        .build()
                                )
                                .collect(Collectors.toList())
                        )
                        .build()
                ).collect(Collectors.toList());
    }


}
