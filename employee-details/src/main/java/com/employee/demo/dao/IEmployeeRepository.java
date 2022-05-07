package com.employee.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.employee.demo.entities.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
	
	@Override
	public List<Employee> findAll();

}
