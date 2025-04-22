package com.jmp.jmpestudiante.Repositorio;

import com.jmp.jmpestudiante.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jmp.jmpestudiante.Repositorio.EstudianteRepositorio;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {
}