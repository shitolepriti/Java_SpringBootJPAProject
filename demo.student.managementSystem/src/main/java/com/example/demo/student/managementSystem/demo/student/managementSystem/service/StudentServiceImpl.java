package com.example.demo.student.managementSystem.demo.student.managementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.student.managementSystem.demo.student.managementSystem.entity.Student;
import com.example.demo.student.managementSystem.demo.student.managementSystem.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
@Autowired
	private StudentRepository studentRepo;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
		
	}

	public StudentServiceImpl(StudentRepository studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> studentList() {
		// TODO Auto-generated method stub
		List<Student>findAll=studentRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		Optional <Student>findById=studentRepo.findById(id);
		Student student=findById.get();
		
		return student;
	}

	@Override
	public Student updateVoter(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

}
