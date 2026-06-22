package com.jason.grade_api.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String subject;
    private Double grade;

    public Student() {}

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getSubject() { return subject; }
    public Double getGrade() { return grade; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setGrade(Double grade) { this.grade = grade; }
}