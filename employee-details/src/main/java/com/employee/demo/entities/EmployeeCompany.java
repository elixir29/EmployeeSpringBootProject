package com.employee.demo.entities;

public class EmployeeCompany {
	
	long empId;
	String name;
	String address;
	long companyId;
	long salary;
	String designation;
	
	public EmployeeCompany()
	{
		
	}
	
	
	public EmployeeCompany(long empId, String name, String address, long companyId, long salary, String designation) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.companyId = companyId;
		this.salary = salary;
		this.designation = designation;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", name=" + name + ", address=" + address + ", companyId="
				+ companyId + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	

}
