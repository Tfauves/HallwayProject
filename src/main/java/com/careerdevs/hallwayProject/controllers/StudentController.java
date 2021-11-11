package com.careerdevs.hallwayProject.controllers;


import com.careerdevs.hallwayProject.models.Student;
import com.careerdevs.hallwayProject.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public @ResponseBody List<Student> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Student findById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/cohort/{cohort}")
    public ResponseEntity<List<Student>> findByCohort(@PathVariable Integer cohort) {
        return new ResponseEntity<>(repository.findByCohort(cohort, Sort.by("lastName")), HttpStatus.OK);
    }


}
