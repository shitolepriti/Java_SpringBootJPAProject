package com.example.demo.student.managementSystem.demo.student.managementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.student.managementSystem.demo.student.managementSystem.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
