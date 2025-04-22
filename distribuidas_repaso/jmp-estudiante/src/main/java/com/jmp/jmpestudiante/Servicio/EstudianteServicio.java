package com.jmp.jmpestudiante.Servicio;

import com.jmp.jmpestudiante.entidad.Estudiante;
import org.apache.el.stream.Optional;

import java.util.List;

public interface EstudianteServicio {
    List<Estudiante> Listar();
    Estudiante Buscar(Long id);
    Estudiante Guardar(Estudiante estudiante);
    Estudiante Actualizar(Estudiante estudiante);
    Estudiante Eliminar(Estudiante estudiante);
}