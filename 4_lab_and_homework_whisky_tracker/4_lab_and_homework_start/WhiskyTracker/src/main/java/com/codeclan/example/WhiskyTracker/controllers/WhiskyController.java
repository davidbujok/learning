package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/whiskies")
    public ResponseEntity <List<Whisky>> getWhiskies(@RequestParam(name="year", required = false) Integer year) {
        if (year == null){
            return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(whiskyRepository.findByYear(year), HttpStatus.OK);
        }
    }
    @GetMapping(value = "/distiller/whiskies")
    public ResponseEntity <List<Whisky>> getWhiskiesDistilleries(@RequestParam(name="distillery", required = false) String distillery,
                                                     @RequestParam(name = "age", required = false) Integer age ) {
        if (distillery == null && age != null) {
            return new ResponseEntity<>(whiskyRepository.findByAge(age), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(whiskyRepository.findByDistilleryNameAndAge(distillery, age), HttpStatus.OK);
        }
    }

    @GetMapping(value = "/whiskies/region")
    public ResponseEntity<List<Whisky>> getAllWhiskiesByRegion(@RequestParam(name="region", required = false) String region){
        return new ResponseEntity<>(whiskyRepository.findByDistilleryRegion(region), HttpStatus.OK);
    }


}
