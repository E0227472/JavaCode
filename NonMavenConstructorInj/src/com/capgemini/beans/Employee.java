package com.capgemini.beans;

public class Employee {
	private int employeeNumber;
	private String name;
	private Address address;
	
	public Employee(int employeeNumber, String name, Address address) {
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private Employee () {
		System.out.println("Employee constructor is invoked");
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
