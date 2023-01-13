package com.example.AplikacjaWebowaOrganizerRolnika.repository;

import com.example.AplikacjaWebowaOrganizerRolnika.model.NawozenieOrganiczne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NawozenieOrganiczneRepository extends JpaRepository<NawozenieOrganiczne, Long> {
}
