package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Employee;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Employee employee = (Employee)context.getBean("Employee", Employee.class);

		System.out.println(employee.getName());
		System.out.println(employee.getEmployeeNumber());
		System.err.println(employee.getAddress().getCity());
	}
}
