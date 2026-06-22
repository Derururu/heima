package com.jason.grade_api.repository;
import com.jason.grade_api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findBySubject(String subject);
}