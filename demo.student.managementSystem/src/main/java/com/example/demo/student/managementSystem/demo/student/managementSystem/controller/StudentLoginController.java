package com.example.demo.student.managementSystem.demo.student.managementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.student.managementSystem.demo.student.managementSystem.entity.Student;
import com.example.demo.student.managementSystem.demo.student.managementSystem.entity.StudentHome;
import com.example.demo.student.managementSystem.demo.student.managementSystem.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentLoginController {
	@Autowired
	private StudentService  studentService;


	@GetMapping("/studentlogin")
	public String getAdminLogin(Model model) {
		model.addAttribute("studenthome",new StudentHome());
		
		return "studenthome";
		
	}
	@PostMapping("/loginstatus")
	public String getLoginStatus(@Valid @ModelAttribute("studenthome") StudentHome studenthome, BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {
			return "studenthome";
		}
		List<Student> dbStudent=studentService.studentList();
		boolean found = false;
		for(Student st:dbStudent) {
			if(st.getUsername().equals(studenthome.getUsername())&& st.getPassword().equals(studenthome.getPassword() )) {
				found = true;
			}
		}
		if(found==true) {
				return "redirect:/studentlist";
			
			}else {
				model.addAttribute("error","Incorrect username or password");
				return "studenthome";
			}
		}
}