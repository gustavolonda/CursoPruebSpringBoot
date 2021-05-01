package com.example.PruebaSpringBoot.dao;

import java.util.Optional;

import com.example.PruebaSpringBoot.entity.Profesor;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IProfesorDao extends CrudRepository<Profesor,Long>{
    public Profesor findByEmail(String email);
    public Profesor findByEmailAndPassword(String email, String password);
    public Optional<Profesor>  findById(Long id);
    @Query("Select * from profesores p where p.id=?1")
    public Profesor findByIdSQL(Long id);
}
