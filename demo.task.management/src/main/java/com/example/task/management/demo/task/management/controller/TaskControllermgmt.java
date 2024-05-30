package com.example.task.management.demo.task.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.task.management.demo.task.management.entity.Task;
import com.example.task.management.demo.task.management.service.TaskServices;

import jakarta.validation.Valid;

@Controller
public class TaskControllermgmt {
	@Autowired
private TaskServices taskServices;

	@GetMapping("/taskassign")
	public String taskAssign(Model model) {
		model.addAttribute("task",new Task());
		return "taskAssign";
}
	@PostMapping("/taskstatus")
	public String getStatus(@Valid @ModelAttribute ("task") Task task , BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "taskAssign";
			
		}
		taskServices.saveTask(task);
		return "redirect:/adminlist";
}
}