package com.acrometrica.agrometrica_system.service;

import com.acrometrica.agrometrica_system.entity.Usuario;
import com.acrometrica.agrometrica_system.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepository.findByCorreo(correo)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        return User.builder()
                .username(usuario.getCorreo())
                .password(usuario.getPassword())
                .authorities("ROLE_" + usuario.getRol())
                .disabled(!usuario.isActivo())
                .build();
    }
}