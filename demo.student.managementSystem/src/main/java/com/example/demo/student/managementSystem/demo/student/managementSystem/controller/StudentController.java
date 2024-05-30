package com.example.demo.student.managementSystem.demo.student.managementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.student.managementSystem.demo.student.managementSystem.entity.Student;
import com.example.demo.student.managementSystem.demo.student.managementSystem.service.StudentService;

import jakarta.validation.Valid;
@Controller
public class StudentController {
	@Autowired
private StudentService studentService;
@GetMapping("/studentreg")
	public String regiStudent(Model model) {
		model.addAttribute("student",new Student());
		return "studentReg";
		
		
	}
@PostMapping("/status")
public String getStatus(@Valid @ModelAttribute ("student") Student student , BindingResult bindingResult) {
	if(bindingResult.hasErrors()) {
		return "studentReg";
		
	}
	studentService.saveStudent(student);
	return "redirect:/studentlogin";
}
	
}
