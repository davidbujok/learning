package com.biscuits.Tea_and_Biscuits.controller;

import com.biscuits.Tea_and_Biscuits.models.Biscuit;
import com.biscuits.Tea_and_Biscuits.repositories.BiscuitRepository;
import com.biscuits.Tea_and_Biscuits.repositories.TeasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BiscuitController {

    @Autowired
    BiscuitRepository biscuitRepository;

    @GetMapping(value = "/api/biscuits")
    public List<Biscuit> getBiscuits() {
        return biscuitRepository.findAll();
    }
    @GetMapping(value = "/api/biscuits/{id}")
    public Optional<Biscuit> getBiscuits(@PathVariable Long id) {
        return biscuitRepository.findById(id);
    }
    @PostMapping(value = "/api/biscuits")
    public Biscuit createBiscuit(@RequestBody Biscuit biscuit){
        return biscuitRepository.save(biscuit);
    }
    @DeleteMapping(value = "/api/biscuits/{id}")
    public void deleteTea(@PathVariable Long id){
        biscuitRepository.deleteById(id);
    }

}
