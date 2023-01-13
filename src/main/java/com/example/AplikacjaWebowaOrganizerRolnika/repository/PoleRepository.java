package com.example.AplikacjaWebowaOrganizerRolnika.repository;

import com.example.AplikacjaWebowaOrganizerRolnika.model.Pole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoleRepository extends JpaRepository<Pole, Long> {
}
