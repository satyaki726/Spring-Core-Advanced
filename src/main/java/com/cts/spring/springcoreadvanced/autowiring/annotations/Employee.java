package com.cts.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	//Field Level
	@Autowired
	@Qualifier("address12")
	private Address address;
	@Autowired
	@Qualifier("department12")
	private Department department;

	public Address getAddress() {
		return address;
	}

	/*
	// Setter Level
	@Autowired
	@Qualifier("address12")
	public void setAddress(Address address1) {
		this.address = address1;
	}
	*/
	public Department getDepartment() {
		return department;
	}

	/*
	// Setter Level
	@Autowired
	@Qualifier("department12")
	public void setDepartment(Department department) {
		this.department = department;
	}
    */
	
	/*
	// Constructor Level
	@Autowired
	public Employee(Address address1, Department department) {
		this.address = address1;
		this.department = department;
	}
	*/
	
	@Override
	public String toString() {
		return "Employee [address=" + address + ", department=" + department + "]";
	}
}
