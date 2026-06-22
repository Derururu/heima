package com.jason.grade_api.service;

import com.jason.grade_api.model.Student;
import com.jason.grade_api.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getALl(){
        return repo.findAll();
    }
    public Student getById(Long id){
        return repo.findById(id).get();
    }
    public Student create(Student s){
        return repo.save(s);
    }
    public void deleteStudent (Long id){
        repo.deleteById(id);
    }

    public List<Student> getBySubject(String subject){
        return repo.findBySubject(subject);
    }

}