package com.example.demo.repositery;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositery extends JpaRepository<Student,Integer> {
}
