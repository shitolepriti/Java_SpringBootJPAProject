package com.example.task.management.demo.task.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.task.management.demo.task.management.entity.Admin;
import com.example.task.management.demo.task.management.service.AdminService;


import jakarta.validation.Valid;



@Controller
public class AdminDashBoard {
	@Autowired
private AdminService adminService;

	@GetMapping("/adminlist")
public String getAdminList(Model model) {
List<Admin>adminlist=	adminService.adminList();
model.addAttribute("adminlist",adminlist);

return "admins";

}
	@PostMapping("/admin/delete")
	public String getdelete(@RequestParam("id") int id, Model model) {
		adminService.deleteById(id);
		String Deletemessage="admin suceessfully delete with id :"+ id;
		model.addAttribute("message",Deletemessage);
		return "admins";	
	}
	@GetMapping("/admin/edit")
public String getEdit(@RequestParam("id") int id ,Model model) {
	Admin admin=	adminService.findById(id);
	
	model.addAttribute("admin",admin);
	
return "update-admin";	
}
	@PostMapping("/saveupdate")
	public String getUpdate(@Valid @ModelAttribute("admin") Admin admin,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "update-admin";
			}
		adminService.updateAdmin(admin);
		return "redirect:/adminlist";
	}
}
