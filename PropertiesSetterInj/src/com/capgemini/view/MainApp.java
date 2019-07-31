package com.capgemini.view;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		

		System.out.println(employee.getEmployeeNumber());

		System.out.println(employee.getName());
	}
}