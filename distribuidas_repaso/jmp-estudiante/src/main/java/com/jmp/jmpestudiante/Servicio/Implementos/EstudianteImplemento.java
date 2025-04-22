package com.jmp.jmpestudiante.Servicio.Implementos;

import com.jmp.jmpestudiante.Repositorio.EstudianteRepositorio;
import com.jmp.jmpestudiante.Servicio.EstudianteServicio;
import com.jmp.jmpestudiante.entidad.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteImplemento implements EstudianteServicio {

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante> Listar(){
        return estudianteRepositorio.findAll();
    }

    @Override
    public Estudiante Buscar(Long id) {
        return estudianteRepositorio.findById(id).get();
    }

    @Override
    public Estudiante Guardar(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
        return estudiante;
    }

    @Override
    public Estudiante Actualizar(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
        return estudiante;
    }
    @Override
    public Estudiante Eliminar(Estudiante estudiante) {
        estudianteRepositorio.delete(estudiante);
        return estudiante;
    }
}