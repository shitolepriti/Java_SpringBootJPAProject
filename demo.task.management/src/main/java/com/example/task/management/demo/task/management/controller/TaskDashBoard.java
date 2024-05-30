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
import com.example.task.management.demo.task.management.entity.Task;
import com.example.task.management.demo.task.management.service.TaskServices;

import jakarta.validation.Valid;

@Controller
public class TaskDashBoard {
	@Autowired
private TaskServices taskServices;

	@GetMapping("/tasklist")
public String getTaskList(Model model) {
List<Task>tasklist=taskServices.TaskList();
model.addAttribute("tasklist",tasklist);

return "tasks";

}

	@PostMapping("/task/delete")
	public String getdelete(@RequestParam("id") int id, Model model) {
		taskServices.deleteById(id);
		String Deletemessage="task suceessfully delete with id :"+ id;
		model.addAttribute("message",Deletemessage);
		return "tasks";	
	}	
	@GetMapping("/task/edit")
public String getEdit(@RequestParam("id") int id ,Model model) {
	Task task=	taskServices.findById(id);
	
	model.addAttribute("task",task);
	
return "update-task";	
}
	@PostMapping("/savetaskupdate")
	public String getUpdate(@Valid @ModelAttribute("task") Task task,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "update-task";
			}
		taskServices.updateTask(task);
		return "redirect:/tasklist";
	}
}
