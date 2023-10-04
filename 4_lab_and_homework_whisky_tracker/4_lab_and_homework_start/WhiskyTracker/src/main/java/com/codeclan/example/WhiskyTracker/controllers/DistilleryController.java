package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/distilleries")
    public ResponseEntity getDistilleries(@RequestParam(name="region", required = false) String region){
        if (region == null){
            return new ResponseEntity<>(distilleryRepository.findAll(), HttpStatus.OK);
        } else  {
            return new ResponseEntity(distilleryRepository.findDistilleryByRegion(region), HttpStatus.OK);
        }
    }

    @GetMapping(value = "/distilleries/whisky")
    public ResponseEntity getDistilleriesWithWhiskyOlderThan(@RequestParam(name = "age", required = false) Integer age){
        return new ResponseEntity<>(distilleryRepository.findByWhiskiesAgeGreaterThan(age), HttpStatus.OK);
    }

}
