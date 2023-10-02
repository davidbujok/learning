package com.practice_app_314.demo.controllers;

import com.practice_app_314.demo.models.Clothes;
import com.practice_app_314.demo.repositories.ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClothesController {

    @Autowired
    ClothesRepository clothesRepository;

    @GetMapping(value = "/clothes")
    public List<Clothes> getAllClothes() {
        return clothesRepository.findAll();
    }

    @GetMapping(value = "/clothes/{id}")
    public Optional<Clothes> getClothes(@PathVariable Long id){
        return clothesRepository.findById(id);
    }

    @PostMapping(value = "/clothes")
    public Clothes createClothes(@RequestBody Clothes clothes) {
        return clothesRepository.save(clothes);
    }

    @DeleteMapping(value = "/clothes/{id}")
    public void deleteCloths(@PathVariable Long id) {
        clothesRepository.deleteById(id);
    }

    @PutMapping(value = "/clothes/{id}")
    public Clothes updateCloths(@PathVariable Long id, @RequestBody Clothes newClothes) {
        return clothesRepository.findById(id).map(clothes -> {
            clothes.setName(newClothes.getName());
            clothes.setCategory(newClothes.getCategory());
            clothes.setPrice(newClothes.getPrice());
            clothes.setSize(newClothes.getSize());
            clothes.setPerson(newClothes.getPerson());
            return clothesRepository.save(clothes);
        }).orElseGet(() -> {
            newClothes.setId(id);
            return clothesRepository.save(new Clothes());
        });
    }
}

//        @PutMapping(value = "/pirates/{id}")
//        public Pirate replacePirate(@PathVariable Long id, @RequestBody Pirate newPirate){
//            return pirateRepository.findById(id).map(pirate -> {
//                pirate.setFirstName(newPirate.getFirstName());
//                pirate.setSecondName(newPirate.getSecondName());
//                pirate.setAge(newPirate.getAge());
//                return pirateRepository.save(pirate);
//            }).orElseGet(() -> {
//                newPirate.setId(id);
//                return pirateRepository.save(newPirate);
//            });
//        }

