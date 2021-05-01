package com.example.PruebaSpringBoot.service;

import java.util.List;
import java.util.Optional;

import com.example.PruebaSpringBoot.entity.Profesor;

public interface IProfesorService {
    public List<Profesor> findAll();
    public Profesor findProfesor(Profesor profesor);
    public Profesor checkProfesorLogin(Profesor profesor);
    public void deleteProfesor(Profesor profesor);
    public Profesor updateProfesor(Profesor profesor);
    public Optional<Profesor> findProfesorById(Long id);
    public void deleteProfesor(Long id);
    public Profesor findById(Long id);
    public Profesor findByIdSQL(Long id);
}
