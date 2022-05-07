package com.company.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.company.demo.dao.ICompanyRepository;
import com.company.demo.entities.Company;

@SpringBootApplication
public class EmployeeCompanyInfoApplication {

	@Autowired
	ICompanyRepository compRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeCompanyInfoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args ->{
			Company cmp1=new Company(1, 1, 25000,"SDE1");
			Company cmp2=new Company(1, 2, 25000,"SDE1");
			Company cmp3=new Company(1, 3, 25000,"SDE1");
			Company cmp4=new Company(2, 4, 25000,"SDE1");
			Company cmp5=new Company(2, 5, 25000,"SDE1");
			Company cmp6=new Company(2, 6, 25000,"SDE1");
			Company cmp7=new Company(2, 7, 25000,"SDE1");
			Company cmp8=new Company(3, 8, 25000,"SDE1");
			Company cmp9=new Company(3, 9, 25000,"SDE1");
			
			compRepo.save(cmp1);
			compRepo.save(cmp2);
			compRepo.save(cmp3);
			compRepo.save(cmp4);
			compRepo.save(cmp5);
			compRepo.save(cmp6);
			compRepo.save(cmp7);
			compRepo.save(cmp8);
			compRepo.save(cmp9);
		};
	}

}
