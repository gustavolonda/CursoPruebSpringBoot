package com.example.PruebaSpringBoot.dao;

import java.util.Optional;

import com.example.PruebaSpringBoot.entity.Profesor;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IProfesorDao extends CrudRepository<Profesor,Long>{
    public Profesor findByEmail(String email);
    public Profesor findByEmailAndPassword(String email, String password);
    public Optional<Profesor>  findById(Long id);
    @Query(value ="Select * from profesor p where p.id=:id", nativeQuery = true)
    public Profesor findByIdSQL(@Param("id") Long id);
}
