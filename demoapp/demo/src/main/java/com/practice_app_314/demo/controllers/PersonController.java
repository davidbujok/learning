package com.practice_app_314.demo.controllers;

import com.practice_app_314.demo.models.Person;
import com.practice_app_314.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/people")
    public List<Person> getAllPeople(){
        return personRepository.findAll();
    }

    @PostMapping(value = "/people")
    public Person createPerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @DeleteMapping(value = "/person/{id}")
    public void deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
    }



}
