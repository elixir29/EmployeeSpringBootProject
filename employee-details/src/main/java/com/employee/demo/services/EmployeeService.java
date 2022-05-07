package com.employee.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.company.demo.entities.Company;
import com.employee.demo.dao.IEmployeeRepository;
import com.employee.demo.entities.Employee;
import com.employee.demo.entities.EmployeeCompany;

@Service
public class EmployeeService {
	
	@Autowired
	IEmployeeRepository empRepo;
	
	@Value("${url}")
	String url;
	
	public List<Employee> getAll() {
		return empRepo.findAll();
	}
	
	public Employee getEmployeeById(long id) {
		return empRepo.findById(id).get();
	}
	
	public EmployeeCompany getEmployeeCompany(Employee emp){
		RestTemplate restTemplate=new RestTemplate();
		Company[] companyDetails= restTemplate.getForObject(url, Company[].class);
		
		EmployeeCompany empDetails=new EmployeeCompany();
		
		empDetails.setEmpId(emp.getId());
		empDetails.setName(emp.getName());
		empDetails.setAddress(emp.getAddress());
		
		for(Company cmp:companyDetails)
		{
			if(cmp.getUsrId()==emp.getId())
			{
				empDetails.setCompanyId(cmp.getCompanyId());
				empDetails.setSalary(cmp.getSalary());
				empDetails.setDesignation(cmp.getDesignation());
				break;
			}
		}
		return empDetails;
	}
}
