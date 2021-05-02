package com.example.PruebaSpringBoot.service;

import java.util.List;
import java.util.Optional;

import com.example.PruebaSpringBoot.dao.IProfesorDao;
import com.example.PruebaSpringBoot.entity.Profesor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class ProfesorServiceImpl implements IProfesorService{
    @Autowired
    private IProfesorDao profesorDao;
    @Override
    @Transactional(readOnly = true) 
    public List<Profesor> findAll() {
        // TODO Auto-generated method stub
        return (List<Profesor>)profesorDao.findAll();
    }

    @Override
    @Transactional(readOnly = true) 
    public Profesor findProfesor(Profesor profesor) {
        // TODO Auto-generated method stub
        return (Profesor)profesorDao.findByEmail(profesor.getEmail());
    }

    @Override
    @Transactional(readOnly = true) 
    public Profesor checkProfesorLogin(Profesor profesor) {
        // TODO Auto-generated method stub
        return (Profesor)profesorDao.findByEmailAndPassword(profesor.getEmail(), profesor.getEmail());
    }

    @Override
    @Transactional
    public void deleteProfesor(Profesor profesor) {
        // TODO Auto-generated method stub
        profesorDao.delete(profesor);
        
    }

    @Override
    @Transactional
    public Profesor updateProfesor(Profesor profesor) {
        // TODO Auto-generated method stub
        return (Profesor)profesorDao.save(profesor);
    }

    @Override
    @Transactional(readOnly = true) 
    public Optional<Profesor> findProfesorById(Long id) {
        // TODO Auto-generated method stub
        return (Optional<Profesor> )profesorDao.findById(id);
    }

    @Override
    @Transactional
    public void deleteProfesor(Long id) {
        // TODO Auto-generated method stub
        profesorDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true) 
    public Profesor findById(Long id) {
        // TODO Auto-generated method stub
        return (Profesor )profesorDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true) 
    public Profesor findByIdSQL(Long id) {
        // TODO Auto-generated method stub
        return (Profesor )profesorDao.findByIdSQL(id);
    }

    @Override
    @Transactional
    public Profesor save(Profesor profesor) {
        // TODO Auto-generated method stub
        return profesorDao.save(profesor);
    }

    
}
