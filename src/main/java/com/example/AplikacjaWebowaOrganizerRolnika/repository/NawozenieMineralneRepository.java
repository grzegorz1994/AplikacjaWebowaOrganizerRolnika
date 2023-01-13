package com.example.AplikacjaWebowaOrganizerRolnika.repository;

import com.example.AplikacjaWebowaOrganizerRolnika.model.NawozenieMineralne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NawozenieMineralneRepository extends JpaRepository<NawozenieMineralne, Long> {
}
