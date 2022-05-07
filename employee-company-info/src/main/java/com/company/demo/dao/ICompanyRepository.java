package com.company.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.company.demo.entities.Company;

public interface ICompanyRepository extends CrudRepository<Company, Long> {
	
	@Override
	public List<Company> findAll();

}
