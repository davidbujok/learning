package com.codeclan.example.pirateservice.controllers;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.models.Raid;
import com.codeclan.example.pirateservice.repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

    @GetMapping(value = "/raids")// to create an accessible route for API
    public ResponseEntity<List<Raid>> getAllRaids(){
        return new ResponseEntity<>(raidRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/raids/{id}")
    public ResponseEntity getRaid(@PathVariable Long id){
        return new ResponseEntity<>(raidRepository.findById(id), HttpStatus.OK);
    }
    @PostMapping(value = "/raids") // CREATING (C);
    public ResponseEntity<Raid> createRaid(@RequestBody Raid raid){
        raidRepository.save(raid);
        return  new ResponseEntity<>(raid, HttpStatus.OK);
    }
}