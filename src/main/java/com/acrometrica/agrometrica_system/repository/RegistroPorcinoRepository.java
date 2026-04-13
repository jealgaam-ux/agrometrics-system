package com.acrometrica.agrometrica_system.repository;

import com.acrometrica.agrometrica_system.entity.RegistroPorcino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface RegistroPorcinoRepository extends JpaRepository<RegistroPorcino, Long> {

    List<RegistroPorcino> findByNombreGranjaContainingIgnoreCase(String nombreGranja);

    List<RegistroPorcino> findByFechaRegistroBetween(LocalDateTime inicio, LocalDateTime fin);

    List<RegistroPorcino> findByNombreGranjaContainingIgnoreCaseAndFechaRegistroBetween(
            String nombreGranja,
            LocalDateTime inicio,
            LocalDateTime fin
    );
}