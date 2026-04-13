package com.acrometrica.agrometrica_system.repository;

import java.util.Optional;
import com.acrometrica.agrometrica_system.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreo(String correo);
}