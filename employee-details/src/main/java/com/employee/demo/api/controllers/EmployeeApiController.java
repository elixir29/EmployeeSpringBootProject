package com.employee.demo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.entities.Employee;
import com.employee.demo.entities.EmployeeCompany;
import com.employee.demo.services.EmployeeService;


@RestController
@RequestMapping("/app-api/employees")
public class EmployeeApiController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/all")
	public List<Employee> getEmployee() {
		return employeeService.getAll();
	}
	
	@GetMapping("/{id}")
	public EmployeeCompany getEmployeeDetail(@PathVariable("id") Long id) {
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
		return empDetails;
	}
}
