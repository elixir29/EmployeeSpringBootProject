package com.company.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.demo.dao.ICompanyRepository;
import com.company.demo.entities.Company;

@Service
public class CompanyService {
	
	@Autowired
	ICompanyRepository compRepo;
	
	public List<Company> getAll() {
		return compRepo.findAll();
	}

}
