package com.cts.spring.springcoreadvanced.autowiring;

public class Employee {

	public Employee(Address address1, Department department) {
		this.address = address1;
		this.department = department;
	}

	private Address address;
	private Department department;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address1) {
		this.address = address1;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", department=" + department + "]";
	}
}
