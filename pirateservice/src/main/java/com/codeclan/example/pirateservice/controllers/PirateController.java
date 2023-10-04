package com.codeclan.example.pirateservice.controllers;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;

    @GetMapping(value = "/pirates")// to create an accessible route for API
    public ResponseEntity<List<Pirate>> getAllPirates(){
        return new ResponseEntity<>(pirateRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/pirates/{id}")
    public ResponseEntity getPirate(@PathVariable Long id){
        return new ResponseEntity<>(pirateRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/pirates") // CREATING (C)
    public ResponseEntity<Pirate> createPirate(@RequestBody Pirate pirate){
        pirateRepository.save(pirate);
        return  new ResponseEntity<>(pirate, HttpStatus.OK);
    }

    @DeleteMapping(value = "/pirates/{id}")
    public void deletePirate(@PathVariable Long id) {
        pirateRepository.deleteById(id);
    }
    @PutMapping(value = "/pirates/{id}")
    public Pirate replacePirate(@PathVariable Long id, @RequestBody Pirate newPirate){
        return pirateRepository.findById(id).map(pirate -> {
            pirate.setFirstName(newPirate.getFirstName());
            pirate.setSecondName(newPirate.getSecondName());
            pirate.setAge(newPirate.getAge());
            return pirateRepository.save(pirate);
        }).orElseGet(() -> {
            newPirate.setId(id);
            return pirateRepository.save(newPirate);
        });
    }

}
