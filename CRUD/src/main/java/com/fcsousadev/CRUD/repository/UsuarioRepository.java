package com.fcsousadev.CRUD.repository;

import com.fcsousadev.CRUD.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
