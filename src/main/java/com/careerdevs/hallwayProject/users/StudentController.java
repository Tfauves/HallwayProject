package com.careerdevs.hallwayProject.users;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;


@RestController
@RequestMapping("/students")
public class StudentController {

    private AtomicLong idCounter = new AtomicLong();
    private Map<Long, Student> students = new HashMap<>();

    public StudentController() {
        Long id = idCounter.incrementAndGet();
        students.put(id, new Student(id, "Jasper", "Canine", "JJK9"));

    }

    @GetMapping
    public List<Student> all() {
        return new ArrayList<Student>(students.values());
    }

    @PostMapping
    public Student newStudent(@RequestBody Student newStudent) {
        Long id = idCounter.incrementAndGet();
        newStudent.setId(id);
        students.put(id, newStudent);
        return newStudent;
    }

    @GetMapping("/{id}")
    public Student student(@PathVariable Long id) {
        return students.get(id);
    }


}
