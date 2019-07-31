package com.capgemini.beans;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	private int employeeNumber;
	private String name;
	private Map<String,Address> address;
	
	public Map<String, Address> getAddress() {
		return address;
	}
	public void setAddress(Map<String, Address> address) {
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
	
	@PostConstruct
    public void initializeCircle()
    {
    	System.out.println("Init from employee");
    }
	@PreDestroy
    public void destroyCircle()
    {
    	System.out.println("Destroy from employee");
    }
	

}
