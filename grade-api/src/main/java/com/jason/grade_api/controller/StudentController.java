package com.jason.grade_api.controller;

import com.jason.grade_api.model.Student;
import com.jason.grade_api.service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAll() { return service.getALl(); }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) { return service.getById(id); }

    @GetMapping("/subject/{subject}")
    public List<Student> getBySubject(@PathVariable String subject) { return service.getBySubject(subject); }

    @PostMapping
    public Student create(@RequestBody Student s) { return service.create(s); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteStudent(id); }
}