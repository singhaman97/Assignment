package com.example.project.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	public String EmployeeName;
	public String Address;
	public String Salary;
	public String Department;
	public String Pincode;
    public String State;
    public String Country;
    
	public Employee() {}

	public Employee(String employeeName, String address, String salary, String department, String pincode, String state,
			String country) {
		super();
		EmployeeName = employeeName;
		Address = address;
		Salary = salary;
		Department = department;
		Pincode = pincode;
		State = state;
		Country = country;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getPincode() {
		return Pincode;
	}

	public void setPincode(String pincode) {
		Pincode = pincode;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
    
	
    
}
