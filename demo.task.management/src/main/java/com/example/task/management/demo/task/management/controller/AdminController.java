package com.example.task.management.demo.task.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.task.management.demo.task.management.entity.Admin;
import com.example.task.management.demo.task.management.service.AdminService;

import jakarta.validation.Valid;

@Controller
public class AdminController {
	@Autowired
private AdminService adminService;

	@GetMapping("/adminreg")
	public String regiAdmin(Model model) {
		model.addAttribute("admin",new Admin());
		return "adminReg";
		
		
	}
	@PostMapping("/status")
	public String getStatus(@Valid @ModelAttribute ("admin") Admin admin , BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "adminReg";
			
		}
		adminService.saveStudent(admin);
		return "redirect:/adminlogin";
	}
}
