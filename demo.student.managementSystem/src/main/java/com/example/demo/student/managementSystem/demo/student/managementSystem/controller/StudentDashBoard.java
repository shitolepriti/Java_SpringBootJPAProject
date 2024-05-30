package com.example.demo.student.managementSystem.demo.student.managementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.student.managementSystem.demo.student.managementSystem.entity.Student;
import com.example.demo.student.managementSystem.demo.student.managementSystem.service.StudentService;


import jakarta.validation.Valid;

@Controller
public class StudentDashBoard {
	@Autowired
public StudentService studentService;
	@GetMapping("/studentlist")
public String getStudentList(Model model) {
	List<Student>studentlist=studentService.studentList();
	model.addAttribute("studentlist",studentlist);
	
	return "studentOperation";
	
}
	@GetMapping("/student/delete")
	
	public String getDelete(@RequestParam("id") int id, Model model) {
		studentService.deleteById(id);
		String DeleteMessage="student susseccfully deleted with id :"+id;
		model.addAttribute("message",DeleteMessage);
		return "studentOperation";
		
	}
	@GetMapping("/student/edit")
public String getEditStudent(@RequestParam("id") int id ,Model model) {
	Student student=studentService.findById(id);
	model.addAttribute("student",student);
	return "update-student";
	
	
	
}
	@PostMapping("/saveupdate")
	public String getUpdate(@Valid @ModelAttribute("student") Student student,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "update-student";
			}
		return "redirect:/studentlist";
		
	}

}
