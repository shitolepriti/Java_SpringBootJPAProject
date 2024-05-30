package com.example.task.management.demo.task.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.task.management.demo.task.management.entity.Admin;
import com.example.task.management.demo.task.management.entity.AdminHome;
import com.example.task.management.demo.task.management.service.AdminService;


import jakarta.validation.Valid;



@Controller
public class AdminLogin {
	@Autowired
private AdminService adminService;
	
	 @GetMapping("/adminlogin")
	    public String getLogin(Model model) {
	        model.addAttribute("adminhome", new AdminHome());
	        return "adminHome";
	    }
	 @PostMapping("/loginstatus")
	    public String getLogStatus(@Valid @ModelAttribute("adminhome")AdminHome adminhome, BindingResult bindingResult, Model model) {
	        if (bindingResult.hasErrors()) {
	            return "adminhome";
	        }
	      List<Admin>dbAdmin=adminService.adminList();
	     boolean found =false;
	     for(Admin ad:dbAdmin) {
if(ad.getName().equals(adminhome.getUsername())&&ad.getPassword().equals(adminhome.getPassword())) {
	found=true;
	
}
	     }
	     if(found==true) {
	    	 return "admindashboard";
	     }else {
	    	 model.addAttribute("error","Incorrect username or password");
	     return "adminhome";
	     }
}
}

