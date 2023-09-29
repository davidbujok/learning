package com.biscuits.Tea_and_Biscuits.controller;

import com.biscuits.Tea_and_Biscuits.models.Tea;
import com.biscuits.Tea_and_Biscuits.repositories.TeasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TeaController {

    @Autowired
    TeasRepository teasRepository;

    @GetMapping(value = "/api/teas")
    public List<Tea> getAllTeas(){
        return teasRepository.findAll();
    }

    @GetMapping(value = "/api/teas/{id}")
    public Optional<Tea> getTea(@PathVariable Long id){
        return teasRepository.findById(id);
     }

    @PostMapping(value = "/api/teas")
    public Tea createTea(@RequestBody Tea tea){
        return teasRepository.save(tea);
    }

    @DeleteMapping(value = "/api/teas/{id}")
       public void deleteTea(@PathVariable Long id){
        teasRepository.deleteById(id);
    }
    @PutMapping(value = "/api/teas/{id}")
        public ResponseEntity<Tea> replaceTea(@PathVariable long id, @RequestBody Tea newTea) {
            Tea replaceTea = teasRepository.findById(id)
                    .orElseGet(() -> newTea);
        replaceTea.setName(newTea.getName());
        replaceTea.setBrandName(newTea.getBrandName());
        teasRepository.save(replaceTea);
        return ResponseEntity.ok(replaceTea);
    }
//    @PutMapping(value = "/api/teas/{id}")
//    public Tea replaceTea(@PathVariable Long id, @RequestBody Tea newTea){
//        return teasRepository.findById(id).map(tea -> {
//            tea.setName(newTea.getName());
//            tea.setBrandName(newTea.getBrandName());
//            return teasRepository.save(tea);
//        }).orElseGet(()-> {
//            newTea.setId(id);
//            return teasRepository.save(newTea);
//        });
}
//    @PutMapping(value = "/pirates/{id}")
//    public Pirate replacePirate(@PathVariable Long id, @RequestBody Pirate newPirate){
//        return pirateRepository.findById(id).map(pirate -> {
//            pirate.setFirstName(newPirate.getFirstName());
//            pirate.setSecondName(newPirate.getSecondName());
//            pirate.setAge(newPirate.getAge());
//            return pirateRepository.save(pirate);
//        }).orElseGet(() -> {
//            newPirate.setId(id);
//            return pirateRepository.save(newPirate);
//        });
