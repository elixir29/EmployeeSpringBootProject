package com.company.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.demo.entities.Company;
import com.company.demo.services.CompanyService;

@RestController
@RequestMapping("/app-api/company")
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@GetMapping("/details")
	public List<Company> getCompany() {
		return companyService.getAll();
	}

}
