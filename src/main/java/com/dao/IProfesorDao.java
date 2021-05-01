package com.dao;

import com.example.PruebaSpringBoot.entity.Profesor;

import org.springframework.data.repository.CrudRepository;

public interface IProfesorDao extends CrudRepository<Profesor,Long>{
    
}
