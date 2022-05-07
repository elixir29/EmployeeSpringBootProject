package com.employee.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.employee.demo.dao.IEmployeeRepository;
import com.employee.demo.entities.Employee;

@SpringBootApplication
public class EmployeeDetailsApplication {

	@Autowired
	IEmployeeRepository empRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeDetailsApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args ->{
			Employee emp1=new Employee(1,"Piyush","Delhi");
			Employee emp2=new Employee(2,"Aayush","Delhi");
			Employee emp3=new Employee(3,"Vaibhav","Pune");
			Employee emp4=new Employee(4,"Saksham","Mumbai");
			Employee emp5=new Employee(5,"Neev","Shimla");
			Employee emp6=new Employee(6,"Nishtha","Jaipur");
			Employee emp7=new Employee(7,"Vicky","Chennai");
			Employee emp8=new Employee(8,"Tillo","Masoori");
			Employee emp9=new Employee(9,"Aakash","Kolkata");
			
			empRepo.save(emp1);
			empRepo.save(emp2);
			empRepo.save(emp3);
			empRepo.save(emp4);
			empRepo.save(emp5);
			empRepo.save(emp6);
			empRepo.save(emp7);
			empRepo.save(emp8);
			empRepo.save(emp9);

		};
	}


}
