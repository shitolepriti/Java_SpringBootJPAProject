package com.example.demo.student.managementSystem.demo.student.managementSystem.service;

import java.util.List;

import com.example.demo.student.managementSystem.demo.student.managementSystem.entity.Student;



public interface StudentService {

	
	public Student saveStudent(Student student);
	public List<Student>studentList();
	public void deleteById(int id);
	public Student findById(int id);
	public Student updateVoter(Student student);
}
