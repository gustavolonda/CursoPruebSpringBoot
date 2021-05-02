package com.example.PruebaSpringBoot.controller;



import java.util.List;

import com.example.PruebaSpringBoot.entity.Profesor;
import com.example.PruebaSpringBoot.service.IProfesorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProfesorRestController {
    @Autowired 
    private IProfesorService profesorService;
    @GetMapping("/profesores")
    @ResponseStatus(HttpStatus.OK)
    public List<Profesor> getProfesores(){
        return profesorService.findAll();
    }
    @PostMapping("/sign_up")
    public ResponseEntity<Void> addPrefesor(@RequestBody Profesor profesor){
        
        if(profesorService.findProfesor(profesor)==null){
            profesorService.save(profesor);
            return new ResponseEntity<Void> (HttpStatus.CREATED);
        

        }else
        return new ResponseEntity<Void> (HttpStatus.CONFLICT);

    }
    
    
}
