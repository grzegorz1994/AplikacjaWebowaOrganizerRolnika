package com.example.AplikacjaWebowaOrganizerRolnika.repository;

import com.example.AplikacjaWebowaOrganizerRolnika.model.ZabiegOchronny;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZabiegOchronnyRepository extends JpaRepository<ZabiegOchronny, Long> {
}
