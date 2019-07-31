package com.capgemini.beans;

import java.util.Map;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
	
	public void init()
	{
		System.out.println("From init method");
	}
	
	public void destroy()
	{
		System.out.println("From destroy");
	}
	

}
