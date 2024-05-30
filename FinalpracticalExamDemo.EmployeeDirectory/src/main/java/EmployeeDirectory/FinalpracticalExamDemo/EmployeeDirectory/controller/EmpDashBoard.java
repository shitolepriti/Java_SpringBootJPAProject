package EmployeeDirectory.FinalpracticalExamDemo.EmployeeDirectory.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



import EmployeeDirectory.FinalpracticalExamDemo.EmployeeDirectory.entity.Employee;
import EmployeeDirectory.FinalpracticalExamDemo.EmployeeDirectory.services.EmployeeServices;
import jakarta.validation.Valid;

@Controller
public class EmpDashBoard {
	@Autowired
private EmployeeServices employeeServices;
	@GetMapping("/employeelist")
public String getEmpList(Model model) {
List<Employee>employeelist=	employeeServices.employeeList();
model.addAttribute("employeelist",employeelist);

return "employees";

}
	@PostMapping("/employee/delete")
	public String getdelete(@RequestParam("id") int id, Model model) {
		employeeServices.deleteById(id);
		String Deletemessage="employee suceessfully delete with id :"+ id;
		model.addAttribute("message",Deletemessage);
		return "employees";	
	}
	@GetMapping("/employee/edit")
public String getEdit(@RequestParam("id") int id ,Model model) {
	Employee employee=	employeeServices.findById(id);
	
	model.addAttribute("employee",employee);
	
return "update-employee";	
}
	@PostMapping("/saveupdate")
	public String getUpdate(@Valid @ModelAttribute("employee") Employee employee,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "update-employee";
			}
		employeeServices.updateEmployee(employee);
		return "redirect:/employeelist";
	}
	
}
