package com.codebase.file_folder_person_task.controllers;

import com.codebase.file_folder_person_task.models.File;
import com.codebase.file_folder_person_task.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFiles(@PathVariable Long id) {
        return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK);
    }
    @PostMapping(value = "/files")
    public ResponseEntity<File> createFile(@RequestBody File file ){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.OK);
    }
    @DeleteMapping(value = "/files/{id}")
    public ResponseEntity<File> deleteFiles(@PathVariable Long id) {
        return  new ResponseEntity<>(fileRepository.deleteById(id), HttpStatus.I_AM_A_TEAPOT)

    }


}
