package com.employee.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.demo.entities.Employee;
import com.employee.demo.entities.EmployeeCompany;
import com.employee.demo.services.EmployeeService;

@Controller
@RequestMapping("/app/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/all")
	public String getEmployee(Model model) {
		List<Employee> employees=employeeService.getAll();
		model.addAttribute("employees",employees);
		System.out.println("Piyush: "+model);
		return "main/employee-list";
	}
	
	@GetMapping("/{id}")
	public String getEmployeeDetail(@PathVariable("id") Long id,Model model) {
		Employee emp;
		try {
			emp= employeeService.getEmployeeById(id);
		}
		catch(Exception e)
		{
			//No Employee exists with given id
			return null;
		}
		
		EmployeeCompany empDetails=employeeService.getEmployeeCompany(emp);
		model.addAttribute("empDetails",empDetails);
		return "main/employee-detail";
	}

}
