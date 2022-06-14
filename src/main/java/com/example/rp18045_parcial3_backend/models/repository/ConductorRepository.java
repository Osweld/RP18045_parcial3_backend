package com.example.rp18045_parcial3_backend.models.repository;

import com.example.rp18045_parcial3_backend.models.entity.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConductorRepository extends JpaRepository<Conductor, String> {
}