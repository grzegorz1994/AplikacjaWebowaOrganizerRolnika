package com.example.AplikacjaWebowaOrganizerRolnika.service;

import com.example.AplikacjaWebowaOrganizerRolnika.model.NawozenieMineralne;
import com.example.AplikacjaWebowaOrganizerRolnika.model.Pole;
import com.example.AplikacjaWebowaOrganizerRolnika.repository.NawozenieMineralneRepository;
import com.example.AplikacjaWebowaOrganizerRolnika.repository.PoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PoleService {

    private final PoleRepository poleRepository;
    private final NawozenieMineralneRepository nawozenieMineralneRepository;

    public Pole createPole(Pole pole){
        return poleRepository.save(pole);
    }

    public NawozenieMineralne createNawozMineralny(NawozenieMineralne nawozenieMineralne){
        return nawozenieMineralneRepository.save(nawozenieMineralne);
    }

    public List<Pole> getPoleList(){
        return poleRepository.findAll();
    }

}